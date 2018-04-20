import javax.swing.JOptionPane;

public class Lista1Ex8{

   public static void main (String[] args){

   JOptionPane.showMessageDialog (null, "Informe o valor das despesas solicitadas nas telas a seguir em formato 000.00: ");

   double celesc = Double.parseDouble (JOptionPane.showInputDialog ("CELESC:"));

   double samae = Double.parseDouble (JOptionPane.showInputDialog ("SAMAE:"));

   double net = Double.parseDouble (JOptionPane.showInputDialog ("NET:"));

   double vivo = Double.parseDouble (JOptionPane.showInputDialog ("VIVO:"));

   double oi = Double.parseDouble (JOptionPane.showInputDialog ("OI:"));

   double iptu = Double.parseDouble (JOptionPane.showInputDialog ("IPTU:"));

   double ipva = Double.parseDouble (JOptionPane.showInputDialog ("IPVA:"));

   double seguro = Double.parseDouble (JOptionPane.showInputDialog ("Seguro auto:"));

   double telefone = vivo + oi;

   double impostos = iptu + ipva;

   double outros = celesc + samae + net + seguro;

   double total = telefone + impostos + outros;

   JOptionPane.showMessageDialog (null, "Valor total das contas de telefone (VIVO e OI): R$ " + telefone +
				  "\nValor total dos impostos (IPTU + IPVA): R$ " + impostos +
				  "\nValor do restante das despesas (CELESC, SAMAE, NET E Seguro auto: R$ " + outros +
				  "\nValor total das despesas: R$ " + total);

}}