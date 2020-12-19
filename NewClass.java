
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
//import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Gerard Doets
 */
public class NewClass {

    void doe(File erin) {
        try {
//            final BufferedImage source = ImageIO.read(new File("/Users/gerard/Pictures/ArtOfHendrik/openstal_173.jpg"));
            final BufferedImage source = ImageIO.read(erin);
            int idx = 1;
            int halveHoogte;
            halveHoogte = source.getHeight() / 2;
            float q = ((float) source.getHeight()) / source.getWidth();
            if (q > 1.2) {
//            if (source.getHeight() / source.getWidth() > 1.2) {  // check op being portait
//                fileNameNoExtension fne = new fileNameNoExtension();
                String pathName = erin.getCanonicalPath();
//            ImageIO.write(source.getSubimage(0, 0, source.getWidth(), halveHoogte), "JPG", new File(fileNameNoExtension.stripExtension(erin.getCanonicalPath()) + "P" + idx++ + getExtension(erin.getCanonicalPath())));
//            ImageIO.write(source.getSubimage(0, halveHoogte, source.getWidth(), halveHoogte), "JPG", new File(erin.getCanonicalPath() + idx++ + ".JPG"));
                ImageIO.write(source.getSubimage(0, 0, source.getWidth(), halveHoogte), "JPG", new File(erin.getCanonicalPath() + idx++ + ".JPG"));
                ImageIO.write(source.getSubimage(0, halveHoogte, source.getWidth(), halveHoogte), "JPG", new File(erin.getCanonicalPath() + idx++ + ".JPG"));
            }
        } catch (IOException e) {
        }
    }

    public static String getExtension(String fileName) {
        int index = fileName.lastIndexOf('.');
        if (index == -1) {
            return "";
        } else {
            return fileName.substring(1, index);
        }
    }
}
