package LinkedList;
import java.util.*;
public class Q2o8 {
    private Node loop(LinkedList<Integer> list){
        Node slow = list.head;
        Node fast = list.head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.equals(fast))
                break;
        }
        if(fast==null || fast.next==null)
            return null;
        slow = list.head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
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
        Node rand = list.head;
        int index = s.nextInt();
        for(int i=0;i<index;i++){
            rand = rand.next;
        }
        list.addToLast(rand);
        Q2o8 q = new Q2o8();
        Node ans = q.loop(list);
        System.out.println(ans.data);
    }
}
