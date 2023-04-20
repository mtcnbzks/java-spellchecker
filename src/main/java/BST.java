import java.util.ArrayList;

public class BST<T extends Comparable<T>> {
   Functions functions = new Functions();

   static class Node<T> {
      T data;
      Node<T> left, right;

      Node(T data) {
         this.data = data;
      }
   }

   Node<T> root;

   void insert(T word) {
      Node<T> newNode = new Node<T>(word);

      if (root == null) {
         root = newNode;
         return;
      }

      Node<T> current = root;
      while (true) {
         if (functions.levenshteinDistance((String) word, (String) current.data) <= 2) {
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

   void inOrderTraversal() {
      inOrderTraversal(root);
   }

   private void inOrderTraversal(Node<T> node) {
      if (node != null) {
         inOrderTraversal(node.left);
         System.out.print(node.data + " ");
         inOrderTraversal(node.right);
      }
   }

   ArrayList<String> getClosestWords(String word) {
      ArrayList<String> closestWords = new ArrayList<>();

      Node<T> current = root;

      while (current != null) {
         if (functions.levenshteinDistance(word, (String) current.data) <= 2) {
            if (word.equals(current.data))
               continue;
            closestWords.add((String) current.data);
            current = current.left;
         } else {
            current = current.right;
         }
      }

      return closestWords;

   }

}
