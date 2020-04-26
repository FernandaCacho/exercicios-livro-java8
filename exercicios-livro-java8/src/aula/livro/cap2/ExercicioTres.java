package aula.livro.cap2;

import javax.swing.JOptionPane;


public class ExercicioTres {

	public static void main(String[] args) {
		float valorTran, valorVenal, valorImposto, porcentagem;
		String aux;
		
		aux = JOptionPane.showInputDialog("Digite o valor da transacao: ");
		//Transformando String em Float
		valorTran = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Digite o valor Venal: ");
		valorVenal = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Digite a porcentagem: ");
		porcentagem = Float.parseFloat(aux);
		
		if(valorTran >= valorVenal) {
			valorImposto = valorTran * porcentagem/100;
		}
		else {
			valorImposto = valorVenal * porcentagem/100;
		}
		
		JOptionPane.showMessageDialog(null, "O valor do Imposto é: " + valorImposto);

	}

}
