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

   boolean delete(T word) {
      Node<T> current = root;
      Node<T> parent = null;

      // find target's Node
      while (current != null && !current.word.equals(word)) {
         parent = current;
         if (functions.levenshteinDistance((String) word, (String) current.word) <= 2) {
            current = current.left;
         } else {
            current = current.right;
         }
      }

      // if target not found return false.
      if (current == null) {
         return false;
      }

      // Case 1: If node has no child, just delete it
      if (current.left == null && current.right == null) {
         if (current == root) {
            root = null;
         } else if (current == parent.left) {
            parent.left = null;
         } else {
            parent.right = null;
         }
      }

      // Case 2: If node has one child, replace the node with its child
      else if (current.left == null || current.right == null) {
         Node<T> child = current.left == null ? current.right : current.left;
         if (current == root) {
            root = child;
         } else if (parent == current.left) {
            parent.left = child;
         } else {
            parent.right = child;
         }
      }

      // Case 3: If node has two children, replace the node's value with the
      // successor's value
      else {
         Node<T> successor = findSuccessor(current);
         current.word = successor.word;
         delete(successor.word);
      }
      return true;

   }

   private Node<T> findSuccessor(Node<T> node) {
      Node<T> current = node.right;

      while (current.left != null) {
         current = current.left;
      }

      return current;
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
