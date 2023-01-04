import java.util.Scanner;

public class main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		SQL sql = new SQL();
		admin admin = new admin();
		pc pc = new pc();
		
		
		String uname = admin.getUserName();
		String AdminUser = admin.getAdminName();
		String AdminPwd = admin.getAdminPWD();
		
		
		int renthr, rentprice=25;
		int choose = 0, chooseMN=0;
	
		do {
		System.out.println("*********************************");
		System.out.println("*\t(1) Create User\t\t*"
						+ "\n*\t(2) Show User\t\t*"
						+ "\n*\t(3) Delete User\t\t*"
						+ "\n*\t(4) Show pc\t\t*");
		System.out.println("*********************************");
		choose = in.nextInt();
		
		switch(choose) {
			case 1:
				do {
					try {
						System.out.println("Enter Username: ");
						uname = in.next();
						admin.setUserName(uname);
		
						
						System.out.println("Succesfully create user.\n");
							
						System.out.println("(1) back. ");
						System.out.println("(2) create more user. ");
						choose = in.nextInt();
						sql.createUser();	
						
					}catch(Exception e) {
						e.printStackTrace();
						continue;
					}
				}while(choose==2);
				break;
			case 2:
				System.out.println("(1) Show Specific User.");
				System.out.println("(2) Show All User");
				System.out.println("(3) Back.");
				choose = in.nextInt();
				
				// choose 1 SHOW SPECIFIC USER
				// user will prompt to enter the username
				if(choose==1) {
					do{
						System.out.print("username: ");
						uname = in.next();
						admin.setUserName(uname);
						
						sql.showUser(); // call the sql show user method
						
						System.out.println("(1) back.");
						System.out.println("(2) Show again. ");
						choose = in.nextInt();
						
					}while(choose==2);
				// choose 2 SHOW ALL USERS
				}else if(choose==2) {
					// show list of all users
					// shows the total of number of users  
					do {
						sql.showAllUser();
						System.out.println("(1) back. ");
						System.out.println("(2) Show again. ");
						choose = in.nextInt();
					
						
					}while(choose==2);
				}
				break;
			case 3:
				System.out.println("(1) Delete User");
				choose = in.nextInt();
				
				if(choose==1) {
					do {
						System.out.print("Username: ");
						uname = in.next();
						admin.setUserName(uname);
						
						sql.deleteUser();
						System.out.println("(1) back. ");
						System.out.println("(2) Delete again. ");
						choose = in.nextInt();
						
					}while(choose==2);
				}
				break;
			case 4:
				do {
					pc.pclist();
					System.out.println("(1) Back.");
					System.out.println("(2) Show again.");
					choose = in.nextInt();
				}while(choose==2);
				
				break;
				
			case 5:
				System.out.println("(1) Enter pc to user");
				choose = in.nextInt();
				
				if(choose==1) {
					System.out.println("Enter PC# to rent");
					String PCn = in.next();
					
				}
				
			}
			
		}while(choose==1);

	}
}
