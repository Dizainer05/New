package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tester tester = new Tester("Адриан", "Носко", 2, 'С', 50000.0);
        Tester.printTesterDetails(tester);
    }
}
