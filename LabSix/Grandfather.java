class Grandfather {
    void company() {
        System.out.println("Grandfather owns a company.");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father owns a car.");
    }
}

class Son extends Father {
    void hobby() {
        System.out.println("Son loves playing football.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating Son object (can access everything)
        Son s = new Son();

        System.out.println("== Accessing Grandfather, Father and Son Properties ==");
        s.company();  // From Grandfather
        s.car();      // From Father
        s.hobby();    // From Son
    }
}


