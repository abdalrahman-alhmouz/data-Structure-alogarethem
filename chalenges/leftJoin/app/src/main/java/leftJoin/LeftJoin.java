package leftJoin;


import java.util.*;

public class LeftJoin {

    public String[][] leftJoin(HashMap synonym, HashMap antonym) {
        int i=0;
String[][] strArray=new String[synonym.size()][3];

        for (Object k : synonym.keySet())
        {

            if (!synonym.get(k).equals(antonym.get(k))) {
                strArray[i][0]=(String) k;
                strArray[i][1]=(String) synonym.get(k);
                strArray[i][2]=(String) antonym.get(k);
                i++;
            }else{
                strArray[i][0]=(String) k;
                strArray[i][1]=(String) synonym.get(k);
                i++;
            }
        }
return strArray;
    }

    public String toString(String[][] array){

        String string = "[";

        for(int i = 0; i < array.length; i++){
            string += "[";
            for(int j = 0; j < array[i].length; j++){
                string += array[i][j] + ", ";
            }
            string += "]";
        }
        string += "]";

        return string;
    }


}
