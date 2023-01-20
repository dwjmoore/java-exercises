import java.io.File;

public class Basic1_45 {
	public void main() {
		System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
		System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
	}
}