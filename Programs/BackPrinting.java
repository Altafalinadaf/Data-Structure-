
import java.util.Scanner;

public class BackPrinting {

    static  void backPrinting(int n){
        System.out.println("This is the example of BackPriting Program");
        for (int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void frontPrinting(int n){
        System.out.println("This is the example of frontPritning Program");
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Xprinting(int n){
        System.out.println("This is the example of X printing ");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j ||  (i+j)==n+1 ){
                    System.out.print("* ");
                }
                else{ 
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextByte();
       // backPrinting(n);
       // frontPrinting(n);
       Xprinting(n);
    }
}
