import java.util.Scanner;

public class BowlingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] roll1 = new int[13];

        int[] roll2 = new int[13];

        int[] framescore  = new int[13];

        int[] totalscore = new int[12];


        int tenpin = 0;

        char strike = 'X';

        char spare = '/';
		
   	char miss = '-';

         
        System.out.println("\n---Bowling Game---");
     

        for (int i = 1; i <= 10; i++)

        {

            System.out.printf("%nFrame: %d", i);

            System.out.print("\nFirst Bowl: ");

            roll1[i] = input.nextInt();

             
            if (roll1[i] == 10)

                framescore[i] = roll1[i];

                else

                    {

                        System.out.print("Second Bowl: ");

                        roll2[i] = input.nextInt();

                       framescore[i] = roll1[i] + roll2[i];

                    }

         

            if (i == 10 && roll1[i] == 10)

                {

                    System.out.print("\nSecond Bowl: ");  

                    roll2[i] = input.nextInt();

                    System.out.print("\nThird Bowl: ");   

                    tenpin = input.nextInt();

                    framescore[i] = roll1[i] + roll2[i] + tenpin;

                }

             

            totalscore[i] += framescore[i];

        }

         

        System.out.print("\n--- SCOREBOARD ---");

       System.out.print("\n_____________________________________________________________________________________");

        System.out.printf("%n%-15s", "Frame:");

        for (int i = 1; i <= 10; i++)

            System.out.printf("%-7d", i);

        System.out.print("\n_____________________________________________________________________________________");

        System.out.printf("%n%-15s", "Result:");

        for (int i = 1; i <= 10; i++)

        {

                if (roll1[i] == 10)

                    System.out.printf("%-7c", strike);

                else if (roll1[i] + roll2[i] == 10)

                    System.out.printf("%-1d%-6c", roll1[i], spare);
					
			    else if (roll1[i] == 0 && roll2[i] != 0)

                    System.out.printf("%-1d%-6c", roll2[i], miss);
					
				else if (roll1[i] != 0 && roll2[i] == 0)

                    System.out.printf("%-1d%-6c", roll1[i], miss);

                else

              System.out.printf("%-1d %-5d", roll1[i], roll2[i]);

       }

        System.out.print("\n_____________________________________________________________________________________");

        System.out.printf("%n%-15s", "Frame Score:");

        for (int i = 1; i <= 10; i++)

        {

            System.out.printf("%-7d", framescore[i]);

        }

        System.out.print("\n_____________________________________________________________________________________");

        System.out.printf("%n%-15s", "Total Score:");

        for (int i = 1; i <= 10; i++)

        {

          System.out.printf("%-7d", totalscore[i]);

        }

        System.out.print("\n_____________________________________________________________________________________");

    }

}