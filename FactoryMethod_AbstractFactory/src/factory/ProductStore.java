package factory;

import model.NotaFiscal;
import model.Product;

public abstract class ProductStore {

    protected NotaFiscalFactory notaFiscalFactory;

    public Product orderProduct() {

        Product product = createProduct();

        product.showProduct();

        NotaFiscal notaFiscal = notaFiscalFactory.createNotaFiscal();

        notaFiscal.emitir(product);

        return product;
    }

    protected abstract Product createProduct();
}