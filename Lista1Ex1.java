import javax.swing.JOptionPane;

public class Lista1Ex1{

   public static void main (String[] args){

      int numero = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número inteiro para visualizar seu antecessor e sucessor:"));
      int antecessor = numero - 1;
      int sucessor = numero + 1;
      JOptionPane.showMessageDialog (null, "Número informado: " + numero +
				     "\nAntecessor: " + antecessor +
			             "\nSucessor: " + sucessor);

}}