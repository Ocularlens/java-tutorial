import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class FileDeleteMoveList {

	public static void main(String[] args) {
		try {
			Path utfFile = Files.createTempFile("data", ".txt");
			Path path = Files.move(utfFile, Path.of("data").resolve(utfFile.getFileName().toString()));

			Files.delete(path);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Path dataPath = Path.of("data");
			Set<String> fileSet = new HashSet<String>();

			DirectoryStream<Path> stream = Files.newDirectoryStream(dataPath);
			for (Path path : stream) {
				if (!Files.isDirectory(path)) {
					fileSet.add(path.getFileName().toString());
				}
			}
			
			System.out.println(fileSet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}