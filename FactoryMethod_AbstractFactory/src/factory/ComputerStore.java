package factory;

import model.Computer;
import model.Product;

public class ComputerStore extends ProductStore {

    public ComputerStore() {
        notaFiscalFactory = new ComputerNotaFiscalFactory();
    }

    @Override
    protected Product createProduct() {
        return new Computer();
    }
}