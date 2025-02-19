/*Question 1 : static keyward is not there 

public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
}*/


/*Question 2 : public keyward is not there 

public class Main { 
public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} */

/*Question 3 : Main method contains int it should be void 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!");  
 } 
}*/


/*Question 4 : String[] args is mission 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} */


/*Question 5 : JVM does not recognize this is the starting point of code int[] args
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
}
*/

/*Question 6 : Y should be initialise and declared here
public class Main { 
 public static void main(String[] args) { 
 
 int y=0;
 int x = y + 10; 
 System.out.println(x); 
 } 
} */

/*Question 7 : Wrong datatype int it should be String
public class Main { 
 public static void main(String[] args) { 
 String x = "Hello"; 
 System.out.println(x); 
 } 
}*/

/*Question 8 : Round bracket should be closed and there should be terminator symbol
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} */

/*Question 9 : Wrong identifier
public class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} */

/*Question 10 : Object is not created
public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 
 public static void main(String[] args) {

Main main = new Main();	 
 main.display(); 
 main.display(5); 
 } 
}*/

/*Question 11 : Trying access a array location which is not there
public class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
} */


/*Question 12 : Terminator condition is not there
public class Main { 
 public static void main(String[] args) { 
 int cnt=1;
 while (cnt<=5) { 
 System.out.println("Infinite Loop");
cnt++; 
 } 
 } 
}*/

/*Question 13 : The value of str is null so cant get the value
public class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} */

/*Question 14 : Datatype should be String
public class Main { 
 public static void main(String[] args) { 
 String num = "Hello"; 
 System.out.println(num); 
 } 
} */

/*Question 15 : incompatable datatype all should be double
public class Main { 
 public static void main(String[] args) { 
 double num1 = 10; 
 double num2 = 5.5; 
 double result = num1 + num2; 
 System.out.println(result); 
 } 
}*/

/*Question 16 : incompatable datatype all should be double
public class Main { 
 public static void main(String[] args) { 
 double num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
}*/

/*Question 17 : Should be 1 multiplication symbol
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a * b; 
 System.out.println(result); 
 } 
}*/


/*Question 18 : No Errors
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
}*/

/*Question 19 : Cannot divide by 0
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 


/*Question 20 : Semicolan is mission
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World"); 
 } 
} 


Question 21 : Missing closing brace
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 }
}


Question 22 : Misspatch of syntax
public class Main { 
    public static void displayMessage() { 
        System.out.println("Message"); 
    } 
    public static void main(String[] args) { 
        displayMessage(); 
    } 
}


Question 23 : No Errors 
public class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
 default: 
 System.out.println("Default case"); 
 } 
 } 
}



Question 24 : No Errors 
public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
}


Question 25 : Value should be double as there is double value is declared
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
}


Question 26 : Case is repeating
public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
}

*/