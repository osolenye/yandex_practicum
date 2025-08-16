package sprint4.final_project;

public class Node<T> {
    public Node next;
    public Node prev;
    public T data;

    public Node(T data) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
}
