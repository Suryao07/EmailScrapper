class ParentClass {
    ParentClass() {
        System.out.println("Constructor of Parent");
    }

    void disp() {
        System.out.println("Parent Method");
    }
}

class MethodOverriding extends ParentClass {
    MethodOverriding() {
        System.out.println("Constructor of Child");
    }

    void disp() {
        System.out.println("Child Method");
    }

    public static void main(String args[]) {
        MethodOverriding obj = new MethodOverriding();
        obj.disp();
    }
}
