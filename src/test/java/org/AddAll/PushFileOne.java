package org.AddAll;

public class PushFileOne {
	public static void main(String[] args) {
		System.out.println("Conflict Check");
		System.out.println("Adding PushFileOne file");
		int a=10;
		int b=20;
		System.out.println("Before Swap a value---->"+ a);
		System.out.println("Before Swap b value---->"+ b);
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap a value---->"+ a);
		System.out.println("After Swap b value---->"+ b);
		System.out.println("Adding to merge withou conflict");
		int c=30;
		int d= 45;
		int temp=0;
		temp = c;
		c=d;
		d=temp;
		System.out.println("After Swap a value---->"+ c);
		System.out.println("After Swap b value---->"+ d);
				
		
	}

}
