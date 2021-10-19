package com.training;

public class UserService {
	public static void main(String[] args) {
		UserMethods usersMethods=new UserMethods();
		usersMethods.addUser();
		usersMethods.displayAllEmployees();
		usersMethods.delUser();
		usersMethods.displayAllEmployees();
		usersMethods.displayUserById();
		
	}

}
