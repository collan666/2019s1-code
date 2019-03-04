public class Hello {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello world");
        } else if (args.length < 3) {
            for (String arg : args) {
                System.out.println("Hello " + arg);
            }
        } else {
            System.out.print("Hello " + args[0]);
            for (int i = 1; i < args.length - 1; ++i) {
                System.out.print(" and " + args[i]);
            }
            System.out.println(" but not " + args[args.length - 1]);
        }
    }
}
