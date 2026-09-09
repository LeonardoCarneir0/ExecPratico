package model;

public class PlaystationNotaFiscal implements NotaFiscal {

    @Override
    public void emitir(Product product) {
        System.out.println("Emitindo Nota Fiscal de Playstation");
        System.out.println("Produto: " + product.getName());
        System.out.println("Valor: R$ " + product.getPrice());
    }
}