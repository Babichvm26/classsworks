package lesson103_1;

class SimpleExt {
    public static void main(String[] args) {
        try {

            int n = Integer.parseInt(args[0]);
            System.out.println("10 / n " + (10 / n));
            System.out.println("Деление на ноль");

        } catch (ArithmeticException ae) {
            System.out.println("Деление на ноль");

            } catch (ArrayIndexOutOfBoundsException ab) {

                System.out.println("After all actions ");

            }
            System.out.println("END");
        }
    }


