public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println(4 / 0);
        } finally {
            System.out.println("finally executed");
        }
        System.out.println("end");
    }
}
