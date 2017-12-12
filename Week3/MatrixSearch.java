package InterviewPrepWork.Week3;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 12/11/17.
 */
public class MatrixSearch {

    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        if(a.size()==0 || a.get(0).size()==0){
            return 0;
        }
        int rows = a.size();

        //int cols = a.get(size();

        for(int i=0;i<rows;i++){
            if(b >= a.get(i).get(0) && b <= a.get(i).get(a.get(i).size()-1)){
                for(int j=0;j<a.get(i).size();j++){
                    if(a.get(i).get(j)==b){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
