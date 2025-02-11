package arrays;

class Player{
	int id;
	String name;
	String email;
	String password;
	
	Player(int id,String name,String email,String password){
		this.name=name;
		this.id=id;
		this.email=email;
		this.password=password;
		
	}
}
public class Program3 {
	public static void main(String[] args) {
		Player []p=new Player[4];
		
		
		for(int i=0;i<4;i++) {
			 p[i] = new Player(i + 1, "Player" + (i + 1), "email" + (i + 1) + "@example.com", "password" + (i + 1));
        }

        // Accessing array elements
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + ":");
            System.out.println("ID: " + p[i].id);
            System.out.println("Name: " + p[i].name);
            System.out.println("Email: " + p[i].email);
            System.out.println("Password: " + p[i].password);
            System.out.println();
        }
	}
}
