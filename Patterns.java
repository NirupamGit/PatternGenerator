//Nirupam Sai Vadigi
//11/07/25
//Printing patterns using while and for loops
public class Patterns {

    public static void main(String[] args) {
        stars(13);
        System.out.println("\n");
        triangle(9);
        System.out.println("\n");
        odds(9);
        System.out.println("\n");
        eo(5);
        System.out.println("\n");
        pyramid(6);
    }
// Prints rows of stars and they increase by 2 after each line
    public static void stars(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i += 2;
        }
    }

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

    public static void printSpaces(int count){
        for(int i=1;i<=count;i++){
            System.out.print(" ");
        }
    }
}