package linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(1);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = one;

        ListNode head2 = head;

        System.out.println(hasCycle(head));
        System.out.println(hasCycle2(head2));
    }

    public static boolean hasCycle(ListNode head) {

        List<ListNode> listNodeList = new ArrayList<>();

        while (head != null) {
            if (listNodeList.contains(head.next)) return true;

            listNodeList.add(head);
            head = head.next;
        }
        return false;
    }

    public static boolean hasCycle2(ListNode head) {

        ListNode slow = head, fast = head;

        while (slow.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow.equals(fast)) return true;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}



