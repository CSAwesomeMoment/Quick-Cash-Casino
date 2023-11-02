import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Game Info
        System.out.println ("Welcome to Russian Roulette!" + '\n') ;

        System.out.println ("How the game works: Each round a number(A) between 1 - 6 (inclusive) is generated, at the same time another number(B) is generated the same way. If numbers A and B match, you lose, and if they don't then you win and move onto the next round with 100pts added to your account! " + '\n');

        System.out.println ("Enter 1 To Get Started!" + '\n') ;
        //Input Class
        Scanner input = new Scanner(System.in);
        int numInput = input.nextInt();

        //Game Code
        int i = 0;
        while ( i < 3 )
        {
            boolean win = false;

            if (numInput == 1)
            {
                i = 3;
            }
        }
    }
    }