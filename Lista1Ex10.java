import javax.swing.JOptionPane;

public class Lista1Ex10{

   public static void main (String[] args){

   int ano = Integer.parseInt (JOptionPane.showInputDialog ("Informe o seu ano de nascimento:"));

   int idade = 2018 - ano;
   
   JOptionPane.showMessageDialog (null, "Você tem ou terá " + idade + " anos em 2018!");

}}