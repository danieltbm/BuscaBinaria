package Controle;

import Controle.BuscaController;
import Modelo.BuscaModel;
import Visao.BuscaView;

public class BuscaController {

    private BuscaModel model;
    private BuscaView view;

    public BuscaController(BuscaModel model, BuscaView view) {
        this.model = model;
        this.view = view;
    }

    public void ordenarEBuscar(int[] array, int elemento) {
        int[] arrayOrdenado = model.ordenarArray(array);
        view.mostrarArrayOrdenado(arrayOrdenado);

        int resultado = model.buscaBinaria(arrayOrdenado, elemento);
        view.mostrarResultadoBusca(resultado);
    }
}
