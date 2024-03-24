package javatestv1;

import java.util.Scanner;

public class Fn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
	System.out.print("\tENTER THE USER ID:");
		int ID=sc.nextInt();
		System.out.print("\tENTER YOUR BASIC PAY:");
int BASICPAY=sc.nextInt();
System.out.print("\tENTER THE DP:");
int DP=sc.nextInt();
System.out.print("\tENTER THE PF:");
int PF=sc.nextInt();
int TOTALPAY= BASICPAY+DP-PF;
System.out.print("\t TOTALPAY"+TOTALPAY);
if(TOTALPAY<25000) {
	System.out.print("\n QA MANUAL TEST ENGINEER");
}
else if(TOTALPAY>25000) {
	System.out.print("\t QA SENIOR TEST ENGINEER:");
}
else{
	System.out.print("\t PRODUCT MANAGER");
}
	}
}
