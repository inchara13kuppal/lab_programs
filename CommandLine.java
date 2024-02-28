package week2;

class CommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Java buzzwords...");
            for (int i = 0; i < args.length; i++) {
                System.out.println((i + 1) + "." + args[i]);
            }
        } else {
            System.out.println("NO COMMAND LINE ARGUMENT FOUND");
        }
    }
}
