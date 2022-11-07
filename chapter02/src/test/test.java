package test;

public class test {

	public static void main(String[] args) {
		//1번문제
				int value1 = 37;
				int value2 = 91;
				System.out.println("value1 : "+ value1 +", "+ "value2 : "+ value2);
				
				//2번문제
				System.out.println(value2+value1);
				System.out.println(value2-value1);
				System.out.println(value2*value1);
				System.out.println(value2/value1);
				
				//3번문제
				int var1 = 128;
				System.out.printf("%dint\n" ,var1);
				
				String var2 = "B";
				System.out.printf("%sStr\n",var2);
				
				int var3 = 44032;
				System.out.printf("%dint\n" ,var3);
				
				long var4 = 100000000000L;
				System.out.printf("%dlong\n", var4);
			
				double var5 = 43.93106;
				System.out.printf("%.5f\n", var5);
				
				double var6 = 301.3;
				System.out.printf("%.1f\n",var6);
				
				//4번문제
				byte a = 35;
				byte b = 25;
				int c = 463;
				long d = 1000L;
				
				long result1 = a + c + d;
				System.out.println(result1);
				
				int result2 = a + b + c;
				System.out.println(result2);

				double e = 45.31;
				double result3 = c + d + e;
				System.out.println(result3);
				
				
				//5번문제
				//출력예시) A278번지10.0 
				int intValue1 = 24;
				int intValue2 = 3;
				int intValue3 = 8;
				int intValue4 = 10;
				char charValue = 'A';
				String strValue = "번지";
				System.out.println("" +(char)charValue +(intValue1+intValue2)+""+intValue3+strValue+ (float)intValue4);	

	}

}
