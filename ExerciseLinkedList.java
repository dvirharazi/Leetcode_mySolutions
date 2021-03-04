import java.util.LinkedList;
import java.util.List;

public class ExerciseLinkedList {
    //working only until long
    public static ListNode addTwoNumbers_untilLong(ListNode l1, ListNode l2) {
            long totalSum=0;
            long q=1;
            while(l1 != null){
                totalSum += l1.val*q;
                q*=10;
                l1=l1.next;
            }
            q=1;
            while(l2 != null){
                totalSum += l2.val*q;
                q*=10;
                l2=l2.next;
            }

            ListNode start = new ListNode();
            ListNode current = new ListNode();
            start.next = null;
            start.val = (int)(totalSum%10);
            totalSum /=10;
            current = start;
            while(totalSum > 0){
                current.next = new ListNode();
                current.next.val= (int)((totalSum%10));
                current = current.next;
                totalSum /=10;
            }
            return start;
        }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum =0;
        int mod =0;
        ListNode start = new ListNode();
        ListNode current;
        start.next = null;
        start.val=0;
        current = start;
        while(l1 !=null || l2!=null){
            current.next = new ListNode();
           if(l1 != null && l2 != null){
               sum = l1.val+l2.val+mod;
               mod = sum%10;
               current.next.val = mod;
               current = current.next;
               l1 = l1.next;
               l2=l2.next;
           }
           else if(l1 !=null){
               sum = l1.val+mod;
               mod = sum%10;
               current.next.val = sum;
               current = current.next;
               l1 = l1.next;
           }
           else if(l2 !=null){
               sum=l2.val+mod;
               mod = sum%10;
               current.next.val = sum;
               current = current.next;
               l2=l2.next;
           }
        }
        return start;
        }
    }

