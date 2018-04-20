import javax.swing.JOptionPane;

public class Lista1Ex4{

   public static void main(String[] args){

   int numero = Integer.parseInt(JOptionPane.showInputDialog (null, "Informe um número inteiro para visualizar sua tabuada: "));

   int x0 = numero * 0;
   int x1 = numero * 1;
   int x2 = numero * 2;
   int x3 = numero * 3;
   int x4 = numero * 4;
   int x5 = numero * 5;
   int x6 = numero * 6;
   int x7 = numero * 7;
   int x8 = numero * 8;
   int x9 = numero * 9;
   int x10 = numero * 10;

   JOptionPane.showMessageDialog (null, "Tabuada do número " + numero + ":" +
				"\n" + numero + " * 0 = " + x0 +
				"\n" + numero + " * 1 = " + x1 +
				"\n" + numero + " * 2 = " + x2 +
				"\n" + numero + " * 3 = " + x3 +
				"\n" + numero + " * 4 = " + x4 +
				"\n" + numero + " * 5 = " + x5 +
				"\n" + numero + " * 6 = " + x6 +
				"\n" + numero + " * 7 = " + x7 +
				"\n" + numero + " * 8 = " + x8 +
				"\n" + numero + " * 9 = " + x9 +
				"\n" + numero + " * 10 = " + x10);


}}