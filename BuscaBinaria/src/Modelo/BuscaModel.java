package Modelo;

import java.util.Arrays;

public class BuscaModel {

    public int buscaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == elemento) {
                return meio;
            }

            if (array[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public int[] ordenarArray(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
