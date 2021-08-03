package service;

import adapter.PinoQuadradoAdapter;
import vo.BuracoRedondoVO;
import vo.PinoQuadradoVO;
import vo.PinoRedondoVO;

public class AdapterServiceTest {

    public static void main(String[] args) {
        BuracoRedondoVO buracoRedondoVO = new BuracoRedondoVO(5.0);
        PinoRedondoVO pinoRedondoVO = new PinoRedondoVO(5.0);

        if(buracoRedondoVO.cabe(pinoRedondoVO)){
            System.out.println("Pino redondo cabe no buraco redondo");
        } else {
            System.out.println("Pino muito grande");
        }

        PinoQuadradoVO pinoQuadradoPequeno = new PinoQuadradoVO(2.0);
        PinoQuadradoVO pinoQuadradoGrande = new PinoQuadradoVO(20.0);

        PinoQuadradoAdapter pinoQuadradoAdaptadoPequeno = new PinoQuadradoAdapter(pinoQuadradoPequeno);
        PinoQuadradoAdapter pinoQuadradoAdaptadoGrande = new PinoQuadradoAdapter(pinoQuadradoGrande);

        (buracoRedondoVO.cabe(pinoQuadradoAdaptadoPequeno)) ?
            System.out.println("Pino quadrado cabe no buraco redondo") : System.out.println("Pino quadrado muito grande");

        (buracoRedondoVO.cabe(pinoQuadradoAdaptadoGrande)) ?
            System.out.println("Pino quadrado cabe no buraco redondo") : System.out.println("Pino quadrado muito grande");

    }
}
