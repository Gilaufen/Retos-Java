package figuras;

public class Cilindro extends Figura {
    private double pi = 3.1416;
    private int radio;
    private int altura;

    public Cilindro() {
    }

    public Cilindro(double pi, int radio, int altura) {
        super();
        this.pi = pi;
        this.radio = radio;
        this.altura = altura;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        double area;
        area = 2 * pi * radio * (radio + altura);
        System.out.println("El área del cilindro es " + area);
        return area;
    }

    public Double calcularPerimetro(){
        Double perimetro;
        Double circulo;
        Double rectangulo;
        circulo= 2*pi*radio;
        rectangulo= 2*pi*radio*altura;
        perimetro = circulo + rectangulo;
        return perimetro;
    }

}
