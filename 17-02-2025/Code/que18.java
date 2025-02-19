import java.util.*;

class que18{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Celsius");
		int Celsius=sc.nextInt();
		
		 float Fahrenheit = (Celsius * 9/5) + 32;
		 System.out.println(Fahrenheit);
		
	}
}