package q6;

class Hobbs {
    String H1;
    String H2;

    public Hobbs(String h1, String h2) {
        H1 = h1;
        H2 = h2;
    }

    public String toString() {
        return "Hobbs [H1=" + H1 + ", H2=" + H2 + "]";
    }
}

class Add {
    String cityname;
    String areaname;

    public Add(String cityname, String areaname) {
        this.cityname = cityname;
        this.areaname = areaname;
    }

    public String toString() {
        return "Add [cityname=" + cityname + ", areaname=" + areaname + "]";
    }
}

class Employee {

    int id;
    String name;

    // 🔹 Aggregation
    Hobbs hobbs;

    // 🔹 Composition
    Add add;

    public Employee(int id, String name, Hobbs hobbs) {
        this.id = id;
        this.name = name;

        // Aggregation
        this.hobbs = hobbs;

        // Composition
        this.add = new Add("Mumbai", "Goregaon");
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name +
                ", hobbs=" + hobbs + ", add=" + add + "]";
    }
}

public class Both {
    public static void main(String[] args) {

        // Aggregation object
        Hobbs hobbs = new Hobbs("music", "football");

        Employee emp = new Employee(123, "Aditya", hobbs);

        System.out.println(emp);
    }
}