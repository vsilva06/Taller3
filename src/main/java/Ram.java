import java.util.Scanner;

public class Ram {

    
    private String marca;
    private int capacidad;
    private int frecuencia;
    private static Mensaje mensaje = new Mensaje();
    private static Scanner tec = new Scanner(System.in);


    public Ram(String marca, int capacidad, int frecuencia) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
    }

    public Ram() {


    }

    public String getMarca() {
        return this.marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return this.capacidad;
    }


    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getFrecuencia() {
        return this.frecuencia;
    }


    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

}