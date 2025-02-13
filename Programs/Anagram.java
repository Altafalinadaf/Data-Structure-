import java.util.Arrays;
import java.util.Scanner;

class Anagram{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string 1 ");
        String str1=sc.nextLine();
        System.out.println("enter the 2nd string");
        String str2=sc.nextLine();
        

        if(str1.length()==str2.length()){
            char a[]=str1.toCharArray();
            char b[]=str2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            boolean result = Arrays.equals(a, b);
            
            if(result){
                System.err.println("String is Anagram");
            }
            else{
                System.out.println("String is not a anagram");
            }
        }
        else
        System.out.println("not a anagram");
        


    }
}