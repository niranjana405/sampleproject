package iNEURON;

import java.util.Scanner;

public class Algorithm1 {

	public static void main(String[] args) {
		Scanner total=new Scanner(System.in);
		System.out.println("Enter the total size of array" );
		int size=total.nextInt();
		
		int[] student =new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of the array");
		System.out.println("Hi am cloned project");
		System.out.println("Hi am pulled project");


		for (int i=0;i<student.length;i++) {
			student[i]=sc.nextInt();
			
		}
		int x=student[1];
		for (int i=2;i<student.length;i++) {
			
			if(student[i]>x) {
				x=student[i];
			}
			
		}
		System.out.println("The largest number in the array is" + x);

		
		
		
}
}