package ArraysAndStrings;

import java.util.*;
public class Q1o5 {
    private boolean away(String s1, String s2){
       if(s1.length()-s2.length()>1)
           return false;
       String small = s1.length()<s2.length() ? s1 : s2;
       String big = s1.length()<s2.length() ? s2 : s1;
       if(Math.abs(s1.length()-s2.length())==1){
            int i1 = 0, i2 = 0;
            int count = 0;
            while(i1<small.length() && i2<big.length()){
                if(small.charAt(i1)!=big.charAt(i2)){
                    count++;
                }
                else if(small.charAt(i1)==big.charAt(i2)){
                    i1++;
                }
                else if(count==2)
                    return false;

                i2++;
            }
            if(count==1 || count==0)
                return true;
       }
       else if(s1.length()==s2.length()){
           int count = 0;
           int j=0;
           for(int i=0;i<s1.length();i++){
               if(s1.charAt(i)!=s2.charAt(j)){
                    count++;

               }
               else if(count==2){
                   return false;
               }
               j++;
           }
           if(count==1 || count==0)
               return true;
       }
       return false;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s1 = inp.nextLine();
        String s2 = inp.nextLine();
        Q1o5 q = new Q1o5();
        Boolean ans = q.away(s1,s2);
        System.out.println(ans);
    }
}
