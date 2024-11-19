interface Tasks {
    void sleep();
    void eat();
    void play();
    void study();
}

class Human implements Tasks {
    public void sleep() {
        System.out.println("Ghumiyechhi");
    }
    
    public void eat() {
        System.out.println("Khachhi");
    }
    
    public void play() {
        System.out.println("Khelchhi");
    }
    
    public void study() {
        System.out.println("Porchhi");
    }
}

public class Main {
    public static void main(String[] args) {
        Human manush = new Human();
        manush.sleep();
        manush.eat();
    }
}
