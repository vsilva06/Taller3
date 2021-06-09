import java.util.Scanner;

public class Computador {

    private String marca;
    private String modelo;
    private Ram ram;
    private static Mensaje mensaje = new Mensaje();
    private static Scanner tec = new Scanner(System.in);


    public Computador(boolean l) {
        this.marca = "";
        this.modelo = "";
        this.ram = new Ram(true);
    }

    public Computador() {
        establecerComputador();

    }

    public void establecerComputador() {
            editarMarca();
            editarModelo();
            editarRam();


    }

    public void editarRam() {
        ram.edRam();

    }

    public void editarModelo() {
        Scanner tec = new Scanner(System.in);
        mensaje.mensaje("modelo");
        this.modelo= tec.next();
    }

    public void editarMarca() {
        Scanner tec = new Scanner(System.in);
        mensaje.mensaje("marca");
        this.marca = tec.next();
    }

    public String getMarca() {
        return this.marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Computador{" +
               "marca='" + marca + '\'' +
               ", modelo='" + modelo + '\'' +
               ", ram=" + ram +
               '}';
    }

    public Ram getRam() {
        return this.ram;
    }


    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getModelo() {
        return this.modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}