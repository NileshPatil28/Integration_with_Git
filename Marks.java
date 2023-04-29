import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter your marks less than 100:");
	float marks=s.nextFloat();
	String result=(marks>40)?"pass":"fail";
	System.out.println(result);

	}
}

