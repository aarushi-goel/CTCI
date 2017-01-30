package LinkedList;
import java.util.*;
public class Q2o6 {
    private boolean palin(LinkedList<Integer> list){
        Node temp = list.head;
        Node rev = list.reverse();
        while(temp!=null){
            if(temp.data!=rev.data){
                return false;
            }
            temp = temp.next;
            rev = rev.next;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int n = s.nextInt();
        while(n>0){
            int d = s.nextInt();
            list.addToLast(d);
            n--;
        }
        Q2o6 q = new Q2o6();
        boolean ans = q.palin(list);
        System.out.println(ans);
    }
}
