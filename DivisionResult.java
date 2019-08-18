//input: a four-digit integer
//calculate the division result between the multiplication result of even digits and odd digits

import java.util.Scanner;

class DivisionResult{
    public static void main(String [] args){
        //process input
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();

        //conversion from int to string, from string to char array
        String digitToString = Integer.toString(digit);
        char[] num = digitToString.toCharArray();

        //check if the number of digits is 4, stop execution if this is not the case
        if (num.length!=4){
            System.out.println("Input should contain 4 digits. Exit program");
            System.exit(0);
        }
        
        //main part
        int even=1; int odd=1;
        for (int i=0;i<num.length;i++){
            //turn char into int
            int intConsidered = Character.getNumericValue(num[i]);
            //determine if it is even or odd with modulo operation
            if (intConsidered%2==0){
                even=even*intConsidered;
            }
            else {
                odd=odd* intConsidered;
            }
        }    
        System.out.println("even " + even);
        System.out.println("odd "+ odd);

        //perform the division
        float result = (float)even/(float)odd;
        System.out.println(result);
    }
}