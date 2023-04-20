import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Functions {

   static ArrayList<String> dictionary = new ArrayList<>();

   public static void main(String[] args) {
      Functions bu = new Functions();
      dictionary = getWords();
      BST<String> bst = new BST<>();
      System.out.println(bu.levenshteinDistance("elif", "mehmetcan"));

      bst.insert("ahmet");
      bst.insert("elif");
      bst.insert("elifnaz");
      bst.insert("mehmetcan");
      bst.insert("mehmetc");
      bst.inOrderTraversal();
      System.out.println();

      System.out.println(bst.getClosestWords("elifnur"));

   }

   public int levenshteinDistance(String word1, String word2) {
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

   static ArrayList<String> getWords() {
      try (BufferedReader bufferedReader = new BufferedReader(
            new FileReader("src/main/resources/words_sorted.txt"))) {
         return (ArrayList<String>) bufferedReader.lines().collect(Collectors.toList());
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return null;
   }

   static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }

}
