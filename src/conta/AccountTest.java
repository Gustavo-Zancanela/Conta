/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta;

/**
 *
 * @author ALUNO
 */
public class AccountTest {

   
    public static void main(String[] args) {
     
        CheckingAccount CA = new CheckingAccount();
        CA.setName("Bill");
        CA.setBalance(1000);
        CA.setInterest(12);
        
        CA.displayCustomer();
        
        CA.Withdraw(1000);
        
        CA.setMeses(14);
        CA.calculoDaTaxa();
        CA.TituloDoTesouro();
    }
    
}
