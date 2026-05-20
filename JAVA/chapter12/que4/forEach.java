package que4;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class forEach {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();

        list.add(new Student(1, "Aditya"));
        list.add(new Student(2, "Rahul"));
        list.add(new Student(3, "Sahil"));

        System.out.println("-------for each loop---");
        forEachLoop(list);

        System.out.println("-----iterator-----------");
        iteratorMethod(list);

        System.out.println("--------list iterator----------");
        listIteratorMethod(list);

        System.out.println("---------enumerator------------");
        enumeratorMethod();
    }

    // a. For-each loop
    static void forEachLoop(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // b. Iterator
    static void iteratorMethod(List<Student> list) {
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
    }

    // c. ListIterator
    static void listIteratorMethod(List<Student> list) {
        ListIterator<Student> li = list.listIterator();

        while (li.hasNext()) {
            Student s = li.next();
            System.out.println(s);
        }

        
        System.out.println("Reverse:");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }

    // d. Enumerator 
    static void enumeratorMethod() {
        Vector<Student> v = new Vector<Student>();

        v.add(new Student(4, "Tom"));
        v.add(new Student(5, "Jerry"));

        Enumeration<Student> e = v.elements();

        while (e.hasMoreElements()) {
            Student s = e.nextElement();
            System.out.println(s);
        }
    }
}