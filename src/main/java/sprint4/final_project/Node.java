package sprint4.final_project;

public class Node<T> {
    public Node head;
    public Node tail;
    public T data;

    public Node(Node head, Node tail, T data) {
        this.head = head;
        this.tail = tail;
        this.data = data;
    }
}
