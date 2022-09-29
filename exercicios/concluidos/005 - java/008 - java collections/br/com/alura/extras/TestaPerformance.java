package br.com.alura.extras;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

        //Collection<Integer> numeros = new ArrayList<Integer>(); Tempo de execução: 785  ms, inserção rápida, mas busca lenta.
        Collection<Integer> numeros = new HashSet<>(); // Tempo de execução: 20ms

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}
