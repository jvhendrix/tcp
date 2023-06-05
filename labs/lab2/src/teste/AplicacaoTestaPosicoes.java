package teste;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.MessageFormat;
import posicoes.PosicaoMapa4x4;

public class AplicacaoTestaPosicoes {

    private static int MAP_WIDTH = 4;
    private static int MAP_HEIGHT = 4;

    public static void main(String[] args){

        PosicaoMapa4x4 p1 = new PosicaoMapa4x4();
        Scanner sc = new Scanner(System.in);
        
        while (true){

            int x;
            int y;

            System.out.println("Digite um par de numeros x e y entre 0 e 3");

            x = sc.nextInt();
            y = sc.nextInt();

            if (p1.setX(x) && p1.setY(y)){
                p1.imprime();
                break;
            }
            else{
                System.out.println("Posicao invalida!");
            }
        }
        System.out.println("");

        PosicaoMapa4x4 p2 = new PosicaoMapa4x4();
        
        while (true){
        
            int x;
            int y;

            System.out.println("Digite um par de numeros x e y entre 0 e 3");

            x = sc.nextInt();
            y = sc.nextInt();

            if (p2.setX(x) && p2.setY(y)){
                p2.imprime();
                break;
            }
            else{
                System.out.println("Posicao invalida!");
            }

        }
        System.out.println("");
            
        int distance = p1.distancia(p2);
        System.out.println("A distancia entre p1 e p2 eh: " + distance);

        PosicaoMapa4x4 p3 = p1.copy();

        System.out.println("Testando sobreposicao:");   
        System.out.println("p1 e p2: " + PosicaoMapa4x4.estaoMesmaPosicao(p1, p2));    
        System.out.println("p1 e p3: " + PosicaoMapa4x4.estaoMesmaPosicao(p1, p3));
        System.out.println("p2 e p3: " + PosicaoMapa4x4.estaoMesmaPosicao(p2, p3));

        ArrayList<PosicaoMapa4x4> usedPositions = new ArrayList<PosicaoMapa4x4>();

        usedPositions.add(p1);
        usedPositions.add(p2);
        usedPositions.add(p3);

        System.out.println("");

        imprimeMapa(usedPositions);

        sc.close();
    }

    private static void imprimeMapa(ArrayList<PosicaoMapa4x4> usedPositions){
    
        // game board will be array of chars with 16 positions
        // filling all positions with empty spaces    
        char[] board = new char[MAP_HEIGHT*MAP_WIDTH];
        Arrays.fill(board, ' ');

        /*
         * board array is mapped as follows in array of chars
         * 
         * [ 0  ] [ 1  ] [ 2  ] [ 3  ]
         * [ 4  ] [ 5  ] [ 6  ] [ 7  ]
         * [ 8  ] [ 9  ] [ 10 ] [ 11 ]
         * [ 12 ] [ 13 ] [ 14 ] [ 15 ]
         * 
         */
        for (PosicaoMapa4x4 pos : usedPositions){
            int boardPosition = 12 + pos.getX() - 4*pos.getY();
            board[boardPosition] = 'X';   
        }

        int index = 0;
        for (char c : board){  

            System.out.print(MessageFormat.format("[ {0} ]", c));

            if ((index+1) % 4 == 0){
                System.out.println("");
            }

            index++;
        }
        System.out.println("");
    }
}
