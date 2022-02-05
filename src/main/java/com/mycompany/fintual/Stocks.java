/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fintual;


import java.time.LocalDate;
import java.util.HashMap;

/**
 *
 * @author jorge
 */
public class Stocks {
        
    HashMap<LocalDate,Double> map = new HashMap<>();
    
    public Double Price(LocalDate date){
        
        Double price = map.get(date);
        
        return price;
    }
    
    
    public void addDateAndPrice(LocalDate date, Double price){
        
        map.put(date, price);
    }
}
