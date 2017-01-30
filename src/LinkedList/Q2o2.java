package LinkedList;
import java.util.*;
public class Q2o2 {
    private int kLast(LinkedList<Integer> list, int k){
        Node slow = list.head;
        Node fast = list.head;
        while(k>0){
            fast = fast.next;
            k--;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return (int)slow.data;
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
        int k = s.nextInt();
        Q2o2 q = new Q2o2();
        int ans = q.kLast(list,k);
        System.out.println(ans);
    }

}
