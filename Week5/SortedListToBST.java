package InterviewPrepWork.Week5;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 1/22/18.
 */
public class SortedListToBST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public TreeNode sortedListToBST(ListNode a) {
        ArrayList<Integer> list = new ArrayList<>();
        while(a!=null){
            list.add(a.val);
            a=a.next;
        }
        TreeNode root=null;
        root = makeTree(0,list.size()-1,list);

        return root;


    }

    public TreeNode makeTree(int left,int right,ArrayList<Integer> list){

        if (left > right) {
            return null;
        }


        int mid = (left+right)/2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = makeTree(left,mid-1,list);
        root.right = makeTree(mid+1,right,list);

        return root;
    }
}
