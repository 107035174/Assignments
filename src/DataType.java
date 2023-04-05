public class DataType {
    public static void main(String[] args) {

        // Generate a random integer between 0 and 2 billion
        int randomNumber = RandomNumbers.getRandomInt(0, 2000000000);

        // Determine the best data type to use based on the random number's value
        if (randomNumber >= Byte.MIN_VALUE && randomNumber <= Byte.MAX_VALUE) {
            System.out.println("Use a byte to store the number.");
        } else if (randomNumber >= Short.MIN_VALUE && randomNumber <= Short.MAX_VALUE) {
            System.out.println("Use a short to store the number.");
        } else if (randomNumber >= Integer.MIN_VALUE && randomNumber <= Integer.MAX_VALUE) {
            System.out.println("Use an int to store the number.");
        } else if (randomNumber >= Long.MIN_VALUE && randomNumber <= Long.MAX_VALUE) {
            System.out.println("Use a long to store the number.");
        } else {
            System.out.println("The number is too large to be stored in a primitive data type.");
        }
    }
}
