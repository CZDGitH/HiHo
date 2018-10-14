import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int map_x = 0;
        int map_y = 0;

        if(scanner.hasNextInt()){
            map_x = scanner.nextInt();
            map_y = scanner.nextInt();
        }
        char map[][] = new char[map_x][map_y];

        for(int x = 0;x < map_x;x ++){
            String input = null;
                if(scanner.hasNext()){
                    input = scanner.next();
                    map[x] = input.toCharArray();
                }


        }

        //位置周围建筑
        char loca[][] =new char[3][3];

        for(int i = 0;i < 3;i ++){
            String inputloc = null;
            if(scanner.hasNext()){
                inputloc = scanner.next();
                loca[i] = inputloc.toCharArray();
            }
        }

        FindLocation findLocation = new FindLocation();
        //int backab[][] = null;

        for(int a = 0;a < map.length - 2;a ++) {
            for(int b = 0;b < map[a].length - 2;b ++){
                if(findLocation.findway(loca,map,a,b)){
                    System.out.println((a + 2) + " " + (b + 2));
                }

            }

        }


    }

}
