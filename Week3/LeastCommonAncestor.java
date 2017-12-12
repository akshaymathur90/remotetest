package InterviewPrepWork.Week3;

/**
 * Created by akshaymathur on 12/8/17.
 */
public class LeastCommonAncestor {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int lca(TreeNode a, int val1, int val2) {
        if(!checkIfValueExists(a,val1) || !checkIfValueExists(a,val2)){
            return -1;
        }

        return findLCA(a,val1,val2);
    }

    public int findLCA(TreeNode a, int val1, int val2){

        boolean val1ExistsInLeft = checkIfValueExists(a.left,val1);
        boolean val2ExistsInLeft = checkIfValueExists(a.left,val2);

        if (a.val == val1) {
            return val1;
        }
        if (a.val == val2) {
            return val2;
        }

        if(val1ExistsInLeft && val2ExistsInLeft){
            return lca(a.left,val1,val2);
        }
        else if(!val1ExistsInLeft && !val2ExistsInLeft){
            return lca(a.right,val1,val2);
        }
        else {
            return a.val;
        }

    }

    public boolean checkIfValueExists(TreeNode a, int val){

        if(a==null){
            return false;
        }
        //System.out.println(a.val);
        if(a.val == val){
            return true;
        }
        return checkIfValueExists(a.left,val) || checkIfValueExists(a.right,val);

    }
}
