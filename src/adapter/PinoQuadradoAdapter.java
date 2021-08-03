package adapter;

import vo.BuracoRedondoVO;
import vo.PinoQuadradoVO;
import vo.PinoRedondoVO;

public class PinoQuadradoAdapter extends PinoRedondoVO {

    private PinoQuadradoVO pinoQuadrado;

    public PinoQuadradoAdapter(PinoQuadradoVO pinoQuadrado) {
        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public Double getRaio(){
        double result;
        result = (Math.sqrt(Math.pow((pinoQuadrado.getLargura() / 2), 2) * 2));
        return result;
    }
}
