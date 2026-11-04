/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabanco;

/**
 *
 * @author Evellyn Victoria
 */
public class Conta {
  int numero;
String titular;
private double saldo;
public Conta (int numero,String titular){
  this.numero=numero;
  this.titular=titular;
  this.saldo=0;
}
 public int getNumero(){
     return numero;
 }
 public String getTitutlar(){
     return titular;
 }
 public double getSaldo(){
     return saldo;
 }
 public void depositar(double valor){
     if(valor>0){
         saldo+=valor;
     }else{
         System.out.println("Valor invalido");
     }   
 }
 public boolean sacar (double valor){
    if(valor >0 && valor<= saldo){
        saldo -=valor;
        return true;
    }else{
        System.out.println("Saldo invalido");
        return false;
    } 
 }
 public void exibirSaldo(){
     System.out.println("Conta"+ numero+ "-"+ titular+"+| Saldo:R$ "+ String.format("%.2f", saldo));
 }
}
