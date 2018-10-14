import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }
        String word[] = new String[num];
        for(int i = 0;i < num;i ++){
            if(scanner.hasNext()){
                word[i] = scanner.next();
            }
        }
        //处理
        Cleaner cleaner = new Cleaner();
        int answer[] = new int[word.length];
        answer = cleaner.setClean(word);
        for (int clenanum : answer ){
            System.out.println(clenanum);
        }
    }
}
