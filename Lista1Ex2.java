import javax.swing.JOptionPane;

public class Lista1Ex2{

   public static void main (String[] args){

   JOptionPane.showMessageDialog (null, "Vamos calcular o volume ingerido e o valor gasto em água em determinado período.");

   double litrosDia = Double.parseDouble(JOptionPane.showInputDialog("Informe sua ingestão diária de água em litros - em formato 00.00:"));

   int anos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos a quantidade de anos para para o cálculo: "));

   double valorLitro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago por litro de água - em formato 00.00: "));

   double totalLitros = litrosDia * 365 * anos;

   double valorTotal = totalLitros * valorLitro;
   
   JOptionPane.showMessageDialog (null, "Quantidade de água consumida no período: " + totalLitros + " litros" +
				  "\nValor gasto em água no período: R$ " + valorTotal);

}}