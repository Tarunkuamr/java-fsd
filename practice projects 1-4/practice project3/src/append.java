import java.io.FileWriter;
import java.io.IOException;

public class append {
	public static void main(String[] args) {
		String data = "This data is appended..";

		try {
			FileWriter output = new FileWriter("filename.app1", true);
			output.write(data);
			System.out.println("Data appended successfully.");
			output.close();

		} catch (IOException ex) {
			System.out.println("File append error..");
		}
	}

}
