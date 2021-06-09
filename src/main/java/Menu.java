import java.util.Scanner;

public class Menu {

    public void menu(){
        Computador computador = new Computador(true);
        Scanner tec = new Scanner(System.in);


        int opcion = -1;
        do {
            mensaje("menu");
            try {
                opcion = tec.nextInt();
            } catch (Exception e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    computador.establecerComputador();
                    break;
                case 2:
                    computador.editarModelo();
                    break;
                case 3:
                    computador.editarMarca();
                    break;
                case 4:
                    computador.editarRam();
                case 5:
                    computador.toString();
                    break;
                default:
                    System.err.println("Opcion no valida");
                    break;
                case 0:
                    opcion = 0;
                    break;
            }
        }while (opcion!=0);

    }

    private void mensaje(String menu) {
        if(menu.equals("menu")){
            System.out.println("Seleccione una opcion");
            System.out.println("[1] Ingresar un nuevo conputador" +
                               "[2] Editar Modelo computador" +
                               "[3] Editar Marca Computador" +
                               "[4] Editar ram" +
                               "[5] Mostrar Computador" +
                               "[0] Salir");
        }

    }
}
