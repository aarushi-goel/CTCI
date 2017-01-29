package ArraysAndStrings;

import java.util.*;
public class Q1o9 {
    private boolean rotation(String s, String sb){
         char first = sb.charAt(0);
         int index, margin;
         if(s.contains(first+"")){
             index = s.indexOf(first);
             margin = s.length()-index;
             sb = sb.concat(sb);
             if(s.substring(margin).equals(sb)){
                 return true;
             }
         }
         else
             return false;
        return true;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        String sb = inp.nextLine();
        Q1o9 q = new Q1o9();
        Boolean ans = q.rotation(s,sb);
        System.out.println(ans);
    }
}
