package lesson44;

public class Calculator {

        static Fraction result = new Fraction();
          Controller c = new Controller();
//
        static Fraction add (Fraction f1, Fraction f2){
            Fraction result = new Fraction();
            result.numerator = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
            result.denominator = f1.denominator * f2.denominator;
            return result;
        }

    public static Fraction substract(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.numerator = f1.numerator * f2.denominator - f1.denominator * f2.numerator;
        result.denominator = f1.denominator * f2.denominator;
        return result;
        }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.numerator = f1.numerator * f2.numerator;
        result.denominator = f1.denominator * f2.denominator;
        return result;
    }

    public static Fraction div(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.numerator = f1.numerator * f2.denominator / f1.denominator * f2.numerator;
        result.denominator = f1.denominator * f2.denominator;
        return result;
    }
//================================
}
