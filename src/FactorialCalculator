public class FactorialCalculator {
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Пример использования программы
        int number = 5;
        System.out.println("Факториал " + number + " равен " + factorial(number));
    }
}
