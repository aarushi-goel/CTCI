package LinkedList;
import java.util.*;
public class Q2o5 {
    private LinkedList<Integer> sumList(LinkedList<Integer> l1, LinkedList<Integer>l2){
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        int sum = 0;
        int carry = 0;
        while(temp1!=null || temp2!=null){
            sum = (temp1!=null ? (int)temp1.data : 0) + (temp2!=null ? (int)temp2.data : 0) + carry;
            carry = sum/10;
            sum = sum%10;
            l3.addToLast(sum);
            if(temp1!=null)
             temp1 = temp1.next;
            if(temp2!=null)
             temp2 = temp2.next;
        }
        if(carry!=0){
           l3.addToLast(carry);
        }
        return l3;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        int n = s.nextInt();
        while(n>0){
            int d = s.nextInt();
            list1.addToLast(d);
            n--;
        }
        System.out.println(list1);
        int n2 = s.nextInt();
        while(n2>0){
            int d = s.nextInt();
            list2.addToLast(d);
            n2--;
        }
        System.out.println(list2);
        Q2o5 q = new Q2o5();
        String ans = q.sumList(list1,list2).toString();
        System.out.println(ans);
    }
}
