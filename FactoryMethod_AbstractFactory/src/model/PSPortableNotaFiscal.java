package model;

public class PSPortableNotaFiscal implements NotaFiscal {

    @Override
    public void emitir(Product product) {
        System.out.println("Emitindo Nota Fiscal de Playstation Portable");
        System.out.println("Produto: " + product.getName());
        System.out.println("Valor: R$ " + product.getPrice());
    }
}