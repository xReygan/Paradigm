//Структурное программирование: Трассировка пути в лабиринте:
//Описание: Имеется двумерный массив, представляющий лабиринт, где '0' - это проход, а '1' - это стена.
//Начальная и конечная точки заданы. Необходимо определить путь от начальной до конечной точки.
//Почему это структурное программирование: Задача может быть решена с помощью последовательных шагов,
//ветвлений (проверка на наличие стены или уже посещенной клетки) и циклов (для обработки всех
//возможных направлений движения).

import java.util.ArrayList;

public class pathMaze {
    public static void main(String[] args) {
        ArrayList<Integer> path = new ArrayList<Integer>();
        int[][] maze = { {0, 0, 0, 0, 1, 1},
                         {1, 1, 1, 0, 1, 1},
                         {0, 0, 0, 0, 0, 1},
                         {0, 1, 1, 1, 0, 1},
                         {0, 0, 0, 0, 0, 1} };
        int[] start = {0, 0};
        int[] end = {4, 4};
        int current[] = start;
        path.add(start[0]);
        path.add(start[1]);
        for (int i = 0; i < maze.length * maze.length; i ++) {
            if (maze[current[0]][current[1] + 1] == 0) {
                current[1] = current[1] + 1;
                path.add(current[0]);
                path.add(current[1]);
                if (current[0] == end[0] && current[1] == end[1]) {
                    System.out.println(path);
                    break;
                }
            } else {if (maze[current[0] + 1][current[1]] == 0) {
                current[0] = current[0] + 1;
                path.add(current[0]);
                path.add(current[1]);
                if (current[0] == end[0] && current[1] == end[1]) {
                    System.out.print("Координаты пути: ");
                    for (int j = 0; j < path.size(); j = j + 2) {
                        System.out.print("(" + path.get(j) + ", " + path.get(j + 1) + ") ");
                    }
                    break;
                }
            } else {
                System.out.println("Не смог найти выход");
                break;
            }
            }
        }
    }
}
