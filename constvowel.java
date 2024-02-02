import java.util.Scanner;

public class constvowel {
    public static void main(String [] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string: ");
         String s = sc.next();
         int l = s.length();
         int c=0;
         int v=0;
         for(int i=0;i<l;i++) {
            if(s.charAt(0)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(0)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u')
            {
              v++;
            }
            else{
                c++;
            }
         }
         System.out.println("consonant = " + c);
         System.out.println("vowels = " + v);
    }
    
}
