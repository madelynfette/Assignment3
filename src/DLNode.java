public class DLNode {
    public Object data;
    public DLNode prev;
    public DLNode next;

    public DLNode(Object data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
