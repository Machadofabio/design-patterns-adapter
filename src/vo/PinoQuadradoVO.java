package vo;

public class PinoQuadradoVO {

    private Double largura;

    public PinoQuadradoVO(Double largura) {
        this.largura = largura;
    }

    public Double getLargura() {
        return largura;
    }

    public double getQuadrado(){
        double result;
        result = Math.pow(this.largura, 2);
        return result;
    }
}
