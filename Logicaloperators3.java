package Myjava;

public class Logicaloperators3 {

	public class LogicalOperatorsDemo {
	    public static void main(String[] args) {

	        System.out.println("Logical And operator &&");
	        System.out.println("---------------------------------");

	        boolean st1=false, st2=false;
	        System.out.println("Operand A "+st1);
	        System.out.println("Operand B "+st2);
	        System.out.println("Result for : && : "+(st1&&st2));
	        System.out.println("------------------------------");

	        boolean st3=false, st4=true;
	        System.out.println("Operand A "+st3);
	        System.out.println("Operand B "+ st4);
	        System.out.println("Result for : && : "+(st3&&st4));
	        System.out.println("------------------------------");

	        boolean st5=true, st6=false;
	        System.out.println("Operand A "+st5);
	        System.out.println("Operand B "+ st6);
	        System.out.println("Result for : && : "+(st5&&st6));
	        System.out.println("------------------------------");

	        boolean st7=true, st8=true;
	        System.out.println("Operand A "+st7);
	        System.out.println("Operand B "+ st8);
	        System.out.println("Result for : && : "+(st7&&st8));

	        System.out.println("####################");

	        System.out.println("Logical OR Operator");

	        boolean or1=false, or2=false;
	        System.out.println("Operand A "+ or1);
	        System.out.println("Operand B "+ or2);
	        System.out.println("Result for : || : "+(or1||or2));
	        System.out.println("---------------------------------");

	        boolean or3=true, or4=false;
	        System.out.println("Operand A "+ or3);
	        System.out.println("Operand B "+ or4);
	        System.out.println("Result for : || : "+(or3||or4));
	        System.out.println("---------------------------------");

	        boolean or5=false, or6=true;
	        System.out.println("Operand A "+ or5);
	        System.out.println("Operand B "+ or6);
	        System.out.println("Result for : || : "+(or5||or6));
	        System.out.println("---------------------------------");

	        boolean or7=true, or8=true;
	        System.out.println("Operand A "+ or7);
	        System.out.println("Operand B "+ or8);
	        System.out.println("Result for : || : "+(or7||or8));
	        System.out.println("---------------------------------");

	        System.out.println("Logical Not Operator");

	        boolean statement=true;
	        System.out.println(!statement);

	        statement=false;
	        System.out.println(!statement);

	        int num=7, num1=5;
	        System.out.println((num!=num1)&&(num>num1));  // true
	        System.out.println((num==num1)&&(num>=num1)); // false
	        System.out.println((num==num1)&&(num<=num1)); // false
	        System.out.println((num!=num1)&&(num<num1)); // false

		  {
		        int x = 25, y = 40, z = 25;

		        boolean res = (x == z) && (y > x) || (y < 10);
		        // (25 == 25) && (40 > 25) || (false)
		        // true && true || false
		        // => true
		        System.out.println(res);  // Output: true

		        int a = 15, b = 20, c = 10, d = 15;
		        boolean res2 = ((a != b) && (c < d)) || !(b > 100);
		        // (15 != 20) && (10 < 15) || !(false)
		        // true && true || true
		        // => true
		        System.out.println(res2);  // Output: true
		   

		        int p = 5, q = 10, r = 20;
		        boolean res3 = (p + q == r) && (r > q) && !(p > r);
		        // (5 + 10 == 20) && (20 > 10) && !(false)
		        // (15 == 20) && true && true
		        // false && true && true
		        // => false
		        System.out.println(res3);  // Output: false

		        int m = 100, n = 50, o= 25;
		        boolean res4 = ((m > n) || (o > n)) && !(m == o);
		        // (100 > 50 || 25 > 50) && !(100 == 25)
		        // (true || false) && true
		        // => true
		        System.out.println(res4);  // Output: true
		    }
	    }
	}
}



		
		
		
		
		
		
		
		
		
	


