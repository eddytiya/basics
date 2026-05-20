package que1;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OperationImplementor implements operation {

    List<EmpPojo> db = new Vector<EmpPojo>();

    @Override
    public void insertData(List<EmpPojo> empPojos) {
        db.addAll(empPojos);
        System.out.println("Inserted successfully");
    }

    @Override
    public void updateData(int id, String name) {
        boolean found = false;

        Iterator<EmpPojo> iterator = db.iterator();
        while (iterator.hasNext()) {

            EmpPojo empPojo = iterator.next();

            if (empPojo.getId() == id) {
                empPojo.setName(name);
                System.out.println("Successfully updated");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Record not found");
        }
    }

    @Override
    public void deleteData(int id) {
        boolean found = false;

        Iterator<EmpPojo> iterator = db.iterator();

        while (iterator.hasNext()) {
            EmpPojo empPojo = iterator.next();

            if (empPojo.getId() == id) {
                iterator.remove();
                System.out.println("Removed successfully");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Record not found");
        }
    }

    @Override
    public void search(int id) {
        boolean found = false;

        Iterator<EmpPojo> iterator = db.iterator();
        while (iterator.hasNext()) {
            EmpPojo empPojo = iterator.next();

            if (empPojo.getId() == id) {
                System.out.println(empPojo);
                System.out.println("Found");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Record not found");
        }
    }

    @Override
    public void show() {
        Iterator<EmpPojo> iterator = db.iterator();

        while (iterator.hasNext()) {
            EmpPojo empPojo = iterator.next();
            System.out.println(empPojo);
        }
    }
}