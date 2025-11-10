//Nirupam Sai Vadigi
//11/07/25
//Printing patterns using while and for loops
public class Patterns {

    public static void main(String[] args) {
        stars(7);
        System.out.println("\n");
        triangle(9);
        System.out.println("\n");
        odds(9);
        System.out.println("\n");
        eo(5);
        System.out.println("\n");
        pyramid(5);
    }

//Pre-condition Only takes a positive number
//Post-condition Prints rows of stars and they increase by 2 after each line
    public static void stars(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 0;
            while (j < (2*i-1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

//Pre-condition Only takes a positive number
//Post-condition Prints rows of numbers and the number increases by 1 after each row and the number of times the number appears in a row is the same as its row number
    public static void triangle(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 0;
            while (j < i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }

//Pre-condition Only takes a positive number
//Post-condition Prints odd numbers and the #of times the number appears is equal to the number
    public static void odds(int start) {
        int i = start;
        if (i % 2 == 0) {
            i--;
        }
        for (; i >= 1; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

//Pre-condition Only takes a positive number
//Post-condition Prints "E" and "O" pattern and the letters change for every row. When "E" reaches halfway the pattern then goes in the reverse order
    public static void eo(int maxE) {
        String firstChar, secondChar = null;

        if (maxE % 2 == 0) {
            firstChar = "O";
            secondChar = "E";

        } else {
            firstChar = "E";
            secondChar = "O";
        }

        for (int i = 1; i < maxE * 2; i++) {
            if (i <= maxE) {
                //increment stage
                for (int j = 1; j <= i; j++) {
                    if (i % 2 == 0) {
                        System.out.print(secondChar);
                    } else {
                        System.out.print(firstChar);
                    }

                }
            }else{
                //decrement stage
                for(int j=i;j<maxE*2;j++){
                     if (i % 2 == 0) {
                        System.out.print(secondChar);
                    } else {
                        System.out.print(firstChar);
                    }
                }

            }
            System.out.println();
        }

    }
//Pre-condition Only takes a postive number
//Post-condition: Prints a number pyramid and the #of numbers decreases by 2 after each row and the numbers also represent the row number
    public static void pyramid(int rows){
        int nTimes=rows*2-1;
        for(int i=1;i<=rows;i++){
            printSpaces(i-1);
            for(int j=1;j <= nTimes;j++){
                System.out.print(i);
            }  
            System.out.println(); 
            nTimes=nTimes-2;
        }
           
    }
//Pre-condition: count >= 0
//Post-condition: Prints a space
    public static void printSpaces(int count){
        for(int i=1;i<=count;i++){
            System.out.print(" ");
        }
    }
}