package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		//부호연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result : " +result1);
		System.out.println("result : " +result2);
	
		byte b =100;
		//byte result3 = (byte)-b;
		int result3 = -b;
		System.out.println("result : " +result3);
		
		//증감연산자
		int x = 10;
		int y = 10;
		int z;
		System.out.println("-----------------------");
		x++; //단독으로 있을땐 앞에있든 뒤에있든 그냥 1 증가한다고 생각하면 됨 11
		++x;//12
		System.out.println("x = "+x);
		
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y = "+ y);
		
		System.out.println("-----------------------");
		z = x++; // 원래는 대입연산자는 가장 마지막이라서 증감연산자부터인데 증감연산자가 뒤에 있으니까 다른연산자가 시행된 후에 실행된다. 다른연산자는 대입연산자 이므로 x가 z에 대입된 후에 더해짐
		System.out.println("z = "+z);//12
		System.out.println("x = "+x);//13
		
		System.out.println("-----------------------");
		z = ++x; // 원래는 대입연산자는 가장 마지막이라서 증감연산자부터인데 증감연산자가 뒤에 있으니까 다른연산자가 시행된 후에 실행된다. 다른연산자는 대입연산자 이므로 x가 z에 대입된 후에 더해짐
		System.out.println("z = "+z);//14
		System.out.println("x = "+x);//14
		
		System.out.println("-----------------------");
		z = ++x + y++;
		//1) ++x                             =>15
		//2) y++ <-문제 그래서 밑에 +랑 순서가 바뀜 +  => x +y =>15 + 8 = 23 
		//3) +                            y++ => 9
		//4) =                                => z = (x+y)=>z =23
		System.out.println("z = "+ z);//23
		System.out.println("x = "+ x);//15
		System.out.println("y = "+ y);//9
		
		/***/
		x = 5;
		y = 5;
		System.out.println("-----------------------");
		z = x++ + --y;
		//3)x++ =>6
		//1)--y =>4
		//2)x + y =>9
		//4)z = x + y =>9
		System.out.println("z = "+ z);//9
		System.out.println("x = "+ x);//6
		System.out.println("y = "+ y);//4
		
		System.out.println("-----------------------");
		z = --x + y++;
		//1)--x =>5
		//2)x + y => 5 + 4 =>9
		//3)y ++=>5
		//4)z = x + y =>9
		System.out.println("z = "+ z);//9
		System.out.println("x = "+ x);//5
		System.out.println("y = "+ y);//5
		
		//논리 부정 연산자
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		boolean isOpen = true;
		
		if(!isOpen) {
			System.out.println("영업시간이 종료되었씁니다.");
		}else {
			System.out.println("영업 중입니다.");
		}
		
		//산술연산자
		int v1 = 5;
		int v2 = 2;
		int result;
		
		result = v1 + v2;
		System.out.println("result : "+ result);
		
		result = v1 - v2;
		System.out.println("result : "+ result);
		
		result = v1 * v2;
		System.out.println("result : "+ result);
		
		result = v1 / v2;
		System.out.println("result : "+ result);
		
		result = v1 % v2;
		System.out.println("result : "+ result);
		
		//비교연산자
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = ( num1 >= num2 );
		System.out.println(">= : " + bResult);
		bResult = ( num1 == num2 );
		System.out.println("== : " + bResult);
		bResult = ( num1 != num2 );
		System.out.println("!= : " + bResult);
		
		char char1 = 'A';
		char char2 = 'B';
		System.out.println("문자 비교 : " + (char1 > char2));
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double : " + (v3 == v4));
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float VS double : " + (v5 == v6));
		System.out.println("float VS float : " + (v5 == (float)v6));
				
		//논리연산자
		int charCode = 'A';
		
		//유니코드 중 65보다 크거나 같고 90보다는 작거나 같으면 대문자
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자");
		}
	
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if((charCode >=97) & (charCode <=122)) {
			System.out.println("소문자");
		}
		
		//유니코드 중 48보다 크고 57보다 작으면 숫자 0~9
		if(charCode >48 && charCode<57) {
			System.out.println("숫자0~9");
		}
		
		int numValue = 6;
		
		if((numValue % 2 == 0) | (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요.");
		}
		
		if((numValue % 2 == 0) || (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요.");
		}
		
		//복합 대입 연산자
		int resultA = 0;//첫번째 있는 연산자를 하고 그 결과를 대입하는 것
		resultA += 10; // resultA = resultA + 10 
		System.out.println("+= :  " + resultA);
		resultA -= 5; // resultA = resultA - 5 
		System.out.println("-= :  " + resultA);
		resultA *= 3;// resultA = resultA * 3
		System.out.println("*= :  " + resultA);
		resultA /= 5; // resultA = resultA / 5
		System.out.println("/= :  " + resultA);
		resultA %= 3; // resultA = resultA % 3 
		System.out.println("%= :  " + resultA);
		
		//삼항연산자
		int score = 85;
		char grade = score > 90 ?'A' : 'B' ;
		System.out.printf("성적은 %d이고 등급은 %s 입니다\n",score, grade); //%c는 char타입 char타입을 %d로하면 숫자로 나옴 근데 %s안에 %c를 포함하는 더 큰 범위여서 %s를 사용하면 됨  
		
		int age = 17;
		String message =(age >= 20) ? "성인" : "미성년자" ;
		System.out.printf("나이는 %d살이며 %s입니다.\n", age , message);
		
		
	}

}
