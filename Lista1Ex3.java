import javax.swing.JOptionPane;


public class Lista1Ex3{

   public static void main(String[] args){

   JOptionPane.showMessageDialog (null, "Informe a seguir 2 n�meros inteiros para visualizar algumas opera��es matem�ticas com os mesmos: ");

   int numero1 = Integer.parseInt (JOptionPane.showInputDialog ("Informe o primeiro n�mero:"));

   int numero2 = Integer.parseInt (JOptionPane.showInputDialog ("Informe o segundo n�mero:"));

   int soma = numero1 + numero2;

   int subtracao1 = numero1 - numero2;

   int subtracao2 = numero2 - numero1;
 
   int multiplicacao = numero1 * numero2;

   double divisao1 = (double) numero1 / numero2;

   double divisao2 = (double) numero2 / numero1;

   int produto1 = numero1 * numero1;

   int produto2 = numero2 * numero2;

   JOptionPane.showMessageDialog (null, "Soma: " + numero1 + "+" + numero2 + "=" + soma +
				  "\nSubtra��o: " + numero1 + "-" + numero2 + "=" + subtracao1 +
 				  " enquanto " + numero2 + "-" + numero1 + "=" + subtracao2 +
				  "\nMultiplica��o: " + numero1 + "*" + numero2 + "=" + multiplicacao +
				  "\nDivis�o: " + numero1 + "/" + numero2 + "=" + divisao1 +
				  " enquanto " + numero2 + "/" + numero1 + "=" + divisao2 +
				  "\nProduto do n�mero " + numero1 + "=" + produto1 +
				  "\nProduto do n�mero " + numero2 + "=" + produto2);

}}
