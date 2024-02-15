public class SLList {
    private SLNode head;

    public SLList() {
        this.head = null;
    }

    public void listAdd(Object p) {
        SLNode newNode = new SLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            SLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void listRemove(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        SLNode current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        current.next = current.next.next;
    }

    @Override
    public String toString() {
        String result = "";
        SLNode current = head;
        while (current != null) {
            result += current.data.toString() + "\n";
            current = current.next;
        }
        return result;
    }

}

