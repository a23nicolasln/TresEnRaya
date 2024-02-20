package motor3R;

public class TresEnRaya {

    public String[][] tablero = { { "-", "-", "-" },
            { "-", "-", "-" },
            { "-", "-", "-" }
    };

    /**
     *inserta una "o" en el tablero
     */
    public void inserccion(int y, int x) {
        if (this.tablero[y][x] == "-") {
            this.tablero[y][x] = "o";
        }else{
            System.out.println("Casilla ocupada");
        }
        

    }
    /**
     *inserta una "X" en el tablero
     */
    public void maquina() {
        int y = (int) (Math.random() * 3);
        int x = (int) (Math.random() * 3);
        if (comprobarGanador() == 3 || comprobarGanador() == 0 || comprobarGanador() == 1){
            return;
        }else if(this.tablero[y][x] == "-") {
            this.tablero[y][x] = "X";
        } else {
            maquina();
        }
    }
    /**
     *comprueba si hay un ganador y quien es
     */
    public int comprobarGanador() {
        if (this.tablero[0][0].equals("o") && this.tablero[0][1].equals("o") && this.tablero[0][2].equals("o")) {
            return 1;
        } else if (this.tablero[0][0].equals("o") && this.tablero[1][1].equals("o") && this.tablero[2][2].equals("o")) {
            return 1;
        } else if (this.tablero[0][0].equals("o") && this.tablero[1][0].equals("o") && this.tablero[2][0].equals("o")) {
            return 1;
        } else if (this.tablero[0][1].equals("o") && this.tablero[1][1].equals("o") && this.tablero[2][1].equals("o")) {
            return 1;
        } else if (this.tablero[0][2].equals("o") && this.tablero[1][2].equals("o") && this.tablero[2][2].equals("o")) {
            return 1;
        } else if (this.tablero[1][0].equals("o") && this.tablero[1][1].equals("o") && this.tablero[1][2].equals("o")) {
            return 1;
        } else if (this.tablero[2][0].equals("o") && this.tablero[2][1].equals("o") && this.tablero[2][2].equals("o")) {
            return 1;
        } else if (this.tablero[0][2].equals("o") && this.tablero[1][1].equals("o") && this.tablero[2][0].equals("o")) {
            return 1;
        } 
        if (this.tablero[0][0].equals("X") && this.tablero[0][1].equals("X") && this.tablero[0][2].equals("X")) {
            return 0;
        } else if (this.tablero[0][0].equals("X") && this.tablero[1][1].equals("X") && this.tablero[2][2].equals("X")) {
            return 0;
        } else if (this.tablero[0][0].equals("X") && this.tablero[1][0].equals("X") && this.tablero[2][0].equals("X")) {
            return 0;
        } else if (this.tablero[0][1].equals("X") && this.tablero[1][1].equals("X") && this.tablero[2][1].equals("X")) {
            return 0;
        } else if (this.tablero[0][2].equals("X") && this.tablero[1][2].equals("X") && this.tablero[2][2].equals("X")) {
            return 0;
        } else if (this.tablero[1][0].equals("X") && this.tablero[1][1].equals("X") && this.tablero[1][2].equals("X")) {
            return 0;
        } else if (this.tablero[2][0].equals("X") && this.tablero[2][1].equals("X") && this.tablero[2][2].equals("X")) {
            return 0;
        } else if (this.tablero[0][2].equals("X") && this.tablero[1][1].equals("X") && this.tablero[2][0].equals("X")) {
            return 0;
        }
        int r = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.tablero[i][j] == "-") {
                    r++;
                }
            }
        }
        if (r == 9) {
            return 3;
        }
        return -1;
    }
}
