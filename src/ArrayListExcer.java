import java.util.ArrayList;
import java.util.List;

public class ArrayListExcer {
    public static void main(String[] args) {
        List<String> list_Strings=new ArrayList<>();
        list_Strings.add("red");
        list_Strings.add("yellow");
        list_Strings.add("blue");
        list_Strings.add("black");
        list_Strings.add("white");

        System.out.println(list_Strings);
        list_Strings.set(2,"Orange");
        System.out.println(list_Strings);
        }
    }

