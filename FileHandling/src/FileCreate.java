import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Path.of("data");
		try {
//			Path file = Files.createTempFile(path, "myStr", ".txt");
//			Files.writeString(file, "ALdous TEST STRING");

			Path file2 = Files.createFile(path.resolve("generatedss.txt"));
			Files.writeString(file2, "Aldous Christian R. Javier - Java Programmer ää öö üü");
			
//			will replace existing
			Files.write(path.resolve("utf.txt"), "this is my string ää öö üü".getBytes(StandardCharsets.UTF_8),
			        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (FileAlreadyExistsException e) {
			System.out.println("File already generated");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
