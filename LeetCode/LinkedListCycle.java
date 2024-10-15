public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();

        // Example 1: [3,2,0,-4], pos = 1
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle here

        System.out.println("Example 1 has cycle: " + solution.hasCycle(head));

        // Example 2: [1,2], pos = 0
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = head2; // Creating a cycle here

        System.out.println("Example 2 has cycle: " + solution.hasCycle(head2));

        // Example 3: [1], pos = -1 (No cycle)
        ListNode head3 = new ListNode(1);

        System.out.println("Example 3 has cycle: " + solution.hasCycle(head3));
    }
}
