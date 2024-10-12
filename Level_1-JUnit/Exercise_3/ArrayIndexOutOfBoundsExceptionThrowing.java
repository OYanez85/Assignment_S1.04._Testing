public class ArrayIndexOutOfBoundsExceptionThrowing {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3};

        // This will throw ArrayIndexOutOfBoundsException
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

