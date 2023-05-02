import java.io.*;
import java.util.Objects;

public class SpellChecker {

   public static void main(String[] args) {
      SpellChecker sp = new SpellChecker();

      BST<String> wordsBST = sp.getWords();

      BST<String> closestWordsBST = sp.getClosestWords(wordsBST, "karl");
      BST<String> KClosestWords = sp.getKClosestWords(closestWordsBST, 3);
      KClosestWords.inOrderTraversal();

   }

   public BST<String> getWords() {
      BST<String> wordsBST = new BST<>();

      String fileName = "/unsorted_words.txt";
      try (BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream(fileName))))) {

         String line;
         while ((line = bufferedReader.readLine()) != null) {
            wordsBST.insert(line.trim());
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
      return wordsBST;
   }

   public BST<String> getClosestWords(BST<String> wordsBST, String word) {
      return inorderInsert(wordsBST, word);
   }

   public String getClosestWord(BST<String> closestWords, String word) {
      return closestWords.isWordInDictionary(word) ? word : closestWords.root.word;
   }

   public BST<String> getKClosestWords(BST<String> closestWords, int k) {
      BST<String> kClosestWords = new BST<>();

      StringBuilder sb = closestWords.inOrderTraversalToString();

      int count = 0;
      for (String word : sb.toString().split(" ")) {
         if (count < k) {
            kClosestWords.insert(word);
            count++;
         }
      }

      return kClosestWords;

   }

   private BST<String> inorderInsert(BST<String> wordsBST, String word) {
      BST<String> closestWords = new BST<>();
      inorderInsert(wordsBST.root, closestWords, word);
      return closestWords;
   }

   private void inorderInsert(BST.Node<String> node, BST<String> closestWordsBST, String word) {
      if (node != null) {
         inorderInsert(node.left, closestWordsBST, word);
         if (levenshteinDistance(word, node.word) <= 2) {
            closestWordsBST.insert(node.word);
         }
         inorderInsert(node.right, closestWordsBST, word);
      }
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
