class Max3Numbers{
    public static void main(String[] args) {
        int[] a={1,2444,3,4,4,1,23,462,21,342,1,34,54};
        int firstMax=0,secMax=0,thirdMax=0;

        for(int i=0;i<a.length;i++){
            if(a[i]>firstMax){
               // thirdMax=secMax;
                secMax=firstMax;
                firstMax=a[i];

            }
            else if(a[i]>secMax){
               // thirdMax=secMax;
                secMax=a[i];
            }
          /* else if(a[i]>thirdMax){
                thirdMax=a[i];
            }
                 */ 
        }
        System.out.println(firstMax+" "+secMax+" "+thirdMax);


    }
}