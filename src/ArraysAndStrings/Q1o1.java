package ArraysAndStrings;

import java.util.*;

public class Q1o1 {
    private boolean isUniq(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++){
            if(ch[i] == ch[i+1]){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        Q1o1 q = new Q1o1();
        Boolean ans = q.isUniq(s);
        System.out.println(ans);
    }

}
