package que1;

import java.util.List;

public interface operation {
	
	void insertData(List<EmpPojo> empPojos);
	
	void updateData(int id, String name);
	
	void deleteData(int id);
	
	void search(int id);
	
	void show();
}

































