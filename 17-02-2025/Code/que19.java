import java.util.*;

class que19{
	
	public static void main(String[] args){
		
		int res=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Base");
		int base=sc.nextInt();
		
		System.out.println("Enter a Exponant");
		int exponent=sc.nextInt();
		
		for(int i=1; i<=exponent; i++){
			
			 res=res*base;
		}
		System.out.println(res);
		
		
	}
}