package ie.rccourse;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesTest {

	public static void main(String[] args) {

		//Locale locale = Locale.US;
		//Locale locale = new Locale("en", "GB");
		
		Locale locale = new Locale("ga", "IE");
		
		ResourceBundle bundle = ResourceBundle.getBundle("resources.messages", locale);
		
		String header = bundle.getString("heading");
		String greeting = bundle.getString("greeting");
		
		String username = "Annette";
		int recordCount = 99;
		
		greeting = String.format(greeting, username);
		
		String result2 = MessageFormat.format("There were {0} records returned by {1}", recordCount, username);
		
		String s = String.format("Pi to 3 decimal places is %.3f", Math.PI);
		
		System.out.println(s);
				
		String result = bundle.getString("result");
				
		result = String.format(result, recordCount, username);
		
		String depart = bundle.getString("depart");
		String prompt = bundle.getString("prompt");
		String newstring = bundle.getString("newstring");
		
		System.out.println(header);
		System.out.println(greeting);
		System.out.println(prompt);
		System.out.println(depart);
		System.out.println(newstring);
		System.out.println(result);
		System.out.println(result2);
		
		/*InputStream is = PropertiesTest.class.getResourceAsStream("messages.properties");
		
		try {
			properties.load(is);
			String heading = (String) properties.get("heading");
			String greeting = (String) properties.get("greeting");
			String depart = (String) properties.get("depart");
			
			System.out.println(heading);
			System.out.println(greeting);
			System.out.println(depart);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		

	}

}
