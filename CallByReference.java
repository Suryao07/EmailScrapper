public class CallByReference {

    int a, b;

    CallByReference(int x, int y) {
        a = x;
        b = y;
    }

    void ChangeValue(CallByReference obj) {
        obj.a += 10;
        obj.b += 20;
    }

    public static void main(String[] args) {

        CallByReference object = new CallByReference(10, 20);

        System.out.println("Value of a: " + object.a + " & b: " + object.b);

        object.ChangeValue(object);

        System.out.println("Value of a: " + object.a + " & b: " + object.b);
    }
}
