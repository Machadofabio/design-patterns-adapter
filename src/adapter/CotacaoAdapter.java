package adapter;

import vo.Cotacao;

public class CotacaoAdapter extends Cotacao {

    @Override
    public Double getValor() {
        return super.getValor();
    }

    public Double getValorDolar(){
        return (super.getValor() * 5.00);
    }

    @Override
    public void setValor(Double valor) {
        super.setValor(valor);
    }
}
