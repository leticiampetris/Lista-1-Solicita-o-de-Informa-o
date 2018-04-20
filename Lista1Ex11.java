import javax.swing.JOptionPane;

public class Lista1Ex11{

   public static void main (String[] args){

   int anoNascimento = Integer.parseInt (JOptionPane.showInputDialog (
                                        "Informe o seu ano de nascimento:"));

   int mesNascimento = Integer.parseInt (JOptionPane.showInputDialog (
                                        "Informe o seu mes de nascimento:"));

   int diaNascimento = Integer.parseInt (JOptionPane.showInputDialog (
                                        "Informe o seu dia de nascimento:"));

   int ano = Integer.parseInt (JOptionPane.showInputDialog (
                              "Informe o ano atual:"));

   int mes = Integer.parseInt (JOptionPane.showInputDialog (
                              "Informe o mes atual:"));

   int dia = Integer.parseInt (JOptionPane.showInputDialog (
                              "Informe o dia atual:"));

   int converteNascimento = (anoNascimento - 1)*365 + (mesNascimento - 1)*30 + diaNascimento;

   int converteHoje = (ano - 1)*365 + (mes - 1)*30 + dia;
   
   int diasVivo =  converteHoje - converteNascimento;

   int anosVivo = diasVivo/365;

   int mesesVivo = diasVivo/30;

   int horasVivo = (diasVivo)*24;

   int minutosVivo = horasVivo*60;

   int segundosVivo = minutosVivo*60;
   
   JOptionPane.showMessageDialog (null, "Quantidade de dias vivo: "
   + diasVivo + "\nQuantidade de anos vivo: " + anosVivo +
   "\nQuantidade de meses vivo: " + mesesVivo + "\nQuantidade de horas vivo: "
   + horasVivo + "\nQuantidade de minutos vivo: " + minutosVivo +
   "\nQuantidade de segundos vivo: " + segundosVivo);

}}