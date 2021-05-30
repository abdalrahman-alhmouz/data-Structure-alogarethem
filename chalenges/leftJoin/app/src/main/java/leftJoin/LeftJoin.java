package leftJoin;


import java.util.*;

public class LeftJoin {


ArrayList<String[]> array=new ArrayList<String[]>();
 public ArrayList leftJoin(HashMap tableOne,HashMap tableTow){
     int num;
     HashMap longest,shortest;
     if(tableOne.size()>tableTow.size()){
         num=tableOne.size();
         longest=tableOne;
         shortest=tableTow;
     }else {
         num =tableTow.size();
         longest=tableTow;
         shortest=tableOne;

     }
     String[] arrayTow=new String[num];
     for (Object word : longest.keySet())
        {
            System.out.println(word);
            if (!longest.get(word).equals(shortest.get(word))) {
                arrayTow[0]= (String) word;
                arrayTow[1]= (String) longest.get(word);
                arrayTow[2]= (String) shortest.get(word);
                String[] arrayThree={arrayTow[0],arrayTow[1],arrayTow[2]};
                array.add(arrayThree);

            }else{
                arrayTow[0]=(String) word;
                arrayTow[1]=(String) longest.get(word);
                String[] arrayThree={arrayTow[0],arrayTow[1]};

                array.add(arrayThree);

            }
        }
//     System.out.println(array.get(0)[0]);
//     System.out.println(array.get(1)[0]);
//     System.out.println(array.get(2)[0]);
//     System.out.println(array.get(3)[0]);
//     System.out.println(array.get(4)[0]);

     return array ;
 }

    public String toString(int num) {
        String arrayStr="";
        if (array.isEmpty())
            return null;
        for (int i=0;i<3;i++){
         arrayStr+=array.get(num)[i]+" >";
     }
        return "LeftJoin{" +
                "array=" + arrayStr +
                '}';
    }
}

