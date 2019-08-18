//program to convert bytes into senior units if possible
//greedy approach

import java.util.Scanner;

class sizeConversion{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        long size = input.nextLong();
        long TByte = 1099511627776L;
        long GByte = 1073741824L;
        long MByte = 1048576;
        int KByte = 1024;
        long result;
        //check if we have a Tbyte size
        if (size>TByte){
            result = size / TByte;
            System.out.print(result + " TB ");
            size = size - (TByte*result);
        }
        //check if we have a GByte size
        if (size>GByte){
            result = size / GByte;
            System.out.print(result + " GB ");
            size = size - (GByte*result);
        }
        //check if we have a MByte size
        if (size>MByte){
            result = size / MByte;
            System.out.print(result + " MB ");
            size = size - (MByte*result);
        }
        //check if we have a KByte size
        if (size>KByte){
            result = size / KByte;
            System.out.print(result + " KB ");
            size = size - (KByte*result);
        }
        //check if there are bytes left
        if (size > 0){
            System.out.println(size + " Bytes");
        }
    }
}