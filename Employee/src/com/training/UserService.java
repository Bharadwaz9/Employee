package com.training;

public class UserService {
	public static void main(String[] args) {
	
		UserMethods usersMethods=new UserMethods();

		int choice;
		
		do {
			System.out.println("1.Add");
			System.out.println("2.Delete");
			System.out.println("3.Display ");
			System.out.println("4.search");
			System.out.println("0.exit");
		//System.out.println("Enter 0 to exit:");
		choice=usersMethods.scan.nextInt();
		switch (choice) {
		case 1: usersMethods.addUser();
				break;
		case 2: usersMethods.delUser();
				break;
		case 3:  usersMethods.displayAllUsers();
				break;
		case 4:	usersMethods.searchuser();
				break;

		default: System.out.println("Enter correct value");
			break;
		}
		}while(choice!=0);

}
}
