import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaHttp {
	public static void main(String[] args) throws IOException {
		sendGet();
	}

	@SuppressWarnings("deprecation")
	public static void sendGet() throws IOException {
//		https://jsonplaceholder.typicode.com/users

		URL url = new URL("https://jsonplaceholder.typicode.com/users");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestProperty("accept", "application/json");

		processResponse(con);
	}

	public static void processResponse(HttpURLConnection con) throws IOException {
		int respCode = con.getResponseCode();

		if (respCode != HttpURLConnection.HTTP_OK) {
			System.out.println("Failed Request");
		}

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		System.out.println(response.toString());
	}
}
