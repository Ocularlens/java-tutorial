import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class FileHandling {
	public static void main(String[] args) {
		Path path = Path.of("data", "data.txt");

		boolean exists = Files.exists(path);
		System.out.println(exists);

		try {
			FileTime lastModifiedTime = Files.getLastModifiedTime(path);
			System.out.println(lastModifiedTime);

			long mismatchIndex = Files.mismatch(path, Paths.get("data/data2.txt"));
			System.out.println(mismatchIndex);

			UserPrincipal owner = Files.getOwner(path);
			System.out.println(owner);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
//		temp file and directory will concatenate a
//		random generated number to the name
		
		// create temp files
		try {
//			will go to temp file default directory
			Path tempFile = Files.createTempFile("temp", ".txt");
			System.out.println(tempFile);

//			will go to path parent directory
			Path tempFile2 = Files.createTempFile(path.getParent(), "temp", ".txt");
			System.out.println(tempFile2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		create temp dir
		try {
//			will go to path parent directory
			Path tempDir = Files.createTempDirectory(path.getParent(), "generateMe");
			System.out.println(tempDir);
//			will go to temp file default directory
			Path tempDir2 = Files.createTempDirectory("generate-in-temp");
			System.out.println(tempDir2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		create files
		try {
			Path newFile = Files.createFile(path.getParent().resolve("programGenerated.txt"));
			System.out.println(newFile);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
