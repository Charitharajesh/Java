class Parent {
    public void display() { System.out.println("This is parent class"); }
}

class Child extends Parent {
    public void displayChild() { System.out.println("This is child class"); }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.display();
        c.displayChild();
        c.display();
    }
}
