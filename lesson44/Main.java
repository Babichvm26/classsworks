package lesson44;

public class Main {
    public static void main(String[] args) {
//   Controller c = new Controller();

Fraction f1 = new Fraction(5,2);
Fraction f2 = new Fraction(6,3);
        System.out.println("Входные данные f1="+f1.numerator+"/"+ f1.denominator);
        System.out.println("               f2="+f2.numerator+"/"+ f2.denominator);

Fraction summa = Calculator.add(f1,f2);
       View.display(summa);

Fraction substrac = Calculator.substract(f1,f2);
       View.display(substrac);

Fraction multi = Calculator.multiply(f1,f2);
       View.display(multi);

Fraction div = Calculator.div(f1,f2);
        View.display(div);



    }
}
