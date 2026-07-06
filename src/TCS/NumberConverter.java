package TCS;

public class NumberConverter {

    public static int binaryToDecimal(String s){
        int base = 1;
        int ans = 0;

        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) == '1'){
                ans += base;
            }
            base *= 2;
        }
        return ans;
    }

    public static int binaryToOctal(String s){
        int octal = 0;
        int octalBase = 1;
        int decimal = binaryToDecimal(s);
        while(decimal > 0){
            int remainder = decimal % 8;
            octal += remainder * octalBase;
            decimal /= 8;
            octalBase *= 10;
        }
        return octal;
    }

    public static String decimalToBinary(int decimal){
        if (decimal == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while(decimal > 0){
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }

    public static String decimalToOctal(int decimal){
        if (decimal == 0) return "0";

        StringBuilder octal = new StringBuilder();
        while(decimal > 0){
            int remainder = decimal % 8;
            octal.append(remainder);
            decimal /= 8;
        }
        return octal.reverse().toString();
    }

    public static String octalToBinaryManual(String octal) {
        String[] binaryLookUp = {
                "000", "001", "010", "011",
                "100", "101", "110", "111"
        };

        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < octal.length(); i++) {
            char digit = octal.charAt(i);
            int val = digit - '0'; // Convert char to int
            binary.append(binaryLookUp[val]);
        }

        String result = binary.toString();
        return result.replaceFirst("^0+(?!$)", "");
    }

    public static int octalToDecimalManual(String octal) {
        int base = 1;
        int decimal = 0;

        // Process from right to left
        for (int i = octal.length() - 1; i >= 0; i--) {
            int currentDigit = octal.charAt(i) - '0'; // Convert char to int
            decimal += currentDigit * base;
            base *= 8; // Scale positional value by 8 each time
        }
        return decimal;
    }

    // Convert number/digits to words




    public static void main(String[] args) {
        String s = "1101";
        System.out.println(s + " Binary to Decimal : "+binaryToDecimal(s));
        System.out.println(s + " Binary to Octal : "+binaryToOctal(s));
    }


}

