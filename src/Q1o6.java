import java.util.*;
public class Q1o6 {
    private String compress(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0;i<s.length();i++){
            count++;
            if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
                sb.append(count);
                count=0;
            }
        }
        return sb.length()<s.length() ? sb.toString() : s;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        Q1o6 q = new Q1o6();
        String ans = q.compress(s);
        System.out.println(ans);
    }
}
