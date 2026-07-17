package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class leetcode_61 {
    public  static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k==0) return head;
        ListNode curr =  head;
        ListNode newCurr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        curr.next = head; // Circuler formed

        k = k % length;

        for (int i = 1; i <= length - k -1; i++) {
            newCurr = newCurr.next;
        }
        head = newCurr.next;
        newCurr.next = null;
        return head;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        rotateRight(head, 2);



    }
}

