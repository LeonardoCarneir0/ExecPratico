package factory;

import model.Notebook;
import model.Product;

public class NotebookStore extends ProductStore {

    public NotebookStore() {
        notaFiscalFactory = new NotebookNotaFiscalFactory();
    }

    @Override
    protected Product createProduct() {
        return new Notebook();
    }
}