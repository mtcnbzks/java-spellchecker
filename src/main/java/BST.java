import java.util.ArrayList;

public class BST<T extends Comparable<T>> {
   Functions functions = new Functions();

   public static class Node<T> {
      T word;
      Node<T> left, right;

      Node(T data) {
         this.word = data;
      }
   }

   Node<T> root;

   void insert(T word) {
      Node<T> newNode = new Node<>(word);

      if (root == null) {
         root = newNode;
         return;
      }

      Node<T> current = root;
      while (true) {
         if (functions.levenshteinDistance((String) word, (String) current.word) <= 2) {
            if (current.left == null) {
               current.left = newNode;
               return;
            }
            current = current.left;
         } else {
            if (current.right == null) {
               current.right = newNode;
               return;
            }
            current = current.right;
         }
      }
   }

   Node<T> search(T word) {
      Node<T> current = root;

      while (current != null) {
         if (current.word.equals((String) word)) {
            return current;
         } else if (functions.levenshteinDistance((String) word, (String) current.word) <= 2) {
            current = current.left;
         } else {
            current = current.right;
         }
      }
      return null;
   }

   void inOrderTraversal() {
      inOrderTraversal(root);
   }

   private void inOrderTraversal(Node<T> node) {
      if (node != null) {
         inOrderTraversal(node.left);
         System.out.print(node.word + " ");
         inOrderTraversal(node.right);
      }
   }

   ArrayList<String> getClosestWords(String word, int k) {
      word = word.toLowerCase();
      ArrayList<String> closestWords = new ArrayList<>();

      int count = 0;

      Node<T> current = root;

      while (current != null && count < k) {
         if (functions.levenshteinDistance(word, (String) current.word) <= 2) {
            if (word.equals(current.word))
               continue;
            closestWords.add((String) current.word);
            count++;
            current = current.left;
         } else {
            current = current.right;
         }
      }

      return closestWords;

   }

}
