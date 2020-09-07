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
	}

}
