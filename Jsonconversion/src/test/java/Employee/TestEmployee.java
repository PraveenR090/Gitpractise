package Employee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class TestEmployee {
public static void main(String[] args) throws Throwable
{
	
	int arr[] = {98878,878778};
	Employee_details emp = new Employee_details("hfhf", 1212, false, arr);
	ObjectMapper mu = new ObjectMapper();
	mu.writeValue(new File("./Employee.jason"), emp);
}
}
