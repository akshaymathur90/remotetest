package InterviewPrepWork.Week6;

/**
 * Created by akshaymathur on 1/28/18.
 */
public class ClimbStairs {

    public int climbStairs(int A) {
        int[] memo = new int[A+1];
        count(A,memo);
        return memo[A];

    }

    public int count(int A, int[] memo){

        if(A==1){
            memo[A] = 1;
            return 1;
        }
        else if(A==2){
            memo[A] = 2;
            return 2;
        }
        else{
            memo[A] = count(A-1,memo) + count(A-2,memo);
            return memo[A];
        }
    }
}
