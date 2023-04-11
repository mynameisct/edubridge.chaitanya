package com.edubridge;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		AtmOperationInterface op = (AtmOperationInterface) new AtmOperationImplementation();
		int atmnumber = 12345;
		int atmpin = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !!!");
		System.out.println("Enter Atm Number: ");
		int atmNumber= sc.nextInt();
		System.out.println("Enter pin: ");
		int pin=sc.nextInt();
		if((atmnumber==atmNumber) && (atmpin==pin)) {
			while(true) {
				System.out.println("\n 1.View Available Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View Ministatement\n 5.Exit");
				System.out.println("Enter your Choice: ");
				int ch = sc.nextInt();
				if(ch==1) {
					op.viewBalance();
				}
				else if(ch==2) {
				System.out.println("Enter Amount to Withdraw: ");
				double withdrawAmount = sc.nextDouble();
				op.withdrawnAmount(withdrawAmount);
				}
				
				else if(ch==3) {
					System.out.println("Enter Amount to Deposit: ");
					double depositAmount = sc.nextDouble(); 
					op.depositAmount(depositAmount);
					
				}
				
				else if(ch==4) {
					System.out.println("Your Mini Statement Details: ");
					op.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("Collect your ATM Card\n Thank You for using our ATM Service!!");
					System.exit(0);
				}
				
				else {
					System.out.println("Please enter correct choice: ");
					System.exit(0);
					
				}
			}
		}
		else {
			System.out.println("Incorrect Atm number or pin");
		}
	}
}
