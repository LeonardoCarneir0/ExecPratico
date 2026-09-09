package factory;

import model.NotaFiscal;
import model.NotebookNotaFiscal;

public class NotebookNotaFiscalFactory implements NotaFiscalFactory {

    @Override
    public NotaFiscal createNotaFiscal() {
        return new NotebookNotaFiscal();
    }
}