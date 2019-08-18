
import java.util.Scanner;

class linearQuiz{
    public static void main(String [] args){
        //process input
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();

        //conversion from int to string, from string to char array
        String digitToString = Integer.toString(digit);
        char[] num = digitToString.toCharArray();
        //calculate the length of input
        int numLength = num.length;

        //question 1
        //does the input int have two digits and is even?
        if (numLength == 2 && digit%2 ==0){
            System.out.println("Question 1: " + true);
        }
        else{
            System.out.println("Question 1: " + false);   
        }
        
        //question2     
        //is input 4-digit? if so, is the sum of two first digits equals to the sum of tho last ones?
        if (numLength==4){
            if ((Character.getNumericValue(num[0]) + Character.getNumericValue(num[1])) == (Character.getNumericValue(num[2]) + Character.getNumericValue(num[3])))
                System.out.println("Question 2: " + true);
            else{
                System.out.println("Question 2: " + false); 
            } 
        }
        else{
            System.out.println("Question 2: " + false); 
        }

        //question3
        //is input 3-digit? if so, if the sum of the digits is even?
        if (numLength==3){
            if ((Character.getNumericValue(num[0]) + Character.getNumericValue(num[1])+ Character.getNumericValue(num[2]) ) %2 ==0){
                System.out.println("Question 3: " + true);
            }    
            else{

                System.out.println("Question 3: " + false); 
            } 
        }
        else{
            System.out.println("Question 3: " + false); 
        }
        //question4
        //input: 4 digit
        //1st digit: x, 2nd digit: y, 3rd digit: m, 4th digit: n, m<n!
        //is point (x,y) lies in the space between x=m, x=n?
         if (numLength==4){
             int x = Character.getNumericValue(num[0]);
             int y = Character.getNumericValue(num[1]);
             int m = Character.getNumericValue(num[2]);
             int n = Character.getNumericValue(num[3]); 

            if (m<n && x>=m && x<=n){
                System.out.println("Question 4: " + true);    
            }    
            else{
                System.out.println("Question 4: " + false); 
            } 
        }
        else{
            System.out.println("Question 4: " + false); 
        }

        //question5
        //input: 3-digit number
        //is the square of this number equal to the cube of the sum of digits
        if (numLength==3){
             int a = Character.getNumericValue(num[0]);
             int b = Character.getNumericValue(num[1]);
             int c = Character.getNumericValue(num[2]);
             
            if ((Math.pow(digit,2))== Math.pow(a+b+c,3)){
                System.out.println("Question 5: " + true);    
            }    
            else{
                System.out.println("Question 5: " + false); 
            } 
        }
        else{
            System.out.println("Question 5: " + false); 
        }

        //question6
        //input: 3-digit number
        //if the triangle with given sides is equal-sided
        if (numLength==3){
             int a = Character.getNumericValue(num[0]);
             int b = Character.getNumericValue(num[1]);
             int c = Character.getNumericValue(num[2]);
             
            if (a==b || b ==c || c==a){
                System.out.println("Question 6: " + true);    
            }    
            else{
                System.out.println("Question 6: " + false); 
            } 
        }
        else{
            System.out.println("Question 6: " + false); 
        }

        //question7
        //input: 3-digit number
        //if a sum of any two digits equals to the third digit
        if (numLength==3){
             int a = Character.getNumericValue(num[0]);
             int b = Character.getNumericValue(num[1]);
             int c = Character.getNumericValue(num[2]);
             
            if (a+c==b || b+a ==c || c+b==a){
                System.out.println("Question 7: " + true);    
            }    
            else{
                System.out.println("Question 7: " + false); 
            } 
        }
        else{
            System.out.println("Question 7: " + false); 
        }

        //question8
        //input: any integer number
        //if the given number is a power of another int (powers frm 0 to 4 are valid)
        //we consider that only one integer is given and we check if it is a power of another int (in this event powers of 0 and 1 are not considered)
        
        boolean flag=true;
        while (flag){
            //check square root
            double root = Math.sqrt((double)digit);
            //System.out.println(root);
            //System.out.println(Math.round(root));
            if (root==Math.round(root)){
                System.out.println("Question 8: " + true + " (square root) ");
                break;   
            }
            //check cube root
            double cubeRoot = Math.cbrt((double)digit);
            if (cubeRoot==Math.round(cubeRoot)){
                System.out.println("Question 8: " + true + " (cube root) ");
                break;   
            }
            //check cube of four
            //here we use the following formula:
            //nRoot(num)=e**(log(num)/root)
            int fourRoot = (int) Math.pow(Math.E, Math.log((double)digit)/4.0);
            if (cubeRoot==Math.round(fourRoot)){
                System.out.println("Question 8: " + true + " (root of four) ");
                break;   
            }

            System.out.println("Question 8: " + false);
            flag=false;
        }
        
        //question9
        //input: point coordinates (m,n), function coefficients a,b,c
        //does the function go through the point coordinates?
        //ASSUMPTION: int has 5 digits, where first two are the point coordinates and the last three are a,b,c function coefficients
         if (numLength==5){
             int m = Character.getNumericValue(num[0]);
             int n = Character.getNumericValue(num[1]);
             int a = Character.getNumericValue(num[2]);
             int b = Character.getNumericValue(num[3]);
             int c = Character.getNumericValue(num[4]);
             
            if (a*Math.pow(m,2)+b*m+c == n){
                System.out.println("Question 9: " + true);    
            }    
            else{
                System.out.println("Question 9: " + false); 
            } 
        }
        else{
            System.out.println("Question 9: " + false); 
        }
    }   
}