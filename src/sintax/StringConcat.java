package sintax;
public class StringConcat {
    public static void main(String[] args) throws Exception {
        String firstName = "John";
        String secondName = "Tolkien";

        System.out.println(concatenateString(firstName, secondName));
    }

    public static String concatenateString(String firstName, String secondName) {
        return "Teste da String: ".concat(firstName).concat(" ").concat(secondName);
    }
}
