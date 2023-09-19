import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Retangulo retangulo = new Retangulo();
        System.out.println("Forneça a largura e altura do retângulo:");
        retangulo.setAltura(sc.nextDouble());
        retangulo.setLargura(sc.nextDouble());
        retangulo.calculaArea();
        retangulo.calculaPerimetro();
        retangulo.calculaDiagonal();
        System.out.println("Área: " + retangulo.calculaArea());
        System.out.println("Perímetro: " + retangulo.calculaPerimetro());
        System.out.println("Diagonal: " + retangulo.calculaDiagonal());
        sc.close();
    }
}