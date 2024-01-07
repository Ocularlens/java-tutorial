import java.nio.file.Path;

public class FileAbsoluteRelativeCanonical {

	public static void main(String[] args) {
		Path path = Path.of("data");
		System.out.println(path.isAbsolute());
		path.normalize();
		System.out.println(path.isAbsolute());
	}

}
