public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "12/04/1995";
        int startingIndex = birthDate.indexOf("1995");
        System.out.println("staringIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "12","04","1995");
        System.out.println("newDate = " + newDate);

        newDate = "12";
        newDate = newDate.concat("/");
        newDate = newDate.concat("04");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1995");
        System.out.println("newDate = " + newDate);

        newDate = "12".concat("/").concat("04").concat("/").concat("1995");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace("/","-"));
        System.out.println(newDate.replace("2","00"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
