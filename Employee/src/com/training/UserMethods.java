package com.training;

import java.util.ArrayList;
import java.util.Scanner;



public class UserMethods {
	User user=new User();
	 static ArrayList arrayList=new ArrayList();
	 static Scanner scan =new Scanner(System.in);
	 
	 public void addUser() {
			int id;
			String name;
			String email;
			System.out.println("Enter id:");
			id=scan.nextInt();
			System.out.println("Enter Name:");
			name=scan.next();
			System.out.println("Enter email:");
			email=scan.next();
			user= new User(id, name, email);
			arrayList.add(user);
			}
	 
	 
	 public void delUser() {
			System.out.println("Enter id to delete:");
			int id=scan.nextInt();

			for(int i=0;i<arrayList.size();i++) {
				if(arrayList.get(i).equals(id)) {
					arrayList.remove(user);
			}
				else {
					System.out.println("element not found");	
				}
			}
	 }
			
			public void searchuser(int id) {
				int index=arrayList.indexOf(id);
				if(arrayList.equals(index)) {
					System.out.println("element found ");
				}
				else {
					System.out.println("element not found");
				}
				
			}
			
			public void displayUserById() {
				System.out.println("Enter id to display:");
				int id=scan.nextInt();

				for(int i=0;i<arrayList.size();i++) {
					if(arrayList.get(i).equals(user)) {
						System.out.println(user);
				}
					else {
						System.out.println("element not found");	
					}
				}
				
			}
			public void displayAllEmployees() {
				System.out.println("All users are:"+arrayList);
				
			}
}

