package LinkedList;
public class LinkedList <T>{
    Node head;
    Node tail;
    int len;

    public LinkedList(){
        len = 0;
    }

    public void addToLast(T val){
        Node n = new Node(val);
        if(head==null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        len++;
    }

    public void addToLast(Node n){
        if(head==null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        len++;
    }

    public void addToFirst(T val){
        Node n = new Node(val);
        if(head==null){
            head = n;
            tail = n;
        }
        else{
            n.next = head;
            head = n;
        }
        len++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node temp = head;
        while(temp!=null){
            sb.append(temp.data).append(", ");
            temp = temp.next;
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]");
        return sb.toString();
    }

    public Node reverse(){
        Node prev = null;
        Node cur = head;
        while(cur!=null){
            Node fast = cur.next;
            cur.next = prev;
            prev = cur;
            cur = fast;
        }
        head = prev;
        return head;
    }
}
