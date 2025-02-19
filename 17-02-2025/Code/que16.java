import java.util.*;

class que16{
	
	public static void main(String[] args){
		
		int cnt=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++){
			
			if(num%i==0)
				cnt++;
		}
		
		if(cnt==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime");
		
	}
}