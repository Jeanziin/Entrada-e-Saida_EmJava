import java.util.Scanner;

public class Entrada_e_saida {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome;
     
    System.out.println("Olá! Qual o seu nome?");
    nome = scan.nextLine();
    
    System.out.println("Seja Bem-Vindo, " +nome+"!");
    
    
	}
}
