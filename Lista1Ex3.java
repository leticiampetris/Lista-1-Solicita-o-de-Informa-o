import javax.swing.JOptionPane;


public class Lista1Ex3{

   public static void main(String[] args){

   JOptionPane.showMessageDialog (null, "Informe a seguir 2 números inteiros para visualizar algumas operações matemáticas com os mesmos: ");

   int numero1 = Integer.parseInt (JOptionPane.showInputDialog ("Informe o primeiro número:"));

   int numero2 = Integer.parseInt (JOptionPane.showInputDialog ("Informe o segundo número:"));

   int soma = numero1 + numero2;

   int subtracao1 = numero1 - numero2;

   int subtracao2 = numero2 - numero1;
 
   int multiplicacao = numero1 * numero2;

   double divisao1 = (double) numero1 / numero2;

   double divisao2 = (double) numero2 / numero1;

   int produto1 = numero1 * numero1;

   int produto2 = numero2 * numero2;

   JOptionPane.showMessageDialog (null, "Soma: " + numero1 + "+" + numero2 + "=" + soma +
				  "\nSubtração: " + numero1 + "-" + numero2 + "=" + subtracao1 +
 				  " enquanto " + numero2 + "-" + numero1 + "=" + subtracao2 +
				  "\nMultiplicação: " + numero1 + "*" + numero2 + "=" + multiplicacao +
				  "\nDivisão: " + numero1 + "/" + numero2 + "=" + divisao1 +
				  " enquanto " + numero2 + "/" + numero1 + "=" + divisao2 +
				  "\nProduto do número " + numero1 + "=" + produto1 +
				  "\nProduto do número " + numero2 + "=" + produto2);

}}
