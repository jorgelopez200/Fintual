/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fintual;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jorge
 */
public class MainFintual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Portfolio portfolio = new Portfolio();
       Double profit = portfolio.profit(LocalDate.of(2020, 1, 1), LocalDate.of(2022,2,2));
       System.out.println("your profit is :" + profit.toString() + "%");
        
    }
    
}
