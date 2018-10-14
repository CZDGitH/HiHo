import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        Chance chance = new Chance();

        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }


        int inputnum = 0;
        int delnum = 0;
        //System.out.println(num);
        int answer[] = new int[num];
        scanner.useDelimiter("\\s");
        for(int i = 0;i < num;i ++){
            if(scanner.hasNextInt()){
                inputnum = scanner.nextInt();
                delnum = scanner.nextInt();
            }
            int neednum[] = new int[inputnum];
            if(scanner.hasNextInt()){
                for(int j = 0;j < inputnum;j ++){
                    neednum[j] = scanner.nextInt();
                }
            }


            answer[i] = chance.setChance(neednum,delnum);
            //创建一个类
            //answer[i] =

        }
        for(int number : answer){
            System.out.println(number);
        }
    }
}
