package factory;

import model.ComputerNotaFiscal;
import model.NotaFiscal;

public class ComputerNotaFiscalFactory implements NotaFiscalFactory {

    @Override
    public NotaFiscal createNotaFiscal() {
        return new ComputerNotaFiscal();
    }
}