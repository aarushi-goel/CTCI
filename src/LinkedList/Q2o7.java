package LinkedList;
import java.util.*;
public class Q2o7 {
    private Node intersect(LinkedList<Integer> l1, LinkedList<Integer> l2){
        Node temp = l1.head;
        Node temp2 = l2.head;
        int len1=l1.len;
        int len2 = l2.len;
        int diff;
        temp = l1.head;
        temp2 = l2.head;
        if(len1>len2){
            diff = len1-len2;
            for(int i=0;i<diff;i++){
               temp = temp.next;
            }
        }
        else if(len1<len2){
            diff = len2-len1;
            for(int i=0;i<diff;i++){
                temp2 = temp2.next;
            }
        }
        while(temp!=null){
            if(temp==temp2){
                return temp;
            }
            else{
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        return null;
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
        int n2 = s.nextInt();
        while(n2>0){
            int d = s.nextInt();
            list2.addToLast(d);
            n2--;
        }
        int common = s.nextInt();
        while(common>0){
            int d = s.nextInt();
            Node commonNode = new Node(d);
            list1.addToLast(commonNode);
            list2.addToLast(commonNode);
            common--;
        }
        Q2o7 q = new Q2o7();
        Node ans= q.intersect(list1,list2);
        System.out.println(ans.data);
    }
}
