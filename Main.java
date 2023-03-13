import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Compass compass = new Compass(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))));
		compass.executeDirections();
	}
}