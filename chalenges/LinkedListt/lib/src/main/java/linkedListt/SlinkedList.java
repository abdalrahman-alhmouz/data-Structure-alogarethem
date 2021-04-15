package linkedListt;

public class SlinkedList  {
    sNode head =null ,tail=null ;
    int size =0 ,siz=0 ,i=0;
    // _____________________________________________{{{{code Chaleng 07}}}}

    public String returnValue(int val){
        int i=0 ;
        sNode tem=new sNode();
        sNode h=head;
        while (h!=null){
            if (val<0){
                return "Exeption";
            }else{
                while (i>=0){
                    if(h.next==null){
                        h=head;
                        if(val>i){
                            return "Exeption";
//                            break;
                        }else{
                            for (int j=i-1;j>=val;j--){
                                h=h.next;
                            }
                            return h.data+"";
                        }}else{

                        h=h.next;
                    }
                    ++i;
                }}
            return h.data +"";

        }
        return "Exeption";
    }
    // _____________________________________________{{{{code Chaleng}}}}
public SlinkedList ziplists(SlinkedList nodeOne,SlinkedList nodeTow){
    SlinkedList towList =new SlinkedList();
    sNode curent=nodeOne.head;
    sNode curentOne=nodeTow.head;
    while (curent!=null||curentOne!=null){
        if (curent==null){
            towList.append(curentOne.data);
curentOne=curentOne.next;
        }else if (curentOne==null){
            towList.append(curent.data);
            curent=curent.next;
        }else{
            towList.append(curent.data);
            towList.append(curentOne.data);
            curent=curent.next;
            curentOne=curentOne.next;

        }

    }
    return towList;


}
    public void revers(){
//        SlinkedList towList =new SlinkedList();
        sNode prev=null,curent=head,next= curent.next;

        while (next!=null){
            next=curent.next;
            curent.next=prev;
            prev=curent;
            curent=next;


        }
        head=prev;


    }

//    @Override
//    public String toString() {
//        return "SlinkedList{" +
//                "head=" + head.data +
//                ", tail=" + tail.data +
////                ", size=" + size +
////                ", siz=" + siz +
////                ", i=" + i +
//                '}';
//    }

    public void append(int num){
        if (size==0){
            sNode temb=new sNode();
            temb.data=num;
            head=temb;
            tail=temb;
            size++;
        }else{
            sNode temb=new sNode();
            temb.data=num;
            tail.next=temb ;
            tail=temb;
            size++;

        }
    }

    public String insertAfter(int val,int newVal){
        sNode tem=new sNode();
        sNode h=head;
        while (h!=null){
            if (h.data==val){
                tem.data=newVal;
                tem.next=h.next;
                h.next=tem;
                return printLnkedList();
            }
            h=h.next;
        }
        return "Exeption";
    }

    public String insertBefore(int val,int newVal){
        sNode tem=new sNode();
        sNode h=head;
        while (h!=null){

            if (h.data==val) {
                h.data = newVal;
                if(h.data==newVal){
                    tem.data=val;
                    tem.next=h.next;
                    h.next=tem;
                    h=h.next;
                    return printLnkedList();

                }else {
                    return "Exeption";
                }
            }


            h=h.next;
        }
        return "Exeption";
    }

    public String printLnkedList(){
        String print="",linee="head->",x="x";
        sNode tem=new sNode();
        sNode h=head;
        while (h!=null){
            print +="["+h.data+"]->";
            h=h.next;
        }
        return linee+print+x;
    }

    public void revTow(){
        sNode prev=null,current=head,next=current.next;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
}