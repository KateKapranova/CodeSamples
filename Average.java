import java.util.Scanner;


class Average{
    public static void main(String [] args){
         //process input
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        //calculate the average
        float result = (num1+num2)/2;
        System.out.println("number 1: " + num1);
        System.out.println("number 2: " + num2);
        System.out.println("average of number 1 and number 2: " + result);
    }
}