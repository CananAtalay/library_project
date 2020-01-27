import java.io.*;

public interface Reader {

	public static void read() {
	
	File file = new File("C:\\Users\\Canan Atalay\\Desktop\\Library_Projekt\\library_project\\library_db.txt"); 


	try {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
}

}