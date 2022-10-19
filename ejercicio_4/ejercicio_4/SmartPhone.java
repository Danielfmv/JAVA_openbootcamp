package ejercicio_4;

public class SmartPhone extends SmartDevice {

    String color;
    boolean protectorCase;
    boolean vidrioProtector;
    float tamanio;
    float pixelesCamaraFront;
    float pixelesCamaraBack;
    float peso;

    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String modelo, boolean android, boolean ios, float precio, int year, String color, boolean protectorCase, boolean vidrioProtector, float tamanio, float pixelesCamaraFront, float pixelesCamaraBack, float peso) {
        super(fabricante, modelo, android, ios, precio, year);
        this.color = color;
        this.protectorCase = protectorCase;
        this.vidrioProtector = vidrioProtector;
        this.tamanio = tamanio;
        this.pixelesCamaraFront = pixelesCamaraFront;
        this.pixelesCamaraBack = pixelesCamaraBack;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", protectorCase=" + protectorCase +
                ", vidrioProtector=" + vidrioProtector +
                ", tamanio=" + tamanio +
                ", pixelesCamaraFront=" + pixelesCamaraFront +
                ", pixelesCamaraBack=" + pixelesCamaraBack +
                ", peso=" + peso +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", android=" + android +
                ", ios=" + ios +
                ", precio=" + precio +
                ", year=" + year +
                '}';
    }
}
