package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        // instancias é isso mesmo???
        DesktopImprimivel desktop = new DesktopImprimivel(8, 4, 50.0);
        NoteBookImprimivel notebook = new NoteBookImprimivel(16, 8, 15);

        // method imprimir
        desktop.imprimir();
        notebook.imprimir();
    }
}
