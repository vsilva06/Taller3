import java.util.Scanner;

public class Ram {

    
    private String marca;
    private int capacidad;
    private int frecuencia;
    private static Mensaje mensaje = new Mensaje();



    public Ram(boolean l) {
        this.marca = "";
        this.capacidad = 0;
        this.frecuencia = 0;
    }

    public void edRam() {
        establecerMarca();
        establecerCapacidad();
        establecerFrecuencia();

    }

    private void establecerFrecuencia() {
        Scanner tec = new Scanner(System.in);
        int opcion = -1;
        do {
            mensaje.mensaje("frecuecia");
            try {
                opcion = tec.nextInt();
            } catch (Exception e) {
                mensaje.mensaje("error");
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    this.capacidad = 1333;
                    break;
                case 2:
                    this.capacidad = 1600;
                    break;
                case 3:
                    this.capacidad = 1866;
                    break;
                case 4:
                    this.capacidad = 2133;
                    break;
                case 5:
                    this.capacidad = 2400;
                    break;
                default:
                    mensaje.mensaje("error");
                    break;
                case 0:
                    opcion = 0;
                    break;
            }
        }while (opcion!=0);

    }

    private void establecerCapacidad() {
        Scanner tec = new Scanner(System.in);
        int opcion = -1;
        do {
            try {
                mensaje.mensaje("capacidad");
                opcion = tec.nextInt();
            } catch (Exception e) {
                mensaje.mensaje("error");
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    this.capacidad = 2;
                    break;
                case 2:
                    this.capacidad = 4;
                    break;
                case 3:
                    this.capacidad = 8;
                    break;
                case 4:
                    this.capacidad = 16;
                    break;
                case 5:
                    this.capacidad = 32;
                    break;
                default:
                    mensaje.mensaje("error");
                    break;
                case 0:
                    opcion = 0;
                    break;
            }
        }while (opcion!=0);

    }

    private void establecerMarca() {
        Scanner tec = new Scanner(System.in);
        mensaje.mensaje("marca");
        this.marca= tec.next();
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