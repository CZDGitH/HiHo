import java.util.Arrays;

public class Chance {
    public Chance(){}
    public int setChance(int[] needmath,int num){
        int mathadd[];

        if(num >= needmath.length){
            return 100;
        }
        else {
            int endmath[] = new int[needmath.length - num + 1];
            mathadd =this.newneedmath(needmath);
//            for(int a : mathadd){
//                System.out.println(a);
//            }
            for(int i = 0;i <needmath.length - num + 1;i ++){
                int b = 0;
                for(int j = i;j < i + num + 1;j ++){
                    b = b + mathadd[j];
                }
                endmath[i] = b + num;
            }
            Arrays.sort(endmath);
            return endmath[endmath.length - 1];
        }


    }

    private int[] newneedmath(int[] needmath){
        int setneed[] = new int[needmath.length + 2];
        int backneed[] = new int[needmath.length +1];
        setneed[0] = 0;
        setneed[needmath.length +1] = 101;
        for(int i = 0;i < needmath.length;i ++){
            setneed[i + 1] = needmath[i];
        }
        for(int i = 0;i < setneed.length - 1;i ++){
            backneed[i] = setneed[i + 1] - setneed[i] - 1;
        }
        return backneed;

    }


}
