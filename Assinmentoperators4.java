package Myjava;

public class Assinmentoperators4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		        int num=84;
		        System.out.println("-------' += '----------");
			    System.out.println("Before Assignment: " + num);
				num +=10; // 84+10=94|| num=num+10;
				System.out.println("After Assignment: " + num);
 
		        System.out.println("-------' -= '----------");
				System.out.println("Before Assignment: " + num);
				num -=10; // 94-10=84 || num=num-10;
				System.out.println("After Assignment: " + num);

				System.out.println("------' *= '---------");
				System.out.println("Before Assignment: " + num);
				num *= 2; // num=num*2 || 84*2=168
				System.out.println("After Assignment: " + num);

				System.out.println(" -----' /= '--------");
				System.out.println("Before Assignment: " + num);
				num /= 4; // num-num/2=> 168/4 => 42
				System.out.println("After Assignment: " + num);

				System.out.println(" ---------- ' %= ' ----------");
				System.out.println("Before Assignment "+num);
				num %= 10; //num/2> 42/4 => 42
				System.out.println("After Assignment : " + num);
				}

}
