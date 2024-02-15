public class DLList {
    private DLNode head = null;

    public DLList() {

    }

    public void listAdd(Object p) {
        DLNode newNode = new DLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            DLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void listRemove(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        DLNode current = head;
        for (int i = 0; current != null && i < pos; i++) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    @Override
    public String toString() {
        String result = "";
        DLNode current = head;
        while (current != null) {
            result += current.data.toString() + "\n";
            current = current.next;
        }
        return result;
    }

}
