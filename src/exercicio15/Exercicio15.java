package exercicio15;

import javax.swing.JOptionPane;
public class Exercicio15 {
	public static void main(String[] args) {
		int idade;
		String nome;
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		
		if(idade>14 && idade<26) {
			JOptionPane.showMessageDialog(null, "Nome: " + nome + ", foi ACEITO(A)");
			}else{
				JOptionPane.showMessageDialog(null, "Nome: " + nome + ", NÃO foi ACEITO"); }
				}
			}