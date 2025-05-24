public class NumberOfGoodPairs {
    public static int numarPerechiIdentice(int[] numere) {
        int perechiBune = 0;

        for (int i = 0; i < numere.length; i++) {
            for (int j = i + 1; j < numere.length; j++) {
                if (numere[i] == numere[j]) {
                    perechiBune++;
                }
            }
        }

        return perechiBune;
    }

    public static void main(String[] args) {
        int[] numere = {1, 2, 3, 1, 1, 3};
        System.out.println("Numărul de perechi bune: " + numarPerechiIdentice(numere));
    }
}
