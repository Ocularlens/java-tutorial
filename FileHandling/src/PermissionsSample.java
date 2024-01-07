import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

public class PermissionsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Path.of("data", "data.txt");		
		try {
			Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path);
			System.out.println(permissions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("FOR LINUX AND MAC ONLY");
		}
	}

}
