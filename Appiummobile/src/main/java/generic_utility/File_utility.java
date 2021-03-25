package generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * 
 * @author Praveen
 *
 */
public class File_utility implements Pathconstants {
public String file(String name) throws Throwable
{
	FileInputStream fisa = new FileInputStream(filepath);
	Properties pob = new Properties();
	pob.load(fisa);
	String naMe = pob.getProperty(name);
	return naMe;
		
}
}
