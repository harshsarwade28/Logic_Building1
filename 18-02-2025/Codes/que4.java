import java.util.*;

class que4{
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Time: ");
	int time=sc.nextInt();
	
	if(time >= 5 && time<12)
		System.out.println("Good Morning");
	
	else
		System.out.println("Nothing");
	
	}
}