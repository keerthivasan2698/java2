package javatestv1;

import java.util.Scanner;

public class Log {

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
if((TOTALPAY==30000)&(TOTALPAY==35000)) {
	System.out.print("\n HR");
}
else if ((TOTALPAY==35000)&(TOTALPAY==35000)) {
	System.out.print("\n SR HR");
	}
	else{
		System.out.print(" JR HR");	
	}
}
	}

}
