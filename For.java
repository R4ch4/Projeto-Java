public class For {
    public static void main(String[] args) {
        for (int r = 1; r <= 50; r++) {
            if (r % 3 == 0 && r % 5 == 0) {
                System.out.println("Fizz Buzz");
            }else if (r % 3 == 0) {
                System.out.println("Fizz");
            }else if (r % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(r);
            }
        }
    }
}
