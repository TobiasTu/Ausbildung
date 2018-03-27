package Taschenrechner;

import java.util.Scanner;
import java.io.*;
public class Taschenrechner
{
       public static double eingabeEins;
       public static double eingabeZwei;
       public static double Ergebnis;
       public static String Methode;
       static Scanner ersteZahl = new Scanner (System.in);
       static Scanner zweiteZahl = new Scanner (System.in);
       static Scanner rechenMethode = new Scanner (System.in);
       
    public Taschenrechner()
    {
        double eingabeEins;
        double eingabeZwei;
        double ausgabe;       
    }
    
    public static void rechenMethode(double eingabeEins, String Methode, double eingabeZwei)
    {
        if(Methode.equals("plus"))
        {   double Summe = eingabeEins + eingabeZwei;
            System.out.println(Summe);
        }
        
        else 
        
        if(Methode.equals("minus"))
        {   double Differenz = eingabeEins - eingabeZwei;
            System.out.println(Differenz);
        }
        
        else 
         
        if(Methode.equals("mal"))
        {   double Produkt = eingabeEins * eingabeZwei;
            System.out.println(Produkt);
        }
        
        else
        
        if(Methode.equals("durch"))
        {   double Quotient = eingabeEins / eingabeZwei;
            System.out.println(Quotient);
        }
    }
    
    public static void main(String[]args) 
    {
        System.out.println("Bitte geben Sie die erste Zahl ein!");
        double eingabeEins = ersteZahl.nextDouble();
        System.out.println("Bitte geben Sie die zweite Zahl ein!"); 
        double eingabeZwei = zweiteZahl.nextDouble();
        System.out.println("Bitte geben Sie den Operator ein!");
        String Methode = rechenMethode.next();
        rechenMethode(eingabeEins, Methode, eingabeZwei);
        
    }
}



