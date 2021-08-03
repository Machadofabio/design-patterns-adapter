package vo;

public class BuracoRedondoVO {

    private Double raio;

    public BuracoRedondoVO(Double raio) {
        this.raio = raio;
    }

    public BuracoRedondoVO() {
    }

    public Double getRaio() {
        return raio;
    }

    public boolean cabe(PinoRedondoVO pinoRedondo){
        boolean result;
        result = (this.getRaio() >= pinoRedondo.getRaio());
        return result;
    }
}
