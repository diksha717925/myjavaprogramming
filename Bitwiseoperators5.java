package Myjava;

public class Bitwiseoperators5 {

		class Bits{
		    public static void main(String[] args){

		    System.out.println("Bitwise and Operator");

		    int a=0;
		    int b=0;
		    System.out.println("when a=0 & b=0" +" : " + (a&b)); // 0

		    a=1;
		    b=0;
		    System.out.println("when a=1 & b=0" +" : " + (a&b)); // 0

		    a=0;
		    b=1;
		    System.out.println("when a=0 & b=1" +" : " + (a&b)); // 0

		    a=1;
		    b=1;
		    System.out.println("when a=1 & b=1" +" : "+ (a&b)); // 1

		    int x;
		    int y;
		    System.out.println("Bitwise OR Operator");

		    x=0;
		    y=0;
		    System.out.println("when x=0 & y=0" +" : "+ (x|y)); // 0

		    x=1;
		    y=0;
		    System.out.println("when x=1 & y=0" +" : "+ (x|y)); // 0
		   
		    x=0;
		    y=1;
		    System.out.println("when x=0 & y=1" +" : "+ (x|y)); // 0

		    x=1;
		    y=1;
		    System.out.println("when x=1 & y=1" +" : "+ (x|y)); // 0

		    }
		}
	}



