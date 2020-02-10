package les4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamHomework {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(6);
        list1.add(5);
        list1.add(8);
        list1.add(10);
        list1.add(11);
        List<Integer> newList=list1.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println(newList);
        List<String> list2=new ArrayList<>();
        list2.add("qq");
        list2.add("bb");
        list2.add("zz");
        list2.add("ww");
        list2.add("nn");
        List<String> newList2=list2.stream().map(e->e.concat("a")).collect(Collectors.toList());
        System.out.println(newList2);

    }
}
