package timeconversion2;

import java.util.*;
public class TimeConversion2 {
     
    public static void main (String[] args)  
    { 

        System.out.println("Enter an amount of time in seconds: ");
        Scanner scan = new Scanner(System.in);
        int totSeconds = scan.nextInt();
        
        int hours = totSeconds / 3600;
        int minutes = (totSeconds % 3600) / 60;
        int seconds = totSeconds % 60;   
        
        System.out.println(hours  + " hours " + minutes + " minutes " + seconds + " seconds "); 
    } 
} 
