import java.util.*;

class que13{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int num2=sc.nextInt();
		
		System.out.println("Enter 3rd Number");
		int num3=sc.nextInt();
		
		double sum=num1+num2+num3;
		System.out.println("Sum is: "+sum);
		
		double avg=sum/3;
		System.out.println("Average is: "+avg);
	}
}