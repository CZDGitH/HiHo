import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //输入放入字典的单词
        String word[];
        String seaWord[];
        int inNumput = 0;
        int seaNum = 0;
        Scanner innum = new Scanner(System.in);
        if(innum.hasNextInt()){
            inNumput = innum.nextInt();
        }
        word = new String[inNumput];
        for(int i = 0;i < inNumput;i++){
            word[i] = innum.next();
        }




        if(innum.hasNextInt()){
            seaNum = innum.nextInt();
        }
        seaWord = new String[seaNum];
        for(int i = 0;i < seaNum;i ++){
            seaWord[i] = innum.next();
        }

        TrieCheck trie = new TrieCheck();
        trie.addWork(word);
        trie.searchWork(seaWord);

    }
}
