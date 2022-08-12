import java.util.Locale;
import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double Pi = 3.14159;
    double Raio = sc.nextDouble();
    double  A = (Raio * Raio * Pi);
   
    System.out.printf("A = %.4f",A);
    sc.close();
	}

}
