package breadthFirst;

import java.util.ArrayList;

public class BreadthFirst{
    final int maxNode =20;
    vertex arrayVer[];
    int arrayMat[][];
    int numVertex;
    ArrayList<Integer>array;
    ArrayList<Integer>arrayBreadth=new ArrayList<>();
    public BreadthFirst(){
        arrayVer=new vertex[maxNode];
        arrayMat=new int[maxNode][maxNode];
        array=new ArrayList<Integer>();
    }
    public void addVertix(int data){
        arrayVer[numVertex++]=new vertex(data);
    }
    public void addEdge(int first,int end){
        arrayMat[first][end]=1;
        arrayMat[end][first]=1;
    }
    public int displayValue(int val){
        System.out.println(arrayVer[val].data);
        arrayBreadth.add(arrayVer[val].data);
        return arrayVer[val].data;
    }
    public int getUnVisited(int vertex){
        for (int i=0;i<numVertex;i++){
            if (arrayMat[vertex][i]==1 && arrayVer[i].wasVisited==false){
                return i;
            }

        }
        return -1;
    }
    public ArrayList<Integer> breadthFirst(){
        arrayVer[0].wasVisited=true;
        displayValue(0);
        array.add(0);

        int num2;

        while (!array.isEmpty()){

            int num1= array.remove(0);
            while ((num2=getUnVisited(num1))!=-1){
                arrayVer[num2].wasVisited=true;
                displayValue(num2);
                array.add(num2);
            }

        }


        return arrayBreadth;
    }

}
