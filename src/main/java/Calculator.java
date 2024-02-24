import java.util.UUID;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        if (n <= 0) {
            return 0; // Fibonacci sequence is not defined for n <= 0
        } else if (n == 1 || n == 2) {
            return 1; // Base cases: first two Fibonacci numbers are 1
        }

        int prev = 1; // Initialize the first Fibonacci number
        int curr = 1; // Initialize the second Fibonacci number

        for (int i = 3; i <= n; ++i) {
            int next = prev + curr; // Calculate the next Fibonacci number
            prev = curr; // Update prev to current Fibonacci number
            curr = next; // Update current Fibonacci number to next Fibonacci number
        }

        return curr;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int number){
        if (number == 0) {
            return "0"; // Special case for 0
        }

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2; // Get the remainder when divided by 2
            binary.append(remainder); // Append the remainder to the string
            number /= 2; // Divide the number by 2
        }

        return binary.reverse().toString();
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        // Generate a random UUID to use as a suffix
        String suffix = UUID.randomUUID().toString().replaceAll("-", "");

        // Combine the original string with the suffix to create a unique ID
        String uniqueID = n + suffix;

        return uniqueID;
    }


}
