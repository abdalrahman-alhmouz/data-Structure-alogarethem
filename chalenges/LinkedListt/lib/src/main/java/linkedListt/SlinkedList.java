package linkedListt;

public class SlinkedList {
    sNode head=null ;
    sNode tail =null ;
    int size =0 ;
    public  void insert(int number){

        if(size==0){
            sNode temp=new sNode();
            temp.data =number;
            head =temp;
            tail =temp;
            size ++ ;
        }else{
            sNode temp=new sNode();
            temp.data =number;
            tail.next=temp;
            tail =temp;
            size ++ ;


        }

    }
    public boolean includes(int number){
        sNode h=head ;
        while (h!=null){
            if (h.data==number){

                return true ;
            }
            h= h.next ;

        }

        return false ;
    }
    public String toString(){
        sNode h=head;
        String print="";
        String printNull="Null";

        while (h!=null){

            print +="{"+h.data+"}->";
            h= h.next ;

        }
        System.out.print(print+printNull);


        return print+printNull;
    }

    public void print(){
        sNode h=head;
        while (h !=null){
            System.out.print(" "+h.data+" ");
            h= h.next ;

        }
    }
}