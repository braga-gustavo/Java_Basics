package sintax;

public class TernaryOperator {
    public static void main(String[] args) {
        Integer age = 25;
        Integer age2 = 15;

        //variable = (condition) ? expressionTrue :  expressionFalse;
        String adult = age > 18 ? "maior de idade" : "menor de idade";
        String kid = age2 > 18 ? "maior de idade" : "menor de idade";

        System.out.println(adult);
        System.out.println(kid);

    }

}