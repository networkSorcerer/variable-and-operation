package exam_input;

import java.util.Scanner;

public class TwoNumberSum {
	//메인 메소드에서 부터 실행이 시작된다
	public static void main(String args[] ) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하시오");
		x= input.nextInt();
		
		System.out.print("두번째 숫자 입력");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println("두 수의 합 : " + sum);
		
		input.close();
	}
}
