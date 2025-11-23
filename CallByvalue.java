class Main {

    public static void example(int x, int y) {
        x++;
        y++;
    }
}

public class CallByValue {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

       Main object = new Main();

        System.out.println("Value of a: " + a + " & b: " + b);

        object.example(a, b);

        System.out.println("Value of a: " + a + " & b: " + b);
    }
}
