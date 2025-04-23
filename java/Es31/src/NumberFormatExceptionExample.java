public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String invalidNumber = "abc123";
        try {
            int number = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Exception handled correctly");
        }
    }
}