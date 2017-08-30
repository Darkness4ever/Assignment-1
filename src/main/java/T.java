import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by mahapata on 8/30/2017.
 */

class Item{
    String name;
    int price;
    Item (){

    }
    Item(String name,int price){
        this.name=name;
        this.price=price;
    }

    public String toString(){
        return "name : "+ name+"price : "+price;
    }
}

public class T {
    public static void main(String[] args){
//        XSet ob=new XSet();
        XList ob=new XList();
        ob.add(new Item("akm",90));
        ob.add(new Item("ak",9));

        Iterator iterator=ob.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
