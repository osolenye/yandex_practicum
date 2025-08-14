package sprint4.collections;

public class JavaLinkedList {
    public static void main(String[] args) {

    }
}

class SinglyLinkedList<T> {
    public Node<T> head;
    private int size = 0;

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}

class DoubleLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    private int size = 0;

    class Node<T> {
        public T data;
        public Node<T> next;
        public Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
