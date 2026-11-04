/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabanco;

/**
 *
 * @author Evellyn Victoria
 */
   public class ContaCorrente extends Conta implements FechamentoMensal {
  private double taxaManutencao;

    public ContaCorrente(int numero, String titular,double taxaManutencao) {
        super(numero, titular);
        this.taxaManutencao=taxaManutencao;
    }
      public void cobrarManutencao(){
       if(sacar(taxaManutencao));
        System.out.println("Manutencao R$"+ String.format("%.2f", taxaManutencao)+"cobrada da conta:"+ getNumero());
      } 
      @Override
     public void fecharMes(){
         cobrarManutencao();
     } 

   
}
    