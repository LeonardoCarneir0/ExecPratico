package factory;

import model.NotaFiscal;
import model.PSPortableNotaFiscal;

public class PSPortableNotaFiscalFactory implements NotaFiscalFactory {

    @Override
    public NotaFiscal createNotaFiscal() {
        return new PSPortableNotaFiscal();
    }
}