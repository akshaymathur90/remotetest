package InterviewPrepWork.Week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akshaymathur on 12/11/17.
 */
public class RotatedSortedArraySearch {
    //4 5 0 1 2
    //0 1 2 3 4 5 6 7
    public int search(final List<Integer> a, int b) {

        return binarySearch(a,b);
    }

    public int binarySearch(final List<Integer>a, int b){
        int l = 0;
        int u = a.size()-1;
        while (l <= u) {
            int m = (l + u) / 2;
            if (b == a.get(m)) {
                return m;
            } else if (a.get(l) <= a.get(m)) {
                if (b > a.get(m)) {
                    l = m+1;
                } else if (b >=a.get(l)) {
                    u = m-1;
                } else {
                    l = m+1;
                }
            }
            else if (b < a.get(m)) u = m-1;
            else if (b <= a.get(u)) l = m+1;
            else u = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        RotatedSortedArraySearch search = new RotatedSortedArraySearch();

        Integer arr[] = {101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};

        List<Integer> a =  Arrays.asList(arr);
        System.out.println(search.search(Arrays.asList(arr),202));


        /*if(start>0 && start<a.size() && end>0 && end<a.size()){
            return -1;
        }
        int mid = (start+end)/2;

        if(b == a.get(mid)){
            return mid;
        }
        else if(b<a.get(mid)){
            if(b<=a.get(start)){
                //check right
                return binarySearch(a,b,mid+1,end);
            }
            else{
                //check left
                return binarySearch(a,b,start,mid-1);
            }

        }
        else{
            if(b<=a.get(end)){
                //check right
                return binarySearch(a,b,mid+1,end);
            }
            else{
                //check left
                return binarySearch(a,b,start,mid-1);
            }
        }*/
    }
}
