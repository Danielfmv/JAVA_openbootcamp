package ejercicio_4;

public class SmartDevice {

    String fabricante;
    String modelo;
    boolean android;
    boolean ios;
    float precio;
    int year;

    public SmartDevice () {

    }

    public SmartDevice(String fabricante, String modelo, boolean android, boolean ios, float precio, int year) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.android = android;
        this.ios = ios;
        this.precio = precio;
        this.year = year;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", android=" + android +
                ", ios=" + ios +
                ", precio=" + precio +
                ", year=" + year +
                '}';
    }
}
