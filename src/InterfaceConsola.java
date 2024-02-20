import motor3R.TresEnRaya;
import java.util.Scanner;

public class InterfaceConsola {
    int y;
    int x;

    public void imprimirTablero(String[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void coordenadas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte las coordenadas");

        System.out.print("Eje y: ");
        this.y = sc.nextInt();

        System.out.print("Eje x: ");
        this.x = sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TresEnRaya logica = new TresEnRaya();
        InterfaceConsola interfaz = new InterfaceConsola();

        do {
            interfaz.coordenadas();
            logica.inserccion(interfaz.y, interfaz.x);
            logica.maquina();
            interfaz.imprimirTablero(logica.tablero);
            if (logica.comprobarGanador() == 1) {
                System.out.println("Has ganado");
            }
            if (logica.comprobarGanador() == 0) {
                System.out.println("Has perdido");
            }
            if (logica.comprobarGanador() == 3) {
                System.out.println("Empate");
            }
        } while (logica.comprobarGanador() == -1);
    }

}
