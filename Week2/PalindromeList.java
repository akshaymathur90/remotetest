package InterviewPrepWork.Week2;

import java.util.Stack;

/**
 * Created by akshaymathur on 12/3/17.
 */
public class PalindromeList {
    class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
 }
    public int lPalin(ListNode A) {
        Stack<ListNode> stack = new Stack<>();
        ListNode head = A;
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        head = A;
        while(head!=null){
            if(head.val != stack.peek().val){
                return 0;
            }
            else{
                stack.pop();
                head = head.next;
            }
        }
        return 1;
    }
}
