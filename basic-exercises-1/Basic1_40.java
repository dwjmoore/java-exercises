import java.nio.charset.Charset;

public class Basic1_40 {
	public void main() {
		System.out.println("List of available character sets: ");  
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);
		}
	}
}