package merge_sort;

public class Program {
	static void merge(int arr[], int l, int m, int h) {
		 int[] L=new int[m-l+1];
		 int[] R=new int[h-m];
		 int k=l;
		 
		 for(int i=0;i<L.length;i++) {
			 L[i]=arr[k];
			 k++;
		 }
		 
		 for(int i=0;i<R.length;i++) {
			 R[i]=arr[k];
			 k++;
		 }
		 
		 k=l;
		 int i=0,j=0;
		 
		 while(i<L.length && j<R.length) {
			 if((L[i]<R[j])) {
				arr[k]=L[i];
				k++;
				i++;
			 }
			 else {
				 arr[k]=R[j];
				 k++;
				 j++;
			 }
		 }
		 
		 while(i<L.length) {
			 arr[k]=L[i];
			 k++;
			 l++;
			 
		 }
		 
		 while(j<R.length) {
			 arr[k]=R[j];
			 k++;j++;
		 }
	 }
	 
	 
	 static void sort(int []arr,int l,int h) {
		 if(l<h) {
			 int mid=(l+h)/2;
			 sort(arr,l,mid);
			 sort(arr,mid+l,h);
			 merge(arr,l,mid,h);
			 
		 }
	 }
	 
	 
	 public static void main(String[] args) {
		int arr[]= {3,2,4,52,1,4,2,5};
		
		sort(arr,0,arr.length);
		for(int ele:arr) {
			System.out.println(ele);
		}
	
	}
}
