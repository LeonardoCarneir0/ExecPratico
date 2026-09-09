package model;

public class NotebookNotaFiscal implements NotaFiscal {

    @Override
    public void emitir(Product product) {
        System.out.println("Emitindo Nota Fiscal de Notebook");
        System.out.println("Produto: " + product.getName());
        System.out.println("Valor: R$ " + product.getPrice());
    }
}