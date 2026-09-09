package factory;

import model.PlaystationPortable;
import model.Product;

public class PlaystationPortableStore extends ProductStore {

    public PlaystationPortableStore() {
        notaFiscalFactory = new PSPortableNotaFiscalFactory();
    }

    @Override
    protected Product createProduct() {
        return new PlaystationPortable();
    }
}