package factory;

import model.Playstation;
import model.Product;

public class PlaystationStore extends ProductStore {

    public PlaystationStore() {
        notaFiscalFactory = new PlaystationNotaFiscalFactory();
    }

    @Override
    protected Product createProduct() {
        return new Playstation();
    }
}