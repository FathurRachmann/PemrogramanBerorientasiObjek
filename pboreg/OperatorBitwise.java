package com.pboreg;

public class OperatorBitwise {
    public static void main(String[] args) {
        // write your code here
        // Operator Bitwise --> Operator untuk melakukan operasi  pada nilai bit

        byte a = 3 ;
        byte b, c ;
        String a_bits, b_bits, c_bits ;


        // Operator SHIFT LEFT
        System.out.println("===== SHIFT LEFT(<<)") ;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0') ;
        System.out.printf("%s = %d \n", a_bits, a) ;
        b = (byte)(a << 3) ;
        b_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0') ;
        System.out.printf("%s = %d \n", b_bits, b) ;

        // Operator SHIFT RIGHT
        System.out.println("===== SHIFT RIGHT(>>)") ;
        a = 24 ;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0') ;
        System.out.printf("%s = %d \n", b_bits, a) ;
    }
}
