package InterviewPrepWork.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by akshaymathur on 12/3/17.
 */
public class TwoSum {

    public static ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            if(map.containsKey(a.get(i))){
                //System.out.println(map.get(a.get(i)));
                result.add(map.get(a.get(i))+1);
                result.add(i+1);
                return result;
            }else{
                if(!map.containsKey(b-a.get(i))) {
                    map.put(b - a.get(i), i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
        List<Integer> integers = IntStream.of(arr).boxed().collect(Collectors.toList());
        System.out.println(twoSum(integers,-3).toString());
    }
}
