/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fintual;


import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

/**
 *
 * @author jorge
 */
public class Portfolio {
    
    Stocks stock;
    
    public Portfolio(){
        //adding example values
        stock = new Stocks();
        stock.addDateAndPrice(LocalDate.of(2020, 1, 1), 1000.00);
        stock.addDateAndPrice(LocalDate.of(2022, 2, 2), 1500.00 );
    }
    
    public Double profit(LocalDate firstDate, LocalDate secondDate){
       Double firstPrice = stock.Price(firstDate);
       Double secondPrice = stock.Price(secondDate);
       Double numYears = (double)ChronoUnit.YEARS.between(firstDate, secondDate);
       Double annualizedReturn =  (Math.pow((secondPrice/firstPrice),(1/numYears)) - 1) * 100;
        
        return annualizedReturn;
        
    }
    
}
