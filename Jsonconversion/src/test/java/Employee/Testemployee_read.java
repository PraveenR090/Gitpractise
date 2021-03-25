package Employee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Testemployee_read {
public static void main(String[] args) throws Throwable, Throwable, Throwable {
	ObjectMapper obj = new ObjectMapper();
	        Employee_details el = obj.readValue(new File("./Employee.jason"), Employee_details.class);
	    System.out.println(el.getEmp_id());
	    System.out.println(el.getEmp_name());
	    System.out.println(el.maritalstatus);
	    int[] ar = el.getMobile();
	    System.out.println(ar[0]+","+ar[1]);
}
}
