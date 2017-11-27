package InterviewPrepWork.Week1;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 11/25/17.
 */
public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        //LinkedList<Integer> preresult = new LinkedList<>();

        int c=1;
        for(int i=a.size()-1; i>=0;i--){
            int num = a.get(i);
            num += c;
            c=0;
            if(num==10){
                num = 0;
                c = 1;
            }
            a.set(i,num);
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (c==1){
            result.add(1);
        }
        for(int j=0;j<a.size();j++){
            if(a.get(j) == 0 && result.size()==0){
                continue;
            }
            result.add(a.get(j));
        }
        return result;

        /*
        * LinkedList<Integer> preresult = new LinkedList<>();
        int n;
        int c=0;
        n = a.get(a.size()-1) + 1;
        for(int i=a.size()-2; i>=0;i--){
            c = n/10;
            n = n%10;
            preresult.addFirst(n); // 9,9,9,9  0,3,1,0
            n = a.get(i) + c;
        }
        c = n/10;
        n = n%10;
        preresult.addFirst(n);
        if(c>0) preresult.addFirst(c);
        boolean f = false;
        ArrayList<Integer> result = new ArrayList<>();
        for(int j=0;j<preresult.size();j++){
            if(preresult.get(j)==0 && !f){
                continue;
            }
            else {
                f = true;
                result.add(preresult.get(j));
            }
        }

        return result;*/
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(9);input.add(9);input.add(9);input.add(9);
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        System.out.println(addOneToNumber.plusOne(input).toString());
    }
}
