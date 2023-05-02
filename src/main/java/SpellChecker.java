import java.io.*;
import java.util.Objects;

public class SpellChecker {

   public BST<String> getWords() {
      BST<String> wordsBST = new BST<>();

      String fileName = "/unsorted_words.txt";

      // we are using try-with-resources to close the buffered reader automatically
      // we are using getResourceAsStream() method to read the file from the resources
      // folder. this method works everywhere, IntelliJ, Eclipse, JAR file, etc.
      try (BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream(fileName))))) {

         String line;
         while ((line = bufferedReader.readLine()) != null) {
            wordsBST.insert(line.trim()); // adding words to the BST
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
      return wordsBST;
   }

   public BST<String> getClosestWords(BST<String> wordsBST, String word) {
      return inorderInsert(wordsBST, word); // inserting words into the BST
   }

   public String getClosestWord(BST<String> closestWords, String word) {
      // if the word is in the dictionary, return the word else return the closest
      return closestWords.isWordInDictionary(word) ? word : closestWords.root.word;
   }

   public BST<String> getKClosestWords(BST<String> closestWords, int k) {
      BST<String> kClosestWords = new BST<>();

      StringBuilder sb = closestWords.inOrderTraversalToString(); // convert closestWords BST to StringBuilder

      int count = 0;
      for (String word : sb.toString().split(" ")) { // split the StringBuilder by space
         if (count < k) { // if count is less than k, insert the word into the kClosestWords BST
            kClosestWords.insert(word);
            count++;
         }
      }

      return kClosestWords;

   }

   private BST<String> inorderInsert(BST<String> wordsBST, String word) {
      // recursive method to traverse the BST in order and insert the words into the
      // closestWordsBST
      BST<String> closestWords = new BST<>();
      inorderInsert(wordsBST.root, closestWords, word); // inserting words into the BST
      return closestWords;
   }

   private void inorderInsert(BST.Node<String> node, BST<String> closestWordsBST, String word) {
      // traverse the BST in order and insert the words into the closestWordsBST
      // according to the levenshtein distance

      boolean isFirstCharUppercase = Character.isUpperCase(word.charAt(0));
      if (node != null) {
         inorderInsert(node.left, closestWordsBST, word);

         // if the levenshtein distance is less than or equal to 2, insert the word into
         if (levenshteinDistance(word, node.word) <= 2) {
            if (isFirstCharUppercase) {
               closestWordsBST.insert(node.word.substring(0, 1).toUpperCase() + node.word.substring(1));
            } else {
               closestWordsBST.insert(node.word);
            }
         }

         inorderInsert(node.right, closestWordsBST, word);
      }
   }

   public int levenshteinDistance(String word1, String word2) {
      // if the words are the same, return 0
      if (word1.equalsIgnoreCase(word2)) {
         return 0;
      }

      int lenWord1 = word1.length(), lenWord2 = word2.length();
      int[][] matrix = new int[lenWord1 + 1][lenWord2 + 1];

      // initialize the matrix
      for (int i = 0; i <= lenWord1; i++) {
         matrix[i][0] = i;
      }

      // initialize the matrix
      for (int j = 0; j <= lenWord2; j++) {
         matrix[0][j] = j;
      }

      // fill the matrix according to the levenshtein distance algorithm
      for (int i = 1; i <= lenWord1; i++) {
         for (int j = 1; j <= lenWord2; j++) {
            int cost = word1.charAt(i - 1) != word2.charAt(j - 1) ? 1 : 0;
            matrix[i][j] = Math.min(matrix[i - 1][j] + 1, Math.min(matrix[i][j - 1] + 1, matrix[i - 1][j - 1] + cost));
         }
      }
      return matrix[lenWord1][lenWord2];
   }
}
