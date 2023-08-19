package exemplo;

import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;




public class principal {
	
	public static void main(String[] args) {
		
		float numeros[] = new float[10];
		float maior = Float.MIN_VALUE;
		float menor = Float.MAX_VALUE;
		float soma = 0;
		String resultado = "";

		resultado += "Vetor: \n";
		for (int i = 0; i < 10; i++) {
			numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite um número com decimais: "));
			
			if (numeros[i] > maior) maior = numeros[i];
			if (numeros[i] < menor) menor = numeros[i];
			
			soma += numeros[i];
			
			resultado += numeros[i] + "\n";
			
		}
		
		resultado += "Maior Valor: " + maior + "\n";
		resultado += "Menor Valor: " + menor + "\n"; 
		resultado += "Média: " + (soma / 10)  + "\n";
		
		JOptionPane.showMessageDialog(null, resultado);
		
		
		
		
	}
	
}
