//Pascal name convention: IntegerLiteral
public class IntegerLiteral {
    public static void main(String[] args) {
        int a = 104;
        int b = 0150; // Octal  literal
        int c = 0x68; // Hexadecimal literal
        int d = 0b1101000; // Binary literal  
        //sout shortcut for System.out.println
        System.out.println("Decimal literal: " + a);  
        System.out.println("Octal literal: " + b);
        System.out.println("Hexadecimal literal: " + c);  
        System.out.println("Binary literal: " + d);
    }

    
}
