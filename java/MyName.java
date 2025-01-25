public class MyName {

    public static void main(String[] args) {
        // Convert each character in "Paulina" to binary manually

        // Character 'P'
        int asciiP = 80; //ascii of p
        String binaryP = convertToBinary(asciiP); //create binary of P using method
        System.out.println("'P' in Binary: " + binaryP); //display P in Binary
        
        // Character 'a'
        int asciiA = 97; //ascii of a
        String binaryA = convertToBinary(asciiA); //create binary of A using method
        System.out.println("'A' in Binary: " + binaryA); //display A in Binary
        
        // Character 'u'
        int asciiU = 117; //ascii of u
        String binaryU = convertToBinary(asciiU); //create binary of u with method
        System.out.println("'U' in Binary: " + binaryU); //display u in Binary
        
        // Character 'l'
        int asciiL = 108; //ascii of l
        String binaryL = convertToBinary(asciiL); //create binary of l with method
        System.out.println("'L' in Binary: " + binaryL); //display l in Binary
        
        // Character 'i'
        int asciiI = 105; //ascii of i
        String binaryI = convertToBinary(asciiI); //create binary of i with method
        System.out.println("'I' in Binary: " + binaryI);
        //the above line displays i in binary
        
        // Character 'n'
        int asciiN = 110; //ascii of n
        String binaryN = convertToBinary(asciiN); //create binary of n with method
        System.out.println("'N' in Binary: " + binaryN);
        //the above line displays n in binary
        
        /* Character 'a'
        Since we alreayd determined the ascii and binary code of A, we can
        omit the code and simply print the value.
        int asciiA = 97; 
        String binaryA2 = convertToBinary(asciiA);
        */
        System.out.println("'A' in Binary: " + binaryA);
        
        // Combining all binary values to spell "Paulina"
        String combinedBinary = binaryP + binaryA + binaryU + binaryL + binaryI + binaryN + binaryA;
        System.out.println("\n'Paulina' in Binary: " + combinedBinary);
    }//end of main

//This method is private since it only needs to be accessed from this file
    private static String convertToBinary(int numToConvert) {
        // Variables for bits
        int bitOne, bitTwo, bitThree, bitFour, bitFive, bitSix, bitSeven, bitEight;

        // Calculate bits (Binary conversion)
        bitEight = numToConvert % 2; // 80 % 2 = 0
        numToConvert = numToConvert / 2; // 40
        
        bitSeven = numToConvert % 2; // 40 % 2 = 0
        numToConvert = numToConvert / 2; // 20
        
        bitSix = numToConvert % 2; // 20 % 2 = 0
        numToConvert = numToConvert / 2; // 10
        
        bitFive = numToConvert % 2; // 10 % 2 = 0
        numToConvert = numToConvert / 2; // 5
        
        bitFour = numToConvert % 2; // 5 % 2 = 1
        numToConvert = numToConvert / 2; // 2
        
        bitThree = numToConvert % 2; // 2 % 2 = 0
        numToConvert = numToConvert / 2; // 1
        
        bitTwo = numToConvert % 2; // 1 % 2 = 1
        numToConvert = numToConvert / 2; // 0
        
        bitOne = numToConvert; // 0

        // Return combined binary string
        return "" + bitOne + bitTwo + bitThree + bitFour + bitFive + bitSix + bitSeven + bitEight;
    }
}
