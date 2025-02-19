import java.util.*;

public class print {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int no1=sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int no2=sc.nextInt();
		
		System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        int res;
        
        switch(operator) {
        
        case '+':
        	res=no1+no2;
        	System.out.println(res);
        	break;
        	
        case '-':
        	res=no1+no2;
        	System.out.println(res);
        	break;
        	
        case '*':
        	res=no1+no2;
        	System.out.println(res);
        	break;
        	
        case '/':
        	  if (no2 == 0) {
                  System.out.println("Error: Cannot divide by 0.");
              } else {
                  res = no1 / no2;
                  System.out.println("Result: " + res);
              }
        	break;
        case '%':
        	res=no1+no2;
        	System.out.println(res);
        	break;
        	
        	default:
        		System.out.println("Nothing");
        	
        	
        }
	}
}
