package factory;

import model.NotaFiscal;
import model.PlaystationNotaFiscal;

public class PlaystationNotaFiscalFactory implements NotaFiscalFactory {

    @Override
    public NotaFiscal createNotaFiscal() {
        return new PlaystationNotaFiscal();
    }
}