package aula.livro.cap2;
import java.util.*;

public class ImprimirNaTelaApp {

	public static void main(String[] args) {
		
		float c, l, area;
		Scanner sc;
		
		System.out.println("O comprimento �: ");
		sc = new Scanner(System.in);
		
		//nextFloat permite ler um n�mero float sem precisar de convers�o
		c = sc.nextFloat();
		
		System.out.println("A largura �: ");
		sc = new Scanner(System.in);
		l = sc.nextFloat();
		
		area = l*c;
		
		System.out.println("A �rea �: "+area);
		
		
	}

}
