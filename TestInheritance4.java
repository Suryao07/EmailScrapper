class GrandFather {
    public void showG() {
        System.out.println("He is grandfather.");
    }
}

class Father extends GrandFather {
    public void showF() {
        System.out.println("He is father.");
    }
}

class Son extends Father {
    public void showS() {
        System.out.println("He is son.");
    }
}

class Daughter extends Father {
    public void showD() {
        System.out.println("She is daughter.");
    }
}

public class TestInheritance4 {
    public static void main(String args[]) {

        Son s = new Son();
        s.showS();
        s.showF();
        s.showG();

        Daughter d = new Daughter();
        d.showD();
        d.showF();
        d.showG();
    }
}
