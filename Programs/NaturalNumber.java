import java.util.Scanner;

public class NaturalNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

    
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        int naturalNumber=n*(n+1)/2;
        System.out.println(naturalNumber);
        // 1+2+3+4= 10
       
    }
}
