import java.util.Arrays;

public class Cleaner {

    public Cleaner(){}
    private String addWord[] = {"A","B","C"};
    private String wordNew;

    public String reword;
    public int[] setClean(String[] word){
        int wordlenth = word.length;
        int num[] = new int[wordlenth];
        for(int i = 0;i < wordlenth;i ++){
            int indexnum[] = new int[word[i].length() + 1];
            for (int j = 0;j < word[i].length() + 1;j ++){
                indexnum[j] = getneword(word[i],j);
            }
            Arrays.sort(indexnum);
            num[i] = indexnum[word[i].length()];
        }
        return num;
    }


    public int getneword(String words,int index){
        int slectnum[] = new int[addWord.length];
        for(int i = 0;i < addWord.length;i ++){
            wordNew = words.substring(0, index) + addWord[i] + words.substring(index);


            String wordchage = this.clean(wordNew);

            //*************************************



            //***************************************
            slectnum[i] = wordNew.length() - wordchage.length();
        }
        Arrays.sort(slectnum);
        return slectnum[addWord.length - 1];
    }

//循环要一次走完再走第二次。需要修改。
    public String clean(String wordclean) {

        char makeword[] = wordclean.toCharArray();
        StringBuffer wordback = new StringBuffer();

            for (int i = 0; i < wordclean.length(); i++) {


                if (i == (wordclean.length() - 1)) {
                    //return wordback = wordback + makeword[i];
                    wordback.append(makeword[i]);
                } else {
                    if (this.charequals(makeword[i], makeword[i + 1])) {
                        i = i + 1;
                        if(i == (wordclean.length()-1)){
                            if(wordback.toString().length() != 0) {
                                return this.clean(wordback.toString());
                            }
                            else {
                                return wordback.toString();
                            }
                        }
                        else {
                            while (this.charequals(makeword[i], makeword[i + 1])) {
                            //i ++;
                            i = i + 1;
                            if (i == (wordclean.length() - 1)) {
                                if(wordback.toString().length() != 0) {
                                    return this.clean(wordback.toString());
                                }
                                else {
                                    return wordback.toString();
                                }
                                //break;
                            }

                            }
                    }
                        //i = i + 1;
                    }

                    else {

                        wordback.append(makeword[i]);

                    }
                }
            }
            if (wordback.toString().equals(wordclean)) {
                return wordback.toString();
            } else {
                return this.clean(wordback.toString());
            }


    }



    public boolean charequals(char ch,char chnext) {
        if(ch == chnext){
            return true;
        }
        else return false;
    }
}
