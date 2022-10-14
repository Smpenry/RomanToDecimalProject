import java.util.Objects;

/**
 * @author 24penry
 * @version 10.7.22
 * Converts Roman numerals to decimals
 */

public class RomanToDecimal {

    /**
     * Checks the characters in the command line args and outputs a decimal value for each character
     *
     */
    public static int romanToDecimal(String roman) {
        //"XI"
        int sum = 0;
        //convert to all one case
        roman = roman.toUpperCase();

        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I')
                sum += 1;
            else if (roman.charAt(i) == 'V')
                sum += 5;
            else if (roman.charAt(i) == 'X')
                sum += 10;
            else if (roman.charAt(i) == 'L')
                sum += 50;
            else if (roman.charAt(i) == 'C')
                sum += 100;
            else if (roman.charAt(i) == 'D')
                sum += 500;
            else if (roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;
        }
        // INVARIANTS
        if(roman.indexOf("IV") != -1)
            sum -= 2;
        if(roman.indexOf("IX") != -1)
            sum -= 2;
        if(roman.indexOf("XL") != -1)
            sum -= 20;
        if(roman.indexOf("XC") != -1)
            sum -= 20;
        if(roman.indexOf("CD") != -1)
            sum -= 200;
        if(roman.indexOf("CM") != -1)
            sum -= 200;

        return sum;
    }

    /**
     *
     * @param decimal
     * @return the logical roman numeral for an ilogical expression
     */
    public static String decimalToRoman(int decimal) {
        //2175
        String roman = "";
        while (decimal >= 1000) {
            roman += "M";
            decimal -= 1000;
        }
        while (decimal >= 900) {
            roman += "CM";
            decimal -= 900;
        }
        while (decimal >= 500) {
            roman += "D";
            decimal -= 800;
        }
        while (decimal >= 400) {
            roman += "CD";
            decimal -= 400 ;
        }
        while (decimal >= 100) {
            roman += "C";
            decimal -= 100;
        }
        while (decimal >= 90) {
            roman += "XC";
            decimal -= 90;
        }
        while (decimal >= 50) {
            roman += "L";
            decimal -= 50;
        }
        while (decimal >= 40) {
            roman += "XL";
            decimal -= 40;
        }
        while (decimal >= 10) {
            roman += "X";
            decimal -= 10;
        }
        while (decimal >= 9) {
            roman += "IX";
            decimal -= 9;
        }
        while (decimal >= 5) {
            roman += "V";
            decimal -= 5;
        }
        while (decimal >= 4) {
            roman += "IV";
            decimal -= 4;
        }
        while (decimal >= 1) {
            roman += "I";
            decimal -= 1;
        }
    return roman;
    }
    /**
     * Main method of RomanToDecimal class
     * @param args command line arguments if needed
     */
    public static void main(String[] args) {
       for(String roman : args) {
           roman = roman.toUpperCase();
           int decimal = romanToDecimal(roman);
             if (decimal == -1)
                 System.out.println("Input: " + roman + " => Output: invalid");
             else {
                 if (roman.equals(decimalToRoman(decimal)))
                     System.out.println("Input " + roman + "=> output " + romanToDecimal(roman));
                 else
                     System.out.println("Input " + roman + "=> output " + romanToDecimal(roman) + " =>logical roman numeral " + decimalToRoman(decimal));
             }


             /* if(decimal != -1)



                  System.out.println("Input: " + roman + " => Output: " + decimal);
              else {
                  if(roman.equals(decimalToRoman(decimal))
                      System.out.println();
                    else
                      System.out.println("Input: " + roman + " => Output: invalid");

              }
             */
       }
    }
}
