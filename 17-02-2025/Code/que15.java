import java.util.*;

class que15{
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);

		int fact=1;
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++){
			
			fact=fact*i;
		}
		System.out.println(fact);
	}
}