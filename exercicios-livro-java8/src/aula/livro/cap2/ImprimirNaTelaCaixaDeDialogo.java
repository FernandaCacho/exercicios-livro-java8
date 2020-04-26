package aula.livro.cap2;

import javax.swing.JOptionPane;

public class ImprimirNaTelaCaixaDeDialogo {

	public static void main(String[] args) {
		String aux;
		float c, l, area;
		
		aux = JOptionPane.showInputDialog("Digite o comprimento: ");
		c = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Digite a largura: ");
		l = Float.parseFloat(aux);

		area = c*l;
		
		JOptionPane.showMessageDialog(null, "A area é: "+area);
	}

}
