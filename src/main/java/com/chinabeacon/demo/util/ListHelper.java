package com.chinabeacon.demo.util;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListHelper {

    //example ListHelper.firstOrDefault(students, n -> n.getAge()==12)
    public static <T> T firstOrDefault(List<T> list, Predicate<? super T> predicate) {
        if (list != null) {
            Optional<T> first = list.stream().filter(predicate).findFirst();
            if (first.isPresent()) {
                return first.get();
            }
        }
        return null;
    }

    //example ListHelper.where(students, n -> n.getAge() >12)
    public static <T> List<T> where(List<T> list, Predicate<? super T> predicate) {
        if (list != null) {
            return list.stream().filter(predicate).collect(Collectors.toList());
        }
        return null;
    }

    //example ListHelper.select(students, n -> n.getAge())
    public static <T, E> List<E> select(List<T> list, Function<? super T, E> express) {
        List<E> eList = new ArrayList<>();
        for (T t : list) {
            E e = express.apply(t);
            eList.add(e);
        }
        return eList;
    }

    //是否重复
    // example ListHelper.isRepeated(students,n->n.getName()
    public static <T, E> boolean isRepeated(List<T> list, Function<? super T, E> express) {
        for (int i = 0; i < list.size()-1; i++) {
            E e = express.apply(list.get(i));
            for (int j = i + 1; j <list.size(); j++) {
                E e2 = express.apply(list.get(j));
                if (e.equals(e2)) {
                    return true;
                }
            }
        }
        return false;
    }


    //分组
    public  static  <T, E>  HashMap<E,List<T>> group(List<T> list, Function<? super T, E> express) {
        HashMap<E,List<T>>  groups=new HashMap<>();
        for (T t:list){
            E e = express.apply(t);
            if(groups.keySet().contains(e)){
                groups.get(e).add(t);
            }else
            {
                List<T> tempList=new ArrayList<>();
                tempList.add(t);
                groups.put(e,tempList);
            }
        }
        return groups;
    }

    // example ListHelper.orderBy(students,n->n.getAge())
    public static <T, U extends Comparable<? super U>> List<T> orderBy(List<T> list, Function<? super T, ? extends U> keyExtractor) {
        list.sort(Comparator.comparing(keyExtractor));
        return list;
    }


    // example ListHelper.orderBy(students,n->n.getAge())
    public static <T, U extends Comparable<? super U>> List<T> orderByDesc(List<T> list, Function<? super T, ? extends U> keyExtractor) {
        list.sort(Comparator.comparing(keyExtractor).reversed());
        return list;
    }

    // example  ListHelper.max(students,n->n.getAge())
    public static <T, U extends Comparable<? super U>> T max(List<T> list, Function<? super T, ? extends U> keyExtractor) {
        list.sort(Comparator.comparing(keyExtractor));
        if (list.size() > 0) {
            return list.get(list.size() - 1);
        }
        return null;
    }

    // example  ListHelper.min(student,n->n.getAge())
    public static <T, U extends Comparable<? super U>> T min(List<T> list, Function<? super T, ? extends U> keyExtractor) {
        list.sort(Comparator.comparing(keyExtractor));
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

}
