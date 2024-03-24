package javatestv1;

import java.util.Scanner;

public class Rop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner  (System.in);
		System.out.print("Enter the value of the a:\n");
		int a=sc.nextInt ();
		System.out.print("Enter the value of b:\n");
		int b=sc.nextInt();
		if(a<b) {
			System.out.print(" a is Lesser than b ");
		}
		else if(a==b) {
			System.out.print("a is Equal b");
		}
		else if(a>b) {
			System.out.print(" a is Greater than b");
		}
		}
	}
