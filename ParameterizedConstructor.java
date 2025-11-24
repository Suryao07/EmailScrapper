class ParameterizedConstructor {
    int roll_no;
    String stu_name;

    ParameterizedConstructor(int i, String n) {
        roll_no = i;
        stu_name = n;
    }

    void display() {
        System.out.println(roll_no + " " + stu_name);
    }

    public static void main(String args[]) {
        ParameterizedConstructor s1 = new ParameterizedConstructor(1, "RAM");
        ParameterizedConstructor s2 = new ParameterizedConstructor(2, "SITA");
        s1.display();
        s2.display();
    }
}
