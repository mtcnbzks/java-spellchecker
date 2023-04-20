public class BST<T extends Comparable<T>> {

   static class Node<T> {
      T data;
      Node<T> left, right;

      Node(T data) {
         this.data = data;
      }
   }

   Node<T> root;

}
