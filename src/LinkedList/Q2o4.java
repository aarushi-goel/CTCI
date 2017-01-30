package LinkedList;
import java.util.*;
public class Q2o4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int n = s.nextInt();
        int num = s.nextInt();
        while(n>0){
            int d = s.nextInt();
            if(d<num){
                list.addToFirst(d);
            }
            else{
                list.addToLast(d);
            }
            n--;
        }
        String ans = list.toString();
        System.out.println(ans);
    }
}
