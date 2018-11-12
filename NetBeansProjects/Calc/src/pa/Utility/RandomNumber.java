/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa.Utility;

import java.util.Random;

/**
 *
 * @author berna
 */
public class RandomNumber {
    
    public double RandomNumber(double randomNum){
        Random rand = new Random();
        randomNum= rand.nextInt(100) + 1;
        return randomNum;
    
}}
