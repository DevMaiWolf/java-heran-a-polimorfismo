package Polimorfismo;
class Desktop extends Computador {
    double acessorios;

    // aqui contructor
    public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
        this.gbMemoria = gbMemoria;
        this.numProcessadores = numProcessadores;
        this.acessorios = acessorios;
    }

    // implementacao aqui
    @Override
    double calculaValor() {
        return gbMemoria * 200 + numProcessadores * 400 + acessorios;
    }
}
