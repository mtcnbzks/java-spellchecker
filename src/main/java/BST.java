public class BST<T> {
   SpellChecker SpellChecker = new SpellChecker();

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
         // if the distance between the word and the current node's word is less than or
         // equal to 2 insert the word into the left subtree of the current node
         // otherwise insert the word into the right subtree of the current node
         int distance = SpellChecker.levenshteinDistance(word.toString(), current.word.toString());
         if (distance <= 2) {
            if (current.left == null) {
               current.left = newNode;
               break;
            }
            current = current.left;
         } else {
            if (current.right == null) {
               current.right = newNode;
               break;
            }
            current = current.right;
         }
      }
   }

   Node<T> search(T word) {
      Node<T> current = root;

      while (current != null) {
         int distance = SpellChecker.levenshteinDistance(word.toString(), current.word.toString());

         if (current.word.equals(word)) {
            return current;
         } else if (distance <= 2) {
            current = current.left;
         } else {
            current = current.right;
         }
      }
      return null;
   }

   boolean isWordInDictionary(T word) {
      return search(word) != null;
   }

   boolean delete(T word) {
      Node<T> current = root;
      Node<T> parent = null;

      // find target's Node
      while (current != null && !current.word.equals(word)) {
         parent = current;
         if (SpellChecker.levenshteinDistance((String) word, (String) current.word) <= 2) {
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

   StringBuilder inOrderTraversalToString() {
      // inorder traversal of the tree and add all elements to the StringBuilder

      // StringBuilder is used to avoid the overhead of creating a new String object
      // each time a new String is concatenated
      StringBuilder sb = new StringBuilder();
      inOrderTraversalToString(root, sb);
      return sb;
   }

   private void inOrderTraversalToString(Node<T> node, StringBuilder sb) {
      // inorder traversal of the tree and add all elements to the StringBuilder
      if (node != null) {
         inOrderTraversalToString(node.left, sb);
         sb.append(node.word).append(" ");
         inOrderTraversalToString(node.right, sb);
      }
   }
}
