package companyprofit;
import java.util.Scanner;
import java.util.Arrays;

class Company {
    
    public void getInput() {
        Scanner getIncome = new Scanner(System.in);

        int companies = 5;
        int months = 3;
        double[][] income = new double[companies][months];
        double[][] expenses = new double[companies][months];
        double[][] profit = new double[companies][months];

        for (int i = 0; i < companies; i++) {
            System.out.println("Company Number" +(i + 1) + ":");

            for (int j = 0; j < months; j++) {
                System.out.println("Enter the income for month " +(j + 1) + ":");
                income[i][j] = getIncome.nextDouble();
            }
        }
        
         for (int i = 0; i < companies; i++) {
            System.out.println("Company Number" +(i + 1) + ":");

            for (int j = 0; j < months; j++) {
                System.out.println("Enter the expenses for month " + (j + 1) + ":");
                expenses [i][j] = getIncome.nextDouble();
            }
        }
       for (int i = 0; i < companies; i++) {
            for (int j = 0; j < months; j++) {
                profit[i][j] = income[i][j] - expenses[i][j];
            }
            
 Arrays.sort(profit[i]); 
        }
       
       String[] monthInfor= {"january","feb","march"};
       
          for (int i = 0; i < companies; i++){
              System.out.println("Company ID "+(i+1));
          

         for (int j = 0; j < months; j++)  {
             System.out.println("Month is "+monthInfor[j] +   profit[i][j] );
         }  
          }
          System.out.println();
    }
}

public class CompanyProfit {

    public static void main(String[] args) {
        Company companyInstance = new Company();
        companyInstance.getInput();
       
    }
}
