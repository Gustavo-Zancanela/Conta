/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

/**
 *
 * @author ALUNO
 */
public class CheckingAccount {
    public double balance;
    public double interestRate;
    public String name;
    public double taxa; 
    public int meses;
    
    public void deposit(int x)
    {
        balance += x;
    }
    
    public void displayCustomer()
    {
        System.out.println("Cliente " + name);
        System.out.println("Saldo " + balance);
        System.out.println("Taxa " + interestRate);
    }            
    
    public String NameCustomer()
    {
        return name;
    }
    
        public void setName(String name)
        {
            this.name = name;
        }
    
    public double BalanceCustomer()
    {
        return balance;
    }
    
        public void setBalance(double balance)
        {
            this.balance = balance;   
        }
    
    
    public double InterestRateCustomer()
    {
        return interestRate;
    }
    
        public void setInterest(double interestRate)
        {
            this.interestRate = interestRate;
        }  
        
        
        public void Withdraw(double ret)
        {
            if (ret > balance)
            {
                System.out.println("Saldo abaixo do requirido");
            }
            else if (ret < 0)
            {
                System.out.println("Pedido inválido, coloque um valor maior que 1");        
            }
            else
            {
                balance -= ret;
                System.out.println("Retirada aprovada");
            }
    }
        
        public int getMeses()
        {
        return meses;
        }
        
         public void setMeses(int meses)
        {
            this.meses = meses;
        }
        
        public double calculoDaTaxa()
        {
             if (meses < 12) 
            {
            taxa = 0.05;
            } 
                else if (meses < 24) 
            {
                taxa = 0.10;
            } 
                    else if (meses < 36) 
                {
                    taxa = 0.15;
                } 
                        else if (meses < 48) 
                        {
                            taxa = 0.2;
                        } 
                            else if(meses < 60) 
                            {
                                taxa = 0.25;
                            }        
             return taxa;
        }
       
        public void TituloDoTesouro()
        {
            System.out.println("meses: " + meses + " taxa: " + taxa);
        }
}
