class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                k.next = l1;
                l1 = l1.next;
            } else {
                k.next = l2;
                l2 = l2.next;
            }
            k = k.next;
        }

        if (l1 != null)
            k.next = l1;
        else
            k.next = l2;

        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First sorted list: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Second sorted list: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoSortedList obj = new MergeTwoSortedList();
        ListNode result = obj.mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        printList(result);
    }
}