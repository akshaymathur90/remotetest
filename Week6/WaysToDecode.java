package InterviewPrepWork.Week6;

/**
 * Created by akshaymathur on 1/28/18.
 */
public class WaysToDecode {

    /*
        12
        dp = 1 1 1
    */
    public int numDecodings(String s) {

        if(s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for(int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i-1, i)); //1
            int second = Integer.valueOf(s.substring(i-2, i)); //12
            if(first >= 1 && first <= 9) {
                dp[i] += dp[i-1];
            }
            if(second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        WaysToDecode waysToDecode = new WaysToDecode();
        waysToDecode.numDecodings("12");
    }


}
