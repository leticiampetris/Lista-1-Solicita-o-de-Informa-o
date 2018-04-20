import javax.swing.JOptionPane;

public class Lista1Ex6{

   public static void main (String[] args){

   JOptionPane.showMessageDialog (null, "Para calcular a média, informe as notas nas telas a seguir em formato 00.00: ");

   double nota1 = Double.parseDouble (JOptionPane.showInputDialog ("Nota 01:"));

   double nota2 = Double.parseDouble (JOptionPane.showInputDialog ("Nota 02:"));

   double nota3 = Double.parseDouble (JOptionPane.showInputDialog ("Nota 03:"));

   double nota4 = Double.parseDouble (JOptionPane.showInputDialog ("Nota 04:"));

   double media = (nota1 + nota2 + nota3 + nota4) / 4;

   JOptionPane.showMessageDialog (null, "Nota 01: " + nota1 +
				  "\nNota 02: " + nota2 +
				  "\nNota 03: " + nota3 +
				  "\nNota 04: " + nota4 +
				  "\nMédia: " + media);

}}