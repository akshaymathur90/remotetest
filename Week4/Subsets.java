package InterviewPrepWork.Week4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by akshaymathur on 1/15/18.
 */
public class Subsets {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),A,0);
        return result;

    }

    public void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> subset, ArrayList<Integer> A, int i){

        result.add(new ArrayList<>(subset));

        for(int j=i;j<A.size();j++){

            subset.add(A.get(j));
            backtrack(result,subset,A,j+1);
            subset.remove(subset.size()-1);
        }
    }
}
