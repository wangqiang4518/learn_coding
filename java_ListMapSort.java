package a_设计模式_单例模式;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class java_ListMapSort {

    /** 
     * @param args 
     */
    @SuppressWarnings( { "rawtypes", "unchecked" })
    public static void main(String[] args) {
        // TODO Auto-generated method stub  
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("id", "1");
        map1.put("name", "p");
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("id", "2");
        map2.put("name", "h");
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("id", "3");
        map3.put("name", "f");
        list.add(map1);
        list.add(map3);
        list.add(map2);
        //排序前  
        for (Map<String, Object> map : list) {

            System.out.println(map.get("id"));
        }
        Collections.sort(list, new Comparator<Map<String, Object>>() {

            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                String name1 = (String) o1.get("id");//name1是从你list里面拿出来的一个  
                String name2 = (String) o2.get("id"); //name1是从你list里面拿出来的第二个name      
                return name1.compareTo(name2);
            }

        });
        //排序后  
        System.out.println("-------------------");
        for (Map<String, Object> map : list) {

            System.out.println(map.get("id"));
        }
    }
}