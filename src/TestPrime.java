import java.util.Scanner;

/**
 * Created by
 * Nicole Payne
 * Latasha Marks
 * DeMarc Johnson
 * on 2/23/2017.
 */
public class TestPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's locate some primes!");
        String input = "";
        do {
            System.out.println("This application will find you any prime, in order, from first prime number on up to 25.");
            System.out.println("Which prime number are you looking for?");
            int userNum = scan.nextInt();
            System.out.println(primeNumber(userNum));
            System.out.println("Do you want to find another prime number (y/n)");
            input = scan.next();
        }while(input.equalsIgnoreCase("y"));
        scan.close();
    }

    public static int primeNumber(int n) {
        int i =0;
        int num =0;
        String  primeNumbers = "";
        int position = 0;


        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
                position++;
                if(position == n){
                    return i;
                }
            }
        }
        return i;
    }
}
