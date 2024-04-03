import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		String path = "." + File.separator + "test02.txt";
		File file = new File(path);

		if (!file.exists()) {

			file.createNewFile();
		}

		System.out.println("file:" + File.separator);
		System.out.println("path:" + File.pathSeparator);
		//패키지의 구분자로 . 을 사용
		
		java.lang.System.out.print("");;
		
		mong.Math a;
	}

}
