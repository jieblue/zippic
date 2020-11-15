import java.io.File;
import java.io.IOException;

public class ZipPicutre {
    public static void main(String[] args)throws Exception {
        File file = new File("F:\\i need\\jpg");//图片文件夹路径
        File [] files = file.listFiles();
        for (int i = 0; i < files.length; i++)
        {
            File file1 = files[i];
            FileSave.savefile(file1);
        }
    }
}
