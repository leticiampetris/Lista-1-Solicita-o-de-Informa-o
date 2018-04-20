import javax.swing.JOptionPane;

public class Lista1Ex5{

   public static void main (String[] args){

   String nome = JOptionPane.showInputDialog("Informe o modelo do carro:");

   double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro no formato 00000.00:"));

   double parcela = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cada parcela no formato 0000.00:"));

   int meses = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de parcelas do financiamento:"));

   double total = meses * parcela;

   double juros = total - valor;

   JOptionPane.showMessageDialog (null, "Modelo do carro: " + nome +
				  "\nValor do carro: " + valor +
				  "\nValor da parcela: " + parcela +
				  "\nQuantidade de parcelas: " + meses +
				  "\nValor total do financiamento: " + total +
				  "\nTotal de juros e taxas: " + juros);


}}