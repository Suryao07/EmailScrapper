class Display {
    int a = 9;
    int b = 10;
    int c;

    Display() {
        a = 4;
    }

    void show() {
        System.out.println("Value of a =" + a);
        System.out.println("Value of b =" + b);
        System.out.println("Value of c =" + c);
    }
}
    class DefaultConstructor
    {
        public static void main(String [] args)
        {
            Display data = new Display();
            data.show();
        }

}