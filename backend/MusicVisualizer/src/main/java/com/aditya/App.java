package com.aditya;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
        Play.playSong();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
