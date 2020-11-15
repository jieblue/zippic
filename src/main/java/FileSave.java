
import net.coobird.thumbnailator.Thumbnails;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileSave {
    public static void savefile(File file) throws Exception
    {
        String name=file.getName();

        String sname=name.substring(0,name.lastIndexOf("."));

        String zname=sname+".jpg";
        String savepath="F:\\i need\\zippic"+"\\"+zname;//压缩路径
        try {
            // 先尝试压缩并保存图片
            Thumbnails.of(file.getAbsoluteFile())
                    .size(600,400)
                    .outputQuality(0.1f)
                    .outputFormat("jpg")
                    .toFile(savepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
