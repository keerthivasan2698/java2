package javatestv1;

import java.util.Scanner;

public class DistanceSpeedTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("\tENTER THE SPEED:");
			int SPEED=sc.nextInt();
			System.out.print("\nENTER THE DISTANCE TRAVELLED:");
	int DISTANCETRAVELLED=sc.nextInt();
	int TIMECONSUMED= DISTANCETRAVELLED/SPEED;
	System.out.print("\tTIMECONSUMED"+TIMECONSUMED);
	if(TIMECONSUMED<7) {
		System.out.print("\nYOU HAVE REACHED CHENNAI1:");
	}
	else if(TIMECONSUMED>7) {
		System.out.print("\tYOU HAVE REACHED CHENNAI2:");
	}
	else{
		System.out.print("\tYOU HAVE REACHED FIIT:");
	}
		}
	}
