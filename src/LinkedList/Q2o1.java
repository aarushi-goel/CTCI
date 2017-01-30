package LinkedList;
import java.util.*;
public class Q2o1 {
    private LinkedList<Integer> dups(LinkedList<Integer> list){
        Node temp = list.head;
        while(temp!=null){
            Node temp2 = temp;
            while(temp2.next!=null){
                if(temp.data==temp2.next.data){
                    temp2.next = temp2.next.next;
                }
                else{
                    temp2 = temp2.next;
                }
            }
            temp = temp.next;
        }
        return list;
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
        Q2o1 q = new Q2o1();
        String answer = q.dups(list).toString();
        System.out.println(answer);
    }
}
