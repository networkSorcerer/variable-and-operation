# variable-and-operation

![java](https://github.com/networkSorcerer/variable-and-operation/assets/155520035/aff95bd5-747a-40ae-8099-2c8480ce7ed2)
![이클립스](https://github.com/networkSorcerer/variable-and-operation/assets/155520035/1a4fd77f-fba5-46ce-89d0-475c5d95f1be)


# 프로그램 
컴퓨터를 구성하는 장치 (CPU, 메모리, 입출력 장치, 하드 디스크 등)을 조작하여, 원하는 결과물을 얻도록 작업 순서를 나열해 놓은 명령어들의 집합이다

자바는 명령어를 표현하는 하나의 도구이다

 

개발자는 프로그램 언어를 사용해서 명령어를 표현하고, 표현된 명령어를 작업 순서에 맞게 나열하여 프로그램을 작성한다

 

사람이 이해하기 쉬운 프로그램 언어를 고급언어

기게어에 가까운 프로그램 언어를 저급언어

 

고급언어를 기계어로 변환하는 과정을 컴파일이라한다

 

자바 개발자는 소스파일을 작성하고 컴파일하여 바이트 코드 생성까지만 하고 바이트 코드를 기계어 코드로 변환하는 작업과 자바 프로그램 실행에 관련된 모든 작업은 자바 가상머신(JVM , Java Virtual Machine)에서 담당한다

 

자바가 다른 프로그램 언어와 다른 점은 컴파일 작업을 거쳐 생성된 파일이 기계어 코드가 아니라는 사실이다

 

바이트 코드는 기계어로 변환하기 전 중간 단계의 코드이다

 

자바 실행 구조의 가장 큰 장접은 자바 실행 파일이 실행되는 컴퓨터가 달라져도 추가적인 작업을 할 필요가 없다는 것이다 

 

자바는 플랫폼에 독립적인 언어라고 한다

 

자바 플랫폼은 JAVA API 와 JVM으로 구성된다

 

자바 컴파일러가 소스코드를 컴파일 하면 바이트코드가 생성된다

바이트 코드를 해석하여 실행하는 소프트 웨어는 자바 가상머신이다

자바가 어떤 컴퓨터에서나 실행이 가능한 이유는 특정한 컴퓨터가 아닌 중간적인 코드를 생성하고 이것을 해석하여 실행하는 구조로 되어있기 때문이다

 

# 자바특징

단순, 이식 가능, 객체지향, 인터프리터 방식, 고성능, 멀티스레드지원, 견고, 동적, 안전, 분산처리지원, 컴퓨터구조에 중립적

1)변수란? 프로그램 작성시 사용할 값을 저장하기 위해 할당받는 메모리 공간을 변수라고 한다

 

자바의 변수는 다양한 타입의 값을 저장할수 없다

 

2) 자료 형은 변수에 저장되는 자료의 타입을 의미한다

 

선언이란 컴파일러 에게 어떤 변수를 상요하겠다고 미리 알리는것입니다 

 

변수 선언은 변수를 생성한다는 말과도 같다

 

3) 변수의 이름은 식별자의 일종으로 다음과같은 규칙을 따른다

영어 대소문자가 구분되며 길이 제한이 없다

예약어를 사용하면 안된다

숫자로 시작하면 안된다

특수문자는 '_' ,  '$' 만 사용 가능하다

여러 단어를 섞어서 이름을 만들때 두번째 단어부터 첫 글자를 대문자로 한다

이름 사이에 공백문자 포힘할수 없다

 

4) 변수에 데이터 저장 

자바 프로그래밍에서 = 기호는 오른쪽의 값을 왼쪽에 저장하라는의미이다

다르게 표현하면 "대입한다" 라고 하며 만일 변수를 선언한후 처음 값을 저장한다면 "초기화한다"라고 표현한다

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

