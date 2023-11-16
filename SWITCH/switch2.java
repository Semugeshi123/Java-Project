public class switch2 {
    public static void main(String[] args) {
        String personName = "Alice";
        switch (personName) {
            case "Alice":
                System.out.println("Hello, Alice!");
                break;
            case "Bob":
                System.out.println("Hi, Bob!");
                break;
            case "Charlie":
                System.out.println("Hey, Charlie!");
                break;
            default:
                System.out.println("Hello, stranger!");
        }
    }
}