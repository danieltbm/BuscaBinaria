package Visao;

public class BuscaView {

    public void mostrarArrayOrdenado(int[] array) {
        System.out.println("Array ordenado: " + java.util.Arrays.toString(array));
    }

    public void mostrarResultadoBusca(int resultado) {
        if (resultado == -1) {
            System.out.println("Elemento não encontrado no array.");
        } else {
            System.out.println("Elemento encontrado no índice: [" + resultado + "].");
        }
    }
}
