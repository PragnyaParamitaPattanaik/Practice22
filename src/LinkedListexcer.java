import java.util.LinkedList;

public class LinkedListexcer {
    public static void main(String[] args) {


        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("red");
        l_list.add("yellow");
        l_list.add("blue");
        l_list.add("black");
        l_list.add("white");
        System.out.println("Original LinkedList:"+l_list);
        for(int p=0;p< l_list.size();p++)

        System.out.println("Element at index "+p+": "+l_list.get(p));

    }
}
