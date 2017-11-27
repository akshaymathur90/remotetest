package InterviewPrepWork.Week1;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 11/25/17.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(ArrayList<String> a) {

        while(a.size()>1) {
            for (int i = 0; i + 1 < a.size(); i += 2) {
                String s1 = a.get(i);
                String s2 = a.get(i + 1);
                StringBuilder prefixBuilder = new StringBuilder();
                int n1 = s1.length();
                int n2 = s2.length();
                String shorter, longer;
                if (n1 > n2) {
                    shorter = s2;
                    longer = s1;
                } else {
                    shorter = s1;
                    longer = s2;
                }
                for (int j = 0; j < shorter.length(); j++) {
                    if (shorter.charAt(j) == longer.charAt(j)) {
                        prefixBuilder.append(shorter.charAt(j));
                    } else {
                        break;
                    }
                }
                a.set(i, prefixBuilder.toString());
                a.remove(i + 1);
            }
        }

        return a.get(0);
    }
}
