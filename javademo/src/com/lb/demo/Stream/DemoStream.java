package com.lb.demo.Stream;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lb
 * @create 2021-03-09
 */
public class DemoStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张三丰");

        list.stream()
                .filter((a) -> a.length() == 3)
                .filter((a) -> a.startsWith("张")).forEach(a-> System.out.println(a));


        List<String> list2 = list.stream()
                .filter((a) -> a.length() == 3)
                .filter((a) -> a.startsWith("张")).collect(Collectors.toList());
        System.out.println(list2);



    }
}
