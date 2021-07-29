package com.example.hello;

/**
 * Hello GHAS!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello GHAS!" );

        for (int i=0; i<10; i++) {
            for (int j=0; i<10; j++) {
                // do stuff
                if (shouldBreak()) break;
            }
        }
    }

    private static boolean shouldBreak() {
        return false;
    }
}
