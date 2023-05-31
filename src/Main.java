public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Good morning!");
            Thread.sleep(1000);
        }
    }
}