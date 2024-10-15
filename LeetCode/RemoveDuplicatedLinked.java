public class RemoveDuplicatedLinked {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode node2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));

        RemoveDuplicatedLinked removeDupes = new RemoveDuplicatedLinked();
        removeDupes.printList(node1);
        removeDupes.deleteDuplicates(node1);
        removeDupes.printList(node1);

        removeDupes.printList(node2);
        removeDupes.deleteDuplicates(node2);
        removeDupes.printList(node2);
    }
}
