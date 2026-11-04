/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabanco;

/**
 *
 * @author Evellyn Victoria
 */
public class SistemaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente conta1=new ContaCorrente(1,"Ana",15.00);
        ContaPoupanca conta2 =new ContaPoupanca(2,"Bruno",0.01);
        conta1.depositar(100.00);
        conta2.depositar(100.00);
        
        conta1.exibirSaldo();
        conta2.exibirSaldo();
        
        conta1.sacar(500.00);
        conta2.depositar(-10.00);
        
        conta1.fecharMes();
        conta2.exibirSaldo();
    }

}
