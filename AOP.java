package javatestv1;

import java.util.Scanner;

public class AOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("\t ENTER THE a:");
		int a=sc.nextInt();
		int c=a;
		System.out.print("\t total="+c);
		c+=a;
		System.out.print("\t total plus="+c);
		c-=a;
		System.out.print("\tc="+c);
			
	}

}
