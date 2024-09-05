package figuras;

public class Circulo extends Figura {
    private double pi = 3.1416;
    private int radio;

    public Circulo() {
    }

    public Circulo(double pi, int radio) {
        super();
        this.pi = pi;
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        double area;
        area = pi * (radio * radio);
        System.out.println("El área del círculo es " + area);
        return area;
    }

    public Double calcularPerimetro(){
        Double perimetro;
        perimetro = 2* pi *radio;
        return perimetro;
    }

}
