

public class AverageOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int element :arr){
            sum+=element;
        }
        System.out.println("average of sum of array : "+sum/arr.length+" "+sum+" "+arr.length);
    }
    
}
