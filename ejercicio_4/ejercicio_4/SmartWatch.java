package ejercicio_4;

public class SmartWatch extends SmartDevice{

    String color;
    String forma;
    boolean monitorSalud;
    boolean sonido;
    boolean correasIntercambiables;
    float tamaño;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, boolean android, boolean ios, float precio, int year, String color, String forma, boolean monitorSalud, boolean sonido, boolean correasIntercambiables, float tamaño) {
        super(fabricante, modelo, android, ios, precio, year);
        this.color = color;
        this.forma = forma;
        this.monitorSalud = monitorSalud;
        this.sonido = sonido;
        this.correasIntercambiables = correasIntercambiables;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' +
                ", forma='" + forma + '\'' +
                ", monitorSalud=" + monitorSalud +
                ", sonido=" + sonido +
                ", correasIntercambiables=" + correasIntercambiables +
                ", tamaño=" + tamaño +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", android=" + android +
                ", ios=" + ios +
                ", precio=" + precio +
                ", year=" + year +
                '}';
    }
}

