package flow;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("""
                Hi!, Welcome to Temperature Convertor Terminal App.
                                    [ENTER]
                                 To continue
                """);
        System.in.read();
        System.out.println("""
        Witch Metric would you like to use?
         (F) for Fahrenheit and (C) for Celsius:
         
         """); // C by default
        //(Temperature * 1.8) + 32

        int temperture = 24;
               int conversor = (int) (temperture * 1.8) + 32;


        System.out.printf("""
                                       
                |---------------------------------------------------|
                | We are having a temperature of %.1f Fahrenheit.   |
                |___________________________________________________|
                %n""", (float) conversor);


    }
}
