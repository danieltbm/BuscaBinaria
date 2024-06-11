package BuscaBinaria;

import Controle.BuscaController;
import Modelo.BuscaModel;
import Visao.BuscaView;

public class Main {

    public static void main(String[] args) {
        int[] array = {54, 26, 93, 17, 77, 31, 44, 55, 20, 65};
        int numeroParaEncontrar = 31;

        BuscaModel model = new BuscaModel();
        BuscaView view = new BuscaView();
        BuscaController controller = new BuscaController(model, view);

        controller.ordenarEBuscar(array, numeroParaEncontrar);
    }
}
