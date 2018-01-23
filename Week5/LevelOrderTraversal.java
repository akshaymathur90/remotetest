package InterviewPrepWork.Week5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by akshaymathur on 1/21/18.
 */
public class LevelOrderTraversal {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
    }


    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        traversal(A,result,0);

        return result;
    }

    public void traversal(TreeNode root,ArrayList<ArrayList<Integer>> result,int level){

        if(root==null){
            return;
        }

        if(result.size() == level){
            ArrayList<Integer> lvl = new ArrayList<>();
            lvl.add(root.val);
            result.add(lvl);


        }
        else{
            ArrayList<Integer> lvl = result.get(level);
            lvl.add(root.val);
        }

        traversal(root.left,result,level+1);
        traversal(root.right,result,level+1);

    }
}
