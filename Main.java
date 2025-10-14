/**
 * @author Max D
 * @since 3 Oct 2025
 * @version 1.0
 * Notes for topics 1.8-1.15
 */
public class Main {

   /**
    * main METHOD is the entry point of the program
    * @param input is an array of Strings
    * @return void means NO OUTPUT
    */

   public static void main(String []args) {
      // Absolute Value .abs() method
      // Methods with a RETURN VALUE (non-void)
      // mean you need to "do something" with that output
      Math.abs(-41);

      System.out.println("Hello World");

      // Strings are OBJECTS from the String CLASS
      // containing a SEQUENCE OF CHARACTERS
      // indexed starting from 0

      // Create String objects in 2 ways
      // 1. Call the String() CONSTRUCTOR
      String str1 = new String("Com Sci");
      // 2. They made a SHORTCUT to set up Strings
      String str2 = "AP Java";


      // Call String METHODS on a specific String OBJECT
      int str1Len = str1.length();
      int str2Len = str2.length();
      System.out.println("Length 1: " + str1Len); // CONCATENATE Strings
      System.out.println("Length 2: " + str2Len);
      // .length() returns the NUMBER OF CHARACTERS
      // spaces are included!

      // .substring() is an OVERLOADED method(2 versions)
      // that returns PART of a larger String
      String message = "APCS is awesome!";

      String firstWord = message.substring(0, 3);
      System.out.println(firstWord);
      // .substring(int from, int to) DOES NOT INCLUDE
      // the character at index to

      String lastWord = message.substring(8);
      System.out.println(lastWord);





   }
}
