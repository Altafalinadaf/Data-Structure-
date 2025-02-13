class MaxMinNumber{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a[]={246545649,3,4,2,34,532,534,654,2,3,42,42,0,4554574};

        int max=0;
        int min=2222222;

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }

        }

        System.out.println(max+" "+min);
    
    }
}