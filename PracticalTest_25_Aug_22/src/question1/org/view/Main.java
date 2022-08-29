package question1.org.view;
import java.util.Scanner;

import question1.org.service.ArrayService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[]=new int [5];
		System.out.println("enter the five integer value of array");
		for(int i =0; i<5; i++) {
			 arr1[i] =sc.nextByte();
			 
		}
		ArrayService agv1 =new ArrayService();
		System.out.println(agv1.calculateAverage(arr1));
		
	}

}
