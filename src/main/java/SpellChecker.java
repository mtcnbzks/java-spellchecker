import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellChecker {
   public static void main(String[] args) {
      SpellChecker sp = new SpellChecker();

      String selectedText = "kal";
      int k = 5;

      BST<String> closestWords = sp.getClosestWords(selectedText, k);
      closestWords.inOrderTraversal();

   }

   public BST<String> getClosestWords(String word) {
      String filePath = "src/main/resources/ortak_kelimeler.txt";

      BST<String> closestWordsBST = new BST<>();
      try (BufferedReader bufferedReader = new BufferedReader(
            new FileReader(filePath))) {
         String line;
         while ((line = bufferedReader.readLine()) != null) {
            int distance = levenshteinDistance(word, line);
            if (distance == 1)
               closestWordsBST.insert(line.trim());
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
      return closestWordsBST;
   }

   public BST<String> getClosestWords(String word, int k) {
      String filePath = "src/main/resources/ortak_kelimeler.txt";

      int count = 0;
      BST<String> closestWordsBST = new BST<>();
      try (BufferedReader bufferedReader = new BufferedReader(
            new FileReader(filePath))) {
         String line;
         while ((line = bufferedReader.readLine()) != null && count < k) {
            int distance = levenshteinDistance(word, line);
            if (distance == 1) {
               closestWordsBST.insert(line.trim());
               count++;
            }

         }

      } catch (IOException e) {
         e.printStackTrace();
      }
      return closestWordsBST;
   }

   String getClosestWord(BST<String> closestWordsBST, String word) {
      BST.Node<String> current = closestWordsBST.root;
      String closestWord = current.word;

      while (current != null) {
         int distance = levenshteinDistance(word, current.word);
         int closestDistance = levenshteinDistance(word, closestWord);

         if (distance < closestDistance) {
            closestWord = current.word;
         }
         current = current.left;
      }
      return closestWord;
   }

   public int levenshteinDistance(String word1, String word2) {
      if (word1.equalsIgnoreCase(word2)) {
         return 0;
      }

      int lenWord1 = word1.length(), lenWord2 = word2.length();
      int[][] matrix = new int[lenWord1 + 1][lenWord2 + 1];

      for (int i = 0; i <= lenWord1; i++) {
         matrix[i][0] = i;
      }

      for (int j = 0; j <= lenWord2; j++) {
         matrix[0][j] = j;
      }

      for (int i = 1; i <= lenWord1; i++) {
         for (int j = 1; j <= lenWord2; j++) {
            int cost = word1.charAt(i - 1) != word2.charAt(j - 1) ? 1 : 0;
            matrix[i][j] = Math.min(matrix[i - 1][j] + 1, Math.min(matrix[i][j - 1] + 1, matrix[i - 1][j - 1] + cost));
         }
      }
      return matrix[lenWord1][lenWord2];
   }
}
