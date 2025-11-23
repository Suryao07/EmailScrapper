class Student {
    int roll_no;
    String name;

    Student(int i, String s) {
        roll_no = i;
        name = s;
    }

    void display() {
        System.out.println(roll_no + " " + name);
    }
}
    class PC
    {
        public static void main (String [] args)
        {
            Student s1 = new Student(1, "Ram");
            Student s2 = new Student(2, "Sam");
            s1.display();
            s2.display();

        }


}