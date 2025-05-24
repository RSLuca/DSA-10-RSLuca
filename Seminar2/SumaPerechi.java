public class SumaPerechi {
    public static int[] gasesteIndicele(int[] numere, int tinta) {
        for (int i = 0; i < (numere.length - 1); i++) {
            for (int j = i + 1; j < numere.length; j++) {
                if (numere[i] + numere[j] == tinta) {
                    return new int[] {i, j};
                }
            }
        }
        return null; //fekhuwgyyuwqbdwb
    }
    public static void main(String[] args) {
        int[] numere = {2, 7, 11, 15};
        int tinta = 9;

        int[] rezultat = gasesteIndicele(numere, tinta);
        if (rezultat != null) {
            System.out.println("Indicele valorilor care dau suma " + tinta + ": " + rezultat[0] + " și " + rezultat[1]);
        } else {
            System.out.println("Nu există pereche cu suma " + tinta);
        }
    }
}
