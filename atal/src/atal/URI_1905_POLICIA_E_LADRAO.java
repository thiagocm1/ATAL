package atal;

import java.util.Scanner;

public class URI_1905_POLICIA_E_LADRAO {
	
	public static boolean flag = false;
    public static Scanner input;
    public static int[][] coordinates = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int qtd_teste = Integer.parseInt(input.nextLine());
        input.nextLine();

        for(int i = 0 ; i < qtd_teste; i++) {
            input.nextLine();

            String[][] matriz = createMaze();

            flag = false;

            dfs(matriz, new int[]{0,0});

            if(flag) {
                System.out.println("COPS");
            } else {
                System.out.println("ROBBERS");
            }
        }
    }

    public static String[][] createMaze() {
        String[][] maze = new String[5][5];

        for(int i = 0; i < 5; i++) {
            maze[i] = input.nextLine().split(" ");
        }

        return maze;
    }

    public static void dfs(String[][] matriz, int[] cords) {
        if(!(cords[0] >= 0 && cords[0] < 5 && cords[1] >= 0 && cords[1] < 5)) {
            return;
        }

        if(cords[0] == 4 && cords[1]==4){
            flag = true;
            return;
        }

        String elementAt = matriz[cords[1]][cords[0]];
        
        if(elementAt.equals("1") || elementAt.equals("x")){
            return;
        }

        matriz[cords[1]][cords[0]] =  "x";

        for (int[] canidades : coordinates) {
            if(flag) {
                break;
            }
            dfs(matriz, new int[]{cords[0] +canidades[0] , cords[1]+canidades[1]});
        }
    }
}
