package Polimorfismo;
class NoteBook extends Computador {
    int polegadasTela;

    // constructor
    public NoteBook(int gbMemoria, int numProcessadores, int polegadasTela) {
        this.gbMemoria = gbMemoria;
        this.numProcessadores = numProcessadores;
        this.polegadasTela = polegadasTela;
    }

    // implementação
    @Override
    double calculaValor() {
        return gbMemoria * 250 + numProcessadores * 500 + polegadasTela * 100;
    }
}
