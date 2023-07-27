public class Node {
    //defining Node Structure
    int value;
    Node next;
    public Node() {}
    public Node(int val) {
        this.value = val;
    }
    public Node(int val,Node next) {
        this.value = val;
        this.next = next;
    }
}
