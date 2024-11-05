
package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentDetails {
	
	@Value("Lenin")
	private String name;
	
	@Value("45")
	private int id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void display() {
		
		System.out.println("Name : "+name);
		System.out.println("Id :"+id);
	}

}
