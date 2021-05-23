package hashtable;

import java.util.ArrayList;
import java.util.List;

public class Hassssssh {
    List<List<HashNode>> hash=new ArrayList<>();

    public void added(int key,int data){
        int index=getIndex(key);
        List<HashNode> hashh=hash.get(index);
        for ( HashNode bucket:hashh){
            if (bucket.data==data){

            }
            hashh.add(new HashNode(key,data));
        }

    }
    public void Sizee (int size){
        for (int i=0;i<size;i++){
            hash.add(new ArrayList<HashNode>());
        }
    }
    public int getIndex (int key){
       int index=key % hash.size();
       return index ;
    }
    public boolean contain(int key){
        int index=getIndex(key);
        List<HashNode> hashh=hash.get(index);
        for ( HashNode bucket:hashh){
            if (bucket.data==key){
                return true;

            }
        }
            return false;

        }
}
