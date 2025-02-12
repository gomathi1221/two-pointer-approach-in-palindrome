import java.util.*;
class Main {
    public static boolean palindrome(int n){
        String s=Integer.toString(n);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
     return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(palindrome(n)){
       
           System.out.println("palindrome");
       }
       else{
           System.out.println("not a palindrome");
       }
        
    }
}