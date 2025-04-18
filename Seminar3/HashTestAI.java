package Seminar3;

import java.util.HashMap;
import java.util.Map;

public class HashTestAI {

    public static boolean poateFormaCuvant(String sursa, String cuvant) {
        Map<Character, Integer> frecventaSursa = new HashMap<>();
        Map<Character, Integer> frecventaCuvant = new HashMap<>();

        // Normalizează la litere mici și construiește frecvența literelor din sursă
        for (char ch : sursa.toLowerCase().toCharArray()) {
            frecventaSursa.put(ch, frecventaSursa.getOrDefault(ch, 0) + 1);
        }

        // Construiește frecvența literelor din cuvântul dorit
        for (char ch : cuvant.toLowerCase().toCharArray()) {
            frecventaCuvant.put(ch, frecventaCuvant.getOrDefault(ch, 0) + 1);
        }

        // Verifică dacă fiecare literă din cuvânt are suficientă apariție în sursă
        for (char ch : frecventaCuvant.keySet()) {
            if (frecventaCuvant.get(ch) > frecventaSursa.getOrDefault(ch, 0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sursa = "calculator";
        String cuvant = "culoar";

        if (poateFormaCuvant(sursa, cuvant)) {
            System.out.println("Cuvântul \"" + cuvant + "\" poate fi format din literele șirului \"" + sursa + "\".");
        } else {
            System.out.println("Cuvântul \"" + cuvant + "\" NU poate fi format din literele șirului \"" + sursa + "\".");
        }
    }
}

