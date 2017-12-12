package InterviewPrepWork.Week3;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 12/8/17.
 */
public class SumRootToLeafNumbers {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int sumNumbers(TreeNode a) {
        ArrayList<Integer> numbers = new ArrayList<>();

        backtrack(a,numbers,0);
        //System.out.println(numbers.toString());
        int sum =0;
        for(int n : numbers){
            sum = sum + n;
            sum=sum%1003;
        }
        return sum;
    }
    public void backtrack(TreeNode a,ArrayList<Integer> numbers,int num){

        if(a==null) return;


        num *= 10;
        num +=a.val;
        num=num%1003;
        if (a.left == null && a.right==null) {
            numbers.add(num);
            return;
        }
        backtrack(a.left, numbers, num);
        backtrack(a.right, numbers, num);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);

        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        sumRootToLeafNumbers.sumNumbers(root);
    }

}
