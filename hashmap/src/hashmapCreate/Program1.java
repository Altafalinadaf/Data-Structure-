package hashmapCreate;

public class Program1 {
	
	static int[] hashMap;
	
	static void createMap(int size) {
		hashMap=new int[size];
		for(int i=0;i<hashMap.length;i++) {
			hashMap[i]=-1;
		}
		System.out.println("hashMap has been created with size "+size);
	}
	
	
	static void put(int val) {
		int in=val%hashMap.length;
		if(hashMap[in]==-1) {
			hashMap[in]=val;
			System.out.println(val+"has been inserted");
		}
		else {
			System.out.println("key is already occupied");
		}
	}
	
	static void delete(int val) {
		int in=val%hashMap.length;
		
		if(hashMap[in]==val) {
			hashMap[in]=-1;
			System.out.println(val+" has been deleted");
		}
		else {
			System.out.println("key not found");
		}
	}
	
	
	static void display() {
		int c=0;
		
		System.out.println("=======Map elements here======");
		for(int ele:hashMap) {
			if(ele!=-1) {
				System.out.println(ele);
				c++;
			}
			
			
		}
		if(c==0) {
			System.out.println("HasMap is empty..!!!!!!!");
		}
		
	}
	
	public static void main(String[] args) {
		createMap(4);
		put(24);
		put(25);
		put(99);
		put(2009);
		delete(24);
		delete(23);
		
		display();
	}

}
