public class LevenshteinDistance {
   public static void main(String[] args) {
      System.out.println(levenshteinDistance("kitten", "sitting"));
   }

   static int levenshteinDistance(String word1, String word2) {
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
