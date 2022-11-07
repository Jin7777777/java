package test;

public class test221104 {
	public static void main(String[] args) {
		//문제1
		int x = -5;
		int y = 10;
		int result;
		
		//1-1
		result = -x;
		System.out.printf("x : %d, result : %d\n", x, result);
		
		//1-2
		result = ++x + y--;
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);
		
		//1-3
		result = ++x + --y;
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);
		
		//문제2
		int m = 10;
		int n = 5;
		System.out.println( ( m*2 < n*4 ) || ( n<5 ) );
		 
		System.out.println( ( m/2 >= 5) && ( n%2 <= 1) );
		
		//문제3
		
		int val = 0;
		//val = val + 10; 
		val += 10;
		System.out.println("+= : " + val);
		
		//val = val - 5;
		val -= 5;
		System.out.println("-= : " + val);
		
		//val = val * 3;
		val *= 3;
		System.out.println("*= : " + val);
		
		//val = val / 5;
		val /= 5;
		System.out.println("/= : " + val);
		
		//문제4 
		int value = val > 0 ? val  : 0 ;
		System.out.printf("val의 값이 양수이면 %d, 아니면 0이다.\n",val);
		
		//문제5 !!!!!
		
		int a = 10; 
		int b = -8;
		
		boolean num = (a < 0 || b < 0);
		
		if(!num) {
			System.out.println("both a and b are zero or more");
		}else {
			System.out.println("One of a or b is negative number");
		}
		
	}
}
