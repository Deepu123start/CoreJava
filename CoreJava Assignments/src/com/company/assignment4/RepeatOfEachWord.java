package com.company.assignment4;

/**
 * Created by deept on 2/3/2017.
 */
public class RepeatOfEachWord {
    public static void main(String[] args) {
        String s = "This is a Java class";
        Rep Obj = new Rep();
        Obj.nOfTimes(s);
    }
}
    class Rep {
        public void nOfTimes(String s) {
            char k;
            char j;
            for (j = 'a'; j <= 'z'; j++) {
                int c = 0;
                for (int i = 0; i < s.length(); i++) {
                    k = s.charAt(i);
                    if (j == k) {
                        c++;
                    }
                }
                if (c != 0) {
                    System.out.println(j + "\t" + c);
                }
            }
        }


}

