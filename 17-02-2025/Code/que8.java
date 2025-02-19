import java.util.*;

class que8{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("number 1 is: "+num1);
		System.out.println("number 2 is: "+num2);
		
	}
}