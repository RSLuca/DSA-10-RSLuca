public class VerificareDuplicat {
    public static boolean areDubluri(int[] numere) {
        for (int i = 0; i < numere.length; i++) {
            for (int j = i + 1; j < numere.length; j++) {
                if (numere[i] == numere[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] exemplu = {3, 1, 4, 2, 5, 3};
        System.out.println("Există duplicate? " + areDubluri(exemplu));
    }
}
