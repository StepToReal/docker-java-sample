package com.steptoreal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Calculator cal = new Calculator();

        System.out.println(cal.sum(1,2));

        System.out.println(new Calculator().sum(2,5));
    }
}
