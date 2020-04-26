package aula.livro.cap2;
import java.util.*;

public class ImprimirNaTelaApp {

	public static void main(String[] args) {
		
		float c, l, area;
		Scanner sc;
		
		System.out.println("O comprimento é: ");
		sc = new Scanner(System.in);
		
		//nextFloat permite ler um número float sem precisar de conversão
		c = sc.nextFloat();
		
		System.out.println("A largura é: ");
		sc = new Scanner(System.in);
		l = sc.nextFloat();
		
		area = l*c;
		
		System.out.println("A área é: "+area);
		
		
	}

}
