package exam_variable;

public class VariableExchangeExample {
	public static void main(String [] args) {
		int number1, number2, temp;
		
		number1 = 3;
		number2 = 5;
		
		System.out.println("교환전 number1와 number2의 값");
		System.out.println("number1 = " + number1 + "number2 =" + number2 );
		
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("교환후 number1와 number2의 값");
		System.out.printf("number1 = %d number2 = %d", number1, number2);
	}
}
