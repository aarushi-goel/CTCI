package ArraysAndStrings;

import java.util.*;
public class Q1o3 {
    private String urlify(String s){
        int count = 0;
        char[] ch = s.toCharArray();
        for(char c: ch){
            if(c==' '){
                count++;
            }
        }
        char[] arr = new char[ch.length+(count*2)];
        int j = s.length()-1;
        for(int i=arr.length-1;i>=0;i--){
            if(s.charAt(j)==' '){
                arr[i] = '0';
                arr[i-1] = '2';
                arr[i-2] = '%';
                i = i-2;
                j--;
            }
            else{
                arr[i] = s.charAt(j);
                j--;
            }
        }
        return(new String(arr));
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        Q1o3 q= new Q1o3();
        String ans = q.urlify(s);
        System.out.println(ans);
    }

}
