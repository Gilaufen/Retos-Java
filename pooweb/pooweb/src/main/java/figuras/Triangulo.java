package figuras;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;
    private Double ladoA;
    private Double ladoB;

    public Triangulo() {

    }

    public Triangulo(Double base, Double altura, Double ladoA, Double ladoB) {
        super();
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLadoA() {
        return ladoA;
    }

    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    public Double getLadoB() {
        return ladoB;
    }

    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public Double calcularArea() {
        Double area;
        area = (base * altura) / 2;
        return area;
    }

    public Double calcularPerimetro(){
        double perimetro;
        perimetro = base + ladoA + ladoB;
        return perimetro;
    }

}
