package InterviewPrepWork.Week4;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 1/15/18.
 */
public class Permutations {

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),A);
        return result;

    }

    public void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> permute, ArrayList<Integer> A){
        if(permute.size()==A.size()){
            result.add(new ArrayList<>(permute));
        }
        else{

            for(int j=0;j<A.size();j++){
                if(permute.contains(A.get(j))){
                    continue;
                }
                permute.add(A.get(j));
                backtrack(result,permute,A);
                permute.remove(permute.size()-1);
            }
        }
    }
}
