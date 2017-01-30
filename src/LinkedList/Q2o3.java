package LinkedList;
import java.util.*;
public class Q2o3 {
    private LinkedList<String> delMiddle(LinkedList<String> list, int index){
        Node n = list.head;
        for(int i=0;i<index;i++){
            n = n.next;
        }
        n.data = n.next.data;
        n.next = n.next.next;
        return list;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        int n = s.nextInt();
        s.nextLine();
        while(n>0){
            String d = s.nextLine();
            list.addToLast(d);
            n--;
        }
        int get = s.nextInt();
        Q2o3 q = new Q2o3();
        LinkedList<String> ans = q.delMiddle(list,get);
        String answer = ans.toString();
        System.out.println(answer);
    }
}
