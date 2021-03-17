/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User pc
 */
public class Commission extends Hourly
{
    private double tSales;
    private final double commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = cRate;
    }
    
    public void addSales(double totalSales){
        tSales = totalSales;
    }
    
    public double pay(){
        double payment = super.pay()+ tSales;
        tSales = 0;
        return payment;
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nCurrent hours: " + tSales;
        return result;
    }
    
}
