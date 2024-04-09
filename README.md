# 자바 프로그래밍 - 변수와 연산

![Java Logo](https://github.com/networkSorcerer/variable-and-operation/assets/155520035/aff95bd5-747a-40ae-8099-2c8480ce7ed2)
![Eclipse IDE](https://github.com/networkSorcerer/variable-and-operation/assets/155520035/1a4fd77f-fba5-46ce-89d0-475c5d95f1be)

## 프로그램이란?

프로그램은 컴퓨터를 구성하는 장치를 조작하여 원하는 결과물을 얻기 위해 작업 순서를 나열한 명령어의 집합입니다. 자바는 프로그램을 만들기 위한 하나의 도구입니다.

- **고급언어 (High-Level Language):** 사람이 이해하기 쉬운 프로그래밍 언어입니다.
- **저급언어 (Low-Level Language):** 기계어에 가까운 프로그래밍 언어입니다.

## 컴파일과 실행

- **컴파일 (Compile):** 고급언어를 기계어로 변환하는 과정을 말합니다.
- 자바 프로그램은 컴파일 후 바이트 코드를 생성하고, 이를 JVM (Java Virtual Machine)에서 실행합니다.
- 자바는 플랫폼에 독립적이며, 한 번의 컴파일로 다양한 운영체제에서 실행할 수 있습니다.

## 자바의 특징

- 단순, 이식 가능, 객체지향, 인터프리터 방식, 고성능, 멀티스레드 지원, 동적, 안전, 분산처리 지원, 컴퓨터 구조에 중립적

## 변수와 연산

### 변수 (Variable)

변수는 프로그램에서 사용할 값을 저장하기 위해 할당받는 메모리 공간을 의미합니다.

- **자료형 (Data Type):** 변수에 저장되는 자료의 타입을 의미합니다.
- **선언 (Declaration):** 변수를 컴파일러에게 알리는 것을 말합니다.

### 변수의 규칙

- 영어 대소문자 구분, 길이 제한 없음
- 예약어 사용 금지
- 숫자로 시작 불가능
- 특수문자는 '_' ,  '$' 만 사용 가능
- 여러 단어를 섞어 변수 이름을 만들 때는 두 번째 단어부터 첫 글자를 대문자로 사용
- 이름에 공백문자 사용 불가능

### 변수 사용 예시

```java
package exam_variable;

public class VariableInitializationExample {
	public static void main(String [] args) {
		//변수 선언과ㅑ 동시에 초기 값 설정. 10을 변수 value의 초기값으로 저장
		int value = 10;
		
		//변수 value값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 촐력
		System.out.println("value=" + value + "result=" + result);
		//printf (format) 변수의 값을 출력하기 위해 변환 문자 (%)로 명시. 정수 : %d 문자 : %c 
		//문자열 : %s 실수 : %f
		System.out.printf("value=%d\nresult=%d", value, result);
	}
}
```

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

5) 데이터 종류

 

논리 

문자

정수

실수

참조

 

6) 논리형 

boolean 타입을 사용하며 1바이트 만큼의 메모리 공간을 차지한다  


package exam_boolean;

public class BooleanExample {
	public static void main(String [] args) {
		//상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 사용 
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}
		
		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);
		System.out.println("result : " + result1);
		System.out.println("result : " + result2);
	}
}

7) 소스코드 입력


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

