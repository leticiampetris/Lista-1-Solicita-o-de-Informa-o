import javax.swing.JOptionPane;

public class Lista1Ex2{

   public static void main (String[] args){

   JOptionPane.showMessageDialog (null, "Vamos calcular o volume ingerido e o valor gasto em �gua em determinado per�odo.");

   double litrosDia = Double.parseDouble(JOptionPane.showInputDialog("Informe sua ingest�o di�ria de �gua em litros - em formato 00.00:"));

   int anos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos a quantidade de anos para para o c�lculo: "));

   double valorLitro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago por litro de �gua - em formato 00.00: "));

   double totalLitros = litrosDia * 365 * anos;

   double valorTotal = totalLitros * valorLitro;
   
   JOptionPane.showMessageDialog (null, "Quantidade de �gua consumida no per�odo: " + totalLitros + " litros" +
				  "\nValor gasto em �gua no per�odo: R$ " + valorTotal);

}}