package linkedListt;

import java.util.ArrayList;

public class SlinkedList{
    sNode head =null ,tail=null ;
    int size =0 ,sizee=0 ;

    // _____________________________________________{{{{code Chaleng 07}}}}


public void zipLists(SlinkedList listOne,SlinkedList listTow){
    int i=0;
    ArrayList<Integer> arrayList=new ArrayList<Integer>();
//head=temb;
    sNode temb=new sNode();
    temb.data=listTow.head.data;
    System.out.println(temb.data);
    temb.next=temb;
    temb.data=listOne.head.data;
    temb.next=listOne.head.next;
    System.out.println(temb.data);




    while (i<5){
//    System.out.println(listOne.tail.data);
//    System.out.println(listTow.tail.data);
//    System.out.println(temb.data);
//    System.out.println("head");
    i++;

}

//    while (listOne!=null){
//        if (sizee==0){
//            temb.data=listOne.data;
//            temb.next=listOne.next;
//            head=temb;
//            tail=temb;
//            arrayList.add(listOne.data);
//            sizee++;
//
//        }
//        else if (sizee%2==0){
////                listOne=listOne.next;
//                headOne=listOne.data;
//                temb.data=headOne;
//                tail.next=temb ;
//                tail=temb;
//                sizee++;
//
//            }
//            else if (size%2!=0){
////                listTow=listTow.next;
//                headTow=listTow.data;
//                temb.data=headTow;
//                tail.next=temb ;
//                tail=temb;
//                size++;
//
//            }
//            System.out.println(arrayList);
//            listOne=listOne.next;
//        }
}
//
//    @Override
//    public String toString() {
//        return "SlinkedList{" +
//                "head=" + head.data +
//                ", tail=" + tail.data +
//                '}';
//    }

    public void append(int num){
        sNode temb=new sNode();
        if (size==0){
            temb.data=num;
            head=temb;
            tail=temb;
            size++;
        }else{
            temb.data=num;
            tail.next=temb ;
            tail=temb;
            size++;

        }
    }

//    public String returnValue(int val){
//        int i=0 ;
//        sNode tem=new sNode();
//        sNode h=head;
//        while (h!=null){
//            if (val<0){
//                return "Exeption";
//            }else{
//                while (i>=0){
//                    if(h.next==null){
//                        h=head;
//                        if(val>i){
//                            return "Exeption";
////                            break;
//                        }else{
//                            for (int j=i-1;j>=val;j--){
//                                h=h.next;
//                            }
//                            return h.data+"";
//                        }}else{
//
//                        h=h.next;
//                    }
//                    ++i;
//                }}
//            return h.data +"";
//
//        }
//        return "Exeption";
//    }
//    // _____________________________________________{{{{code Chaleng}}}}
//
//
//
//    public String insertAfter(int val,int newVal){
//        sNode tem=new sNode();
//        sNode h=head;
//        while (h!=null){
//            if (h.data==val){
//                tem.data=newVal;
//                tem.next=h.next;
//                h.next=tem;
//                return printLnkedList();
//            }
//            h=h.next;
//        }
//        return "Exeption";
//    }
//
//    public String insertBefore(int val,int newVal){
//        sNode tem=new sNode();
//        sNode h=head;
//        while (h!=null){
//            if (h.data==val) {
//                h.data = newVal;
//                if(h.data==newVal){
//                    tem.data=val;
//                    tem.next=h.next;
//                    h.next=tem;
//                    h=h.next;
//                    return printLnkedList();
//                }else {
//                    return "Exeption";
//                }}
//            h=h.next;
//        }
//        return "Exeption";
//    }

//    public sNode printLnkedList(sNode one){
//        String print="",linee="head->",x="x";
////        sNode temb=new sNode();
//        sNode h=head;
//
//        while (h!=null){
//            print +="["+h.data+"]->";
//            one=h;
//            one.next=h.next;
//            h=h.next;
//            System.out.println(one.data);
//        }
//        return one;
//    }
//
//    public String print(sNode node){
//        String print="",linee="head->",x="x";
////        sNode tem=new sNode();
////        sNode h=head;
//        while (node!=null){
//            print +="["+node.data+"]->";
//            node=node.next;
//        }
//        return linee+print+x;
//    }
}