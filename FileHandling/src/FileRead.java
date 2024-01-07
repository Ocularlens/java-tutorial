import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRead {
	public static void main(String[] args) {
		Path path = Path.of("data", "data.txt");

		try {
			String s = Files.readString(path, StandardCharsets.US_ASCII);
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // UTF 8

	}
}
