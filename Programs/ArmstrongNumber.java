import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=scanner.nextInt();

        int digit= (int)Math.log10(num)+1;
        int count =0;
        
        int temp=num;
        while(temp>0){
            int rem=temp%10;
            count+=Math.pow(rem, digit);
            temp/=10;
        }


        if(count==num){
            System.out.println(num+" is a Armstrong Number ");
        }
        else{
            System.out.println(num+" is not a Armstrong number ");
            
        }

    }
}
