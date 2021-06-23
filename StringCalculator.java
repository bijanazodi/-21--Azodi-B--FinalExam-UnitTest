public class StringCalculator {
   public static int add(final String numbers) {
      int returnValue = 0;
      String[] numbersArray = numbers.split(",|\n"); 
      for (String number : numbersArray) {
         if (!number.trim().isEmpty()) {
         
         if(number.trim() <0 )
         {
         throw new NegativeNumberException("Negatives not allowed");
         }
         if(number.trim()>999)
         {
         
         }
         else
            returnValue += Integer.parseInt(number.trim());
         }
      }
      return returnValue;
   }
}