package ArraysAndStrings;

import java.util.*;

/**
 * Created by sheleshgupta on 28/1/17.
 */
public class Q1o2 {
    private boolean perm(String s, String p){
        HashMap<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<p.length();i++){
            if(map.containsKey(p.charAt(i)) && map.get(p.charAt(i))>0){
                map.put(p.charAt(i),map.get(p.charAt(i))-1);
            }
            else if(!map.containsKey(p.charAt(i))){
                return false;
            }
            else if(map.containsKey(p.charAt(i)) && map.get(p.charAt(i))==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        String p = inp.nextLine();
        if(s.length()!=p.length())
            System.out.println(false);
        else {
            Q1o2 q = new Q1o2();
            boolean ans = q.perm(s, p);
            System.out.println(ans);
        }
    }
}
