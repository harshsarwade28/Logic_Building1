import java.util.*;

class que6{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st NUmber: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		int num2 = sc.nextInt();
		
		int add=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		float div=num1/num2;
		float mod=num1%num2;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		
	}
}