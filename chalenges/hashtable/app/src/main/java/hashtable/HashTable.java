package hashtable;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
    List<List<HashNode>> hash=new ArrayList<>();

    public void added(int key,int data) throws Exception {
        int index=getIndex(key);
        List<HashNode> hashTable=hash.get(index);
        for ( HashNode bucket:hashTable){
            if (bucket.data==data){
                throw new Exception("HasTable already contains key");
            }

        }
        hashTable.add(new HashNode(key,data));

    }
    public void Sizee (int size){
        for (int i=0;i<size;i++){
            hash.add(new ArrayList<HashNode>());
        }
    }
//     hash method
    public int getIndex (int key){
       int index=key % hash.size();
       return index ;
    }
    public boolean containKey(int key){
        int index=getIndex(key);
        List<HashNode> hashh=hash.get(index);
        for ( HashNode bucket:hashh){
            if (bucket.num==key){
                return true;

            }
        }
            return false;

        }
    public boolean contain(int key,int data){
        int index=getIndex(key);
        List<HashNode> hashh=hash.get(index);
        for ( HashNode bucket:hashh){
            if (bucket.data==data){
                return true;
            }
        }
        return false;
    }

    public void hash(){

    }
}
