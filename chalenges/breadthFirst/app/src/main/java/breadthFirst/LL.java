package breadthFirst;

public class LL {
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

    public void print(sNode head){
        sNode h=head;
        while (h !=null){
            System.out.print(" "+h.data+" ");
            h= h.next ;

        }
    }
    public sNode ret(){
        sNode next=null,prev=null,count=null,current=head;
        while(current.next!=null){
            next=current;
            current=current.next;
//            prev=current;
//            count.next=prev;
            System.out.println(current.data);

            current.next=next;
        }
        return current;
    }
}
class sNode{
    int data;
    sNode next;

}