public class PrintingPatterns {
    public static void printNumberTriangle(int numberOfRows) {
        if (numberOfRows <= 0) {
            System.out.println("Numarul de randuri trebuie sa fie pozitiv");
            return;
        }

        int curentNumber = 1;

        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++){
                System.out.print(curentNumber + " ");
                curentNumber++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberTriangle(6);
        printNumberTriangle(12);
        printNumberTriangle(0);
    }
}
