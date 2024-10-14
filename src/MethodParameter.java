public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Bambang", "Budi");
        sayHello("Bambang1", "Budi2");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
