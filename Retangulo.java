import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Retangulo {
    private double altura;
    private double largura;

    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double calculaArea(){
        return altura * largura;
    }
    public double calculaDiagonal(){
        double diagonal;
        diagonal = sqrt(pow(altura, 2) + pow(largura, 2));
        return diagonal;
    }
    public double calculaPerimetro(){
        return (altura + largura)*2;
    }
}