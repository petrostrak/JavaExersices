package mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author user
 */
public class PlayWithCollections {

    public static void main(String[] args) {
        playWithLists();
        playWithMap();
        playWithNames();
        playWithSet();
        playWithHash();
    }

    public static void playWithSet() {
        //        playWithNames();
//        playWithLists();
        Set<String> hashSet = new HashSet();
        hashSet.add("Nick");
        hashSet.add("Nick");
        hashSet.add("Mary");
        for (String name : hashSet) {
            System.out.println(name);
        }

        Student s1 = new Student("Nick", 15, 70);
        System.out.println("s1:" + s1);
        Student s2 = new Student("Nick", 15, 95);
        System.out.println("s2:" + s2);
        Student s3 = new Student("Mary", 18, 85);
        System.out.println("s3:" + s3);

        List<Student> list = new ArrayList();
        list.add(s1);
        System.out.println("list.contains(s1):" + list.contains(s1));
        System.out.println("list.contains(s2):" + list.contains(s2));

        Set<Student> setOfStudents = new LinkedHashSet();

        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1.equals(s2):" + s1.equals(s2));
        setOfStudents.add(s1);
        setOfStudents.add(s2);
        setOfStudents.add(s3);
        for (Student student : setOfStudents) {
            System.out.println(student);
        }

        Set<String> treeSet = new TreeSet();
        treeSet.add("Nick");
        treeSet.add("Mary");
        treeSet.add("Nick");
        treeSet.add("Jonathan");
        treeSet.add("Andy");
        System.out.println("****Printing TreeSet of names****");
        for (String name : treeSet) {
            System.out.println(name);
        }

        Set<Student> treeSetStudents = new TreeSet();
        treeSetStudents.add(s1);
        treeSetStudents.add(s2);
        treeSetStudents.add(s3);
        treeSetStudents.add(new Student("Andy", 18, 85));
        System.out.println("****Printing TreeSet of Students****");
        for (Student s : treeSetStudents) {
            System.out.println(s);
        }

        StudentComparatorName myComparator = new StudentComparatorName();

        TreeSet<Student> treeSetStudentByName = new TreeSet(myComparator);
        treeSetStudentByName.addAll(treeSetStudents);

        System.out.println("****Printing TreeSet of Students By Name****");
        for (Student s : treeSetStudentByName) {
            System.out.println(s);
        }
    }

    public static void playWithMap() {
        System.out.println("\n****Playing with Maps*****");
        Map<String, Integer> map = new HashMap();
        map.put("Nick", 80);
        map.put("Mary", 60);
        map.put("Jack", 90);
        map.put("Nick", 90);
        boolean exists = map.containsKey("Mary");
        System.out.println("exists:" + exists);
        map.replace("Mary", 100);
        int grade = map.get("Mary");
        System.out.println("grade:" + grade);
        System.out.println("**Printing Map ****");
        Set<String> keysOfMap = map.keySet();
        for (String key : keysOfMap) {
            int bathmos = map.get(key);
            System.out.println(key + "->" + bathmos);
        }
        System.out.println("****Printing only values***");
        Collection<Integer> values = map.values();
        for (int value : values) {
            System.out.println(value);
        }
        System.out.println("****Printing Map.Entries****");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "--->>>" + entry.getValue());
        }

//        for(Map.Entry<String,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey()+"--->"+entry.getValue());
//        }
    }

    public static void playWithHash() {
        Set<String> names = new HashSet();
        names.add("Nick");
        names.add("Jack");
        names.add("John");
//        for (String name : names) {
//            System.out.println(names);
//            if (name.equals("Nick")) {
//                names.remove(name);
//                names.add("Nick_Nickolaou");
//            }
//        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("Nick")) {
                it.remove();
            }
        }
        System.out.println(names);

        Set<Integer> set = new HashSet();
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(0);
        for (int number : set) {
            System.out.print(number + ",");
            if (number == 1) {
                set.remove(number);
            }
        }
    }

    public static void playWithNames() {
        ArrayList<String> names = new ArrayList();
        names.add("Nick");
        names.add("Jack");
        names.add("Mary");
        names.add("Andy");

        LinkedList<String> linkedListNames = new LinkedList();
        linkedListNames.add("Jack");
        linkedListNames.add("John");
        linkedListNames.addFirst("Mary");
        for (String name : linkedListNames) {
            System.out.print(name + ",");
        }
    }

    public static void playWithLists() {
        List<Student> generalStudents = Student.getLinkedListOfGeneralStudents();
        Student.printListOfStudents(generalStudents, "\n***Printing General Students***");
        List<Student> javaStudents = Student.getListOfJavaStudents(generalStudents);

        Student.printListOfStudents(javaStudents, "\n***Printing Java Students***");

        Student.printListOfStudents(generalStudents, "\n***Printing General Students***");
    }

}
