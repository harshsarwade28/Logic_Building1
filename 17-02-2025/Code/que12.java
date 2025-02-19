import java.util.*;

class que12{
	
	public static void main(String[] args){
		
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		while(num!=0){
			
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		System.out.println(sum);
		
	}
}