package Tamrin1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamUseing {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("Amir", "Hatef", "Mehran"
                , "Mojtaba", "Mohammad", "Ali"
                , "Davood", "Reza", "Mohsen"));
        Map<Integer, List<String>> map = new HashMap<>();
        list.stream().collect(
                Collectors.groupingBy(a -> len(a), Collectors.toList())
        ).forEach((a,b)-> System.out.println(a+": "+b+": "+b.size()));
        //System.out.println(map);

       /* System.out.println(list.stream()
                .collect(Collectors.groupingBy(
                        a ->len(a),
                        Collector.of( HashMap<Integer,String>::new,
                                (m,e)-> m.putAll(e),
                                (map1,map2)->{ map1.putAll(map2); return map1;}
                        ))).values());

        System.out.println(list.stream().collect(
                Collectors.groupingBy((a) -> len(a), Collectors.collectingAndThen(Collectors.toSet(), (d) -> {
                   int e = 0;
                    for (String b:d
                         ) {
                        System.out.println(b);
                        e++;
                    }
                return e;
                }
                ))));*/
    }
        public static int len (String x){
            return (x.length());
        }
    }


