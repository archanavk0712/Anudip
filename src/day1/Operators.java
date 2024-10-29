package day1;
public class Operators
{
	public static void main(String[] args) 
	{
		int num1 = 25;
		int num2 = 30;
		int result = num1 + num2;
		
		System.out.println("Sum of two numbers : " + result);
        System.out.println("Difference of two numbers : "+ (num1 - num2));
        System.out.println("Multiplication of two numbers : "+(num1 * 10));
        
        System.out.println("======================");
        //Assignment operators 
        
        int a = 10;
        System.out.println("A value is " + a);
        
        a += 20; //a = a+20;
        System.out.println("A value is " + a);
        
        a *= 60; //a = a*60;
        System.out.println("A value is " + a);
        
        a /= 10; //a = a/10;
        System.out.println("A value is " + a);
        
        System.out.println("====================");
        
        // Relational/Comparison
        
        int x = 20;
        int y = 40;
        
        System.out.println(x>y);
        System.out.println(x==y);
        System.out.println(x>10);
        
        System.out.println("======================");
        //Logical operators 
        
        int i = 1;
        int j = 2;
        
        boolean result1 = i == 1 && i >= 1;//and
        
        System.out.println(result1);
        
        boolean result2 = i > 5 || i == 1;//or
        
        System.out.println(result2);
        
        System.out.println(!true);
        System.out.println(!(20<5));
        System.out.println("======================");
         //ternary operator
        int m=10, n=20;
        int max= m>n?m+=10: n-3;
        System.out.println(max);
        }
}


