import java.util.Arrays;

public class FindLocation {
    public FindLocation(){}

    public int turnflag = 0;


    public boolean findway(char[][] lacation,char[][] map,int a,int b){


        if (this.way(lacation, map, a, b)) {

            return true;
        }
        else {

            if (turnflag < 3) {

                char temchar[][] = new char[lacation.length][lacation[0].length];

                turnflag++;

                temchar = this.turnlaoc(lacation);

                if (this.twoArrayEquals(lacation,temchar)) {

                    return false;
                } else {

                    return this.findway(temchar, map, a, b);
                }
            }
            else {
                turnflag = 0;
                return false;
            }
        }
    }

    /**查看位置是否在map中
     * @param lacat 所在位置
     * @param map 地图
     * @return ture or false
     */

    private boolean way(char[][] lacat,char[][] map,int a,int b){
        int flag = 0;
        for(int i = 0;i < lacat.length;i ++){
            for(int j = 0;j < lacat[i].length;j ++){
                flag ++;
                if(lacat[i][j] == map[i + a][j + b]){
                    continue;
                }
                else {
                    return false;
                }

            }
        }
        return true;
    }



    private char[][] turnlaoc(char[][] loacation){

        char locaturn[][] = new char[loacation.length][loacation[0].length];

        for(int i = 0;i < loacation.length;i ++){
            for(int j = 0;j < loacation[i].length;j ++){

                locaturn[i][j] = loacation[j][i];
            }
            for(int m = 0;m < (Math.ceil((double) loacation[i].length/2));m ++){
                char tem = locaturn[i][m];
                locaturn[i][m] = locaturn[i][loacation[i].length - m - 1];
                locaturn[i][locaturn[i].length - m - 1] = tem;
            }


        }

        return locaturn;


    }

    private boolean twoArrayEquals(char[][] data,char[][] temp){
        for(int i = 0;i < data.length;i ++){
            if(Arrays.equals(data[i],temp[i])){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

}
