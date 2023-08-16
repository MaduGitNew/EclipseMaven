package org.jsonSample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSample {
	public static void main(String[] args) throws IOException, ParseException {
		
		//1. get the file path of JSON file
		File f=new File(
		"C:\\Users\\HP\\eclipse-workspace\\NewFramework\\src\\test\\resources\\Sample.json");
	
		//2. pass the above file as parameter in FileReader class to get the file to read
		FileReader reader=new FileReader(f);
		
		//3. to read data from JSON file we have the class called JSONParser
		//which is presented in our downloaded simple JSON dependency
		JSONParser parser=new JSONParser();
		
		//4. by using parse() we can able to read the file
		Object parse = parser.parse(reader);
		
		//5. typecasting
		JSONObject o=(JSONObject) parse;
		
//		//6. to get data as object
//		o.get("Name");
		
		//7. to get data as string
		String string = o.get("Name").toString();
		
		System.out.println(string);

	}
}
