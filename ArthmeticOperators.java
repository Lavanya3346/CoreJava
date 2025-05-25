package lavanya;

public class ArthmeticOperators {
public static void main(String[] args) {
	int a = 15;
	int b = 4;
	int addition = a+b;
    int subtraction = a-b;
    int multiplication = a*b;
    int division = a/b;
    int modulus = a%b;
    boolean isGreater = a>b;
    boolean isEqual = a==b;

    System.out.println("Addition: " + addition);
    System.out.println("Subtraction: " + subtraction);
    System.out.println("Multiplication: " + multiplication);
    System.out.println("Division: " + division);
    System.out.println("Modulus: " + modulus);
    System.out.println("Is a > b? " + isGreater);
    System.out.println("Is a == b? " + isEqual);
	//task-2 Directly print the result without storing//
    System.out.println();
    System.out.println("Addition: " + (a + b));
    System.out.println("Subtraction: " + (a - b));
    System.out.println("Multiplication: " + (a * b));
    System.out.println("Division: " + (a / b));
    System.out.println("Modulus: " + (a % b));
    System.out.println("a > b: " + (a > b));
    System.out.println("a == b: " + (a == b));
	
	
	
}
}
