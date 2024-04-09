package exam_int;

import java.util.Scanner;

public class IntExample {
	public static void main(String [] args) {
		int num1, num2, temp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("두 수 교환");
		
		System.out.println("첫번째 수 입력");
		num1 = input.nextInt();
		System.out.println("두번째 수 입력");
		num2 = input.nextInt();
		
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
	}
}
