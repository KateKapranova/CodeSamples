//input: two integers
//output: least significant digit of the whole of the division
//and the most significant digigt og the fraction of the division

import java.util.Scanner;


class naturalNum{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        //calculate the fraction and save it in a float-type variable
        float result = (float)num1/(float)num2;
        System.out.println("Division result: " + result);

        //Convert float to string and then string to char array
        String floatToString = Float.toString(result);
        char[] parse = floatToString.toCharArray();

        //Iterate over char array to find the "."
        for (int i=0;i<parse.length;i++){
            if (parse[i]=='.'){
                System.out.println("least significant digit of the whole: " + parse[i-1]); 
                System.out.println("most significant digit of the fraction: " + parse [i+1]);
            }
        }
    }
}