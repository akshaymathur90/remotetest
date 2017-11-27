package InterviewPrepWork.Week1;

/**
 * Created by akshaymathur on 11/25/17.
 */
public class MultiplyStrings {

    public String multiply(String a, String b){
        if(a.equals("0") || b.equals("0")){
            return "0";
        }
        int[] result = new int[a.length()+b.length()];
        String shorter, longer;
        if(a.length()>b.length()){
            shorter = b;
            longer = a;
        }else{
            shorter = a;
            longer = b;
        }
        int r;
        int num1,num2,numI,numJ;
        for(int i=shorter.length()-1;i>=0;i--){
            num1 = shorter.charAt(i) - '0';
            for(int j = longer.length()-1;j>=0;j--){
                num2 = longer.charAt(j) - '0';
                r = num1*num2;
                numI = r/10;
                numJ = r%10;
                result[i+j] += numI;
                result[i+j+1] += numJ;
            }
        }
        for(int i =result.length-1;i>=0;i--){
            if(result[i]>9){
                num1 = result[i]/10;
                num2 = result[i]%10;
                result[i] = num2;
                result[i-1] += num1;
            }
        }
        StringBuilder sum = new StringBuilder();
        for(int i=0;i<result.length;i++){
            if(result[i] == 0 && sum.length()==0){
                continue;
            }
            sum.append(result[i]);
        }

        return sum.toString();
    }

    public static void main(String[] args) {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        System.out.println(multiplyStrings.multiply("99999","99999"));
    }
}
