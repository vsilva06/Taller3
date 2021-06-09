public class Mensaje {

    public void mensaje(String s){
        if(s.equals("error")){
            System.err.println("Opcion no valida");
        }else if(s.equals("capacidad")){
            capacidad();
        }else if(s.equals("frecuebcia")){
            frecuencia();
        }else if(s.equals("marca")){
            System.out.println("Ingrese la marca");
        }else if(s.equals("modelo")){
            System.out.println("Ingrese el modelo");
        }


    }

    private void frecuencia() {
        System.out.println("Seleccione la frecuencia de la ram");
        System.out.println("[1] 1333 MHz" +
                           "[2] 1600 MHz" +
                           "[3] 1866 MHz" +
                           "[4] 2133 MHz" +
                           "[5] 2400 MHz" +
                           "[0] Salir");
    }

    private void capacidad() {
        System.out.println("Seleccione la capacidad de la ram");
        System.out.println("[1] 2 GB" +
                           "[2] 4 GB" +
                           "[3] 8 GB" +
                           "[4] 16 GB" +
                           "[5] 32 GB" +
                           "[0] Salir");
    }
}
