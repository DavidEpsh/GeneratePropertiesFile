import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import config.ServerProperties;


public class MainClass {
	
	private static final String FILE_NAME = "Properties.xml";

	public static void main(String[] args) {
		ServerProperties properties = new ServerProperties(8000, 50);
		
		XMLEncoder encoder = null;
		try {
			encoder = new XMLEncoder(new FileOutputStream(FILE_NAME));
			encoder.writeObject(properties);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			encoder.close();
		}		
	}
}
