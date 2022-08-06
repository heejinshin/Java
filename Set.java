import java.util.*;
import java.lang.*;
import java.io.*;

public class Set {

    public static void main (String[] args) throws java.lang.Exception{

//        TreeSet; 정렬 보장
        TreeSet<String> ts = new TreeSet<>();
        ts.add("apple");
        ts.add("banana");
        ts.add("grape");

//        정렬된 순서로 출력
        for(String s : ts){
            System.out.println(s);
        }

//        HashSet; 정렬 보장하지 않음
        HashSet<String> hs = new HashSet<>(ts);

//        정렬되지 않은 채 출력
        for(String s : hs){
            System.out.println(s);
        }

//        For 문 내에서 요소 삭제
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() % 2 == 0) {
                iterator.remove();
            }
        }

//        삭제 결과 출력
        for(String s : hs){
            System.out.println(s);
        }

    }
}
