package InterviewPrepWork.Week2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by akshaymathur on 12/3/17.
 */
public class PointsOnTheStraightLine {

    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n = a.size();
        if(n<2){
            return n;
        }

        HashMap<Double,Integer> map = new HashMap<>();
        int maxVal =0;

        for(int i=0;i<n;i++){

            int x1 = a.get(i);
            int y1 = b.get(i);
            map.clear();
            for(int j=i+1;j<n;j++) {

                int x2 = a.get(j);
                int y2 = b.get(j);

                double slope = y2 - y1;
                int den = x2 - x1;

                if (den == 0) {
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    slope = slope / den;
                }

                if (map.containsKey(slope)) {
                    map.put(slope, map.get(slope) + 1);
                } else {
                    map.put(slope, 1);
                }
            }
            for(Double s : map.keySet()){
                maxVal = Math.max(map.get(s),maxVal);
            }
        }

        return maxVal+1;


    }
}
