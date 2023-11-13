package Polimorfismo;
interface Imprimivel {
    void imprimir();
}

// implementação
class DesktopImprimivel extends Desktop implements Imprimivel {
    // Constructor
    public DesktopImprimivel(int gbMemoria, int numProcessadores, double acessorios) {
        super(gbMemoria, numProcessadores, acessorios);
    }

    // implementação
    @Override
    public void imprimir() {
        System.out.println("Imprimindo Desktop:");
        System.out.println("Memória: " + gbMemoria + "GB");
        System.out.println("Processadores: " + numProcessadores);
        System.out.println("Acessórios: " + acessorios);
    }
}

// implementação
class NoteBookImprimivel extends NoteBook implements Imprimivel {
    // Construtor
    public NoteBookImprimivel(int gbMemoria, int numProcessadores, int polegadasTela) {
        super(gbMemoria, numProcessadores, polegadasTela);
    }

    // implementação
    @Override
    public void imprimir() {
        System.out.println("Imprimindo Notebook:");
        System.out.println("Memória: " + gbMemoria + "GB");
        System.out.println("Processadores: " + numProcessadores);
        System.out.println("Tela: " + polegadasTela + " polegadas");
    }
}
