package ArraysAndStrings;

import java.util.*;
public class Q1o4 {
    private boolean palin(String s){
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(h.contains(s.charAt(i))){
                h.remove(s.charAt(i));
            }
            else{
                h.add(s.charAt(i));
            }
        }
        if(h.size()==0 || h.size()==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        s = s.replaceAll("\\s+","");
        s = s.toLowerCase();
        Q1o4 q = new Q1o4();
        Boolean ans = q.palin(s);
        System.out.println(ans);
    }
}
