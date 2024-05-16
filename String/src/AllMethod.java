public class AllMethod {
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is Blank");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));

        System.out.printf("Index of r = %d %n", string.indexOf("r"));
        System.out.printf("Index of World = %d %n", string.indexOf("World"));

        System.out.printf("Index of l = %d %n", string.indexOf("l"));
        System.out.printf("Index of l = %d %n", string.lastIndexOf("l"));

        System.out.printf("Index of l = %d %n", string.indexOf("l", 3));
        System.out.printf("Index of l = %d %n", string.lastIndexOf("l", 8));

        String stringLower = string.toLowerCase();
        if (string.equals(stringLower)) {
            System.out.println(("Values match exactly"));
        }
        if (string.equalsIgnoreCase(stringLower)) {
            System.out.println(("Values match ignoring case"));
        }

        if (string.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (string.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (string.contains("World")) {
            System.out.println("String contains World");
        }

        if (string.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

    }
}
