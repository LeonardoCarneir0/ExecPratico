package model;

public class ComputerNotaFiscal implements NotaFiscal {

    @Override
    public void emitir(Product product) {
        System.out.println("Emitindo Nota Fiscal de Computer");
        System.out.println("Produto: " + product.getName());
        System.out.println("Valor: R$ " + product.getPrice());
    }
}