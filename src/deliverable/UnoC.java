/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;


/**
 *
 * @author AMITOJ SINGH 13/06/2022
**/
import java.util.Random;

public class UnoC
{
    public String color;
    public int value;
    private Random rand;
    private String face;

    public UnoC(int v, String c)
    {
        value = v;
        color = c; 
    }


    public UnoC()
    {
        rand = new Random();
        value = rand.nextInt(28); 
        if (value >= 14) 
            value -= 14;
   
        rand = new Random();
        switch(rand.nextInt(4) )
        {
            case 0: color = "Red"; 
                break;
            case 1: color = "Green"; 
                break;
            case 2: color = "Blue"; 
                break;
            case 3: color = "Yellow"; 
                break;
        }
         if (value >= 13)
            color = "none";
    }

    public String getFace()
    {
      
        face = "[";
        if (color != "none")
        {
            face += this.color + " ";
        }

        switch(this.value)
        {
            default: face += String.valueOf(this.value); 
                break;
            case 10: face += "Skip"; 
                break;
            case 11: face += "Reverse"; 
                break;
            case 12: face += "Draw 2"; 
                break;
            case 13: face += "Wild"; 
                break;
            case 14: face += "Wild Draw 4"; 
                break;
        }
        face += "]";
        return face;
    }

   public boolean canPlace(Unocard o, String c)
    {
        if (this.color == c)
            return true;
        else if (this.value == o.value)
            return true;
        else if (this.color == "none") // Wild cards
            return true;
        return false;
    }
}