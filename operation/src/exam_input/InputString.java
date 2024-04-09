package exam_input;

import java.util.Scanner;

public class InputString {
	public static void main(String [] args) {
		String name, address;
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오");
		name = input.nextLine();
		
		System.out.print("나이를 입력하시오");
		age = input.nextInt();
		input.nextLine();
		
		System.out.print("주소를 입력하시오 : ");
		address = input.nextLine();
		
		System.out.println(name + "님 안녕하세요" + (age) + "살이시네요.");
		System.out.println("주소는 " + address);
		
		input.close();
	}
}
