package base;/*
 *  UCF COP3330 Summer 2021 Assignment <INSERTNUM> Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        float c_from;
        float c_to;
        float rate;
        String output;

        Scanner fIn = new Scanner(System.in);
        Scanner rIn = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("###.##");

        System.out.print("How many euros are you exchanging? ");
        c_from = fIn.nextFloat();
        System.out.print("What is the exchange rate? ");
        rate = rIn.nextFloat();

        c_to = c_from * rate;
        output = dF.format(c_to)+" U.S. dollars.";
        System.out.print(output);
    }
}
