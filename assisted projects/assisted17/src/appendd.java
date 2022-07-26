import java.io.FileWriter;
import java.io.IOException;
public class appendd {
	public static void main(String[] args)
	{
		String data = "This data is appended..";
		
		try {
			FileWriter output = new FileWriter("filename.txt", true);
			output.write(data);
			System.out.println("Data appended successfully.");
			output.close();
			
		}catch (IOException ex) {
			System.out.println("File append error..");
		}
	}
}
