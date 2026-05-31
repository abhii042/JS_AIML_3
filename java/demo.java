public class demo {
    String name;
    int age;
    public demo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
    System.out.println("Name: " + name + ", Age: " + age);
}
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        demo demo = new demo("Alice", 30);
        demo.display();
    }
}