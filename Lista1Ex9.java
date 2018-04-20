import javax.swing.JOptionPane;

public class Lista1Ex9{

   public static void main (String[] args){

   JOptionPane.showMessageDialog (null, "Informe 2 numeros inteiros nas telas a seguir:");

   int numero1 = Integer.parseInt (JOptionPane.showInputDialog ("Informe o primeiro numero:"));

   int numero2 = Integer.parseInt (JOptionPane.showInputDialog ("Informe o segundo numero:"));

   int copia1 = numero1;

   numero1 = numero2;

   numero2 = copia1;

   JOptionPane.showMessageDialog (null, "Valores invertidos:\nPrimeiro Numero: " + numero1 +
                                  "\nSegundo Numero: " + numero2);

}}