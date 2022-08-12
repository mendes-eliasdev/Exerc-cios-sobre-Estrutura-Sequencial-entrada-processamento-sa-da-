Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
Entrada:2.00
Saida :A=12.5664


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
