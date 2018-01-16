package InterviewPrepWork.Week4;

import java.util.List;

/**
 * Created by akshaymathur on 1/15/18.
 */
public class SingleNumber {
    public int singleNumber(final List<Integer> a) {
        long xor_sum = 0;
        for(int a_i : a){
            xor_sum = xor_sum ^ a_i;
        }

        return (int)xor_sum;
    }
}
