package trainingqt;

import java.util.Scanner;

public class SnakeGame {
    public static void main(String[] args) {
        //Initialize what we know
        String moveRight = "Right";
        String moveLeft = "Left";
        String questionText = "Give direction for" + moveRight + " or " + moveLeft;
        String successmsg = "Yes,Yes You WIN!";
        String badmsg = "You've lost!You can try again!";
        //Initialize configs for snake
        char[] map;
        int startPoint, mapLength, snakeLength;
        startPoint = 0;
        mapLength = 10;
        snakeLength = 2;
        char mapStructure, snakeStructure;
        mapStructure = '-';
        snakeStructure = '*';
        //Create Map
        map = new char[mapLength];
        for (int i = 0; i < mapLength; i++) {
            map[i] = mapStructure;
            System.out.print(map[i] + " ");
        }
        System.out.println();

        //snake Position(head)
        int snakeStart = startPoint;
        int snakeEnd = snakeStart + snakeLength;
        //snake
        for (int i = snakeStart; i < snakeEnd; i++) {
            map[i] = snakeStructure;
        }

        for (int i = 0; i < mapLength; i++) {
            System.out.print(map[i]);
        }






//        while (mapLength-1==mapStructure) {
//            Scanner scanner = new Scanner(System.in);
//        }


    }
}

