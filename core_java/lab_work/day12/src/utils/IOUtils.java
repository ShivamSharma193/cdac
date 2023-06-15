package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

import employee.Employee;

public interface IOUtils {
	public static void storeEmployeeDetails(Map<Integer, Employee> map, String filename) 
			throws IOException {
		/*
		 * Serialization 
		 * Java --> ObjectOutputStream --> FileOutputStream --> BinaryFile(filename)
		 */
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(map); // Give the map to store in the binary file
		}
		System.out.println("Employee details stored in "+filename);
	}

	public static Map<Integer, Employee> restoreEmployeeDetails(String filename)
			throws IOException, ClassNotFoundException {
		/*
		 * De-Serialization 
		 * Java <-- ObjectInputStream <-- FileInputStream <-- BinaryFile(filename)
		 */
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			System.out.println("Horray!! Employee Details restored .\n");
			return (Map<Integer, Employee>) in.readObject();

		}
	}
}
