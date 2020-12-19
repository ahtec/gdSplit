
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerard
 */
public class fileNameNoExtension  {
    
    static String stripExtension (String str) {
        // Handle null case specially.

        if (str == null) return null;

        // Get position of last '.'.

        int pos = str.lastIndexOf(".");

        // If there wasn't any '.' just return the string as is.

        if (pos == -1) return str;

        // Otherwise return the string, up to the dot.

        return str.substring(0, pos);
    }

    
}

//    public static void main(String[] args) {
//        System.out.println ("test.xml   -> " + stripExtension ("test.xml"));
//        System.out.println ("test.2.xml -> " + stripExtension ("test.2.xml"));
//        System.out.println ("test       -> " + stripExtension ("test"));
//        System.out.println ("test.      -> " + stripExtension ("test."));
//    }
//    
//    which outputs:
//
//test.xml   -> test
//test.2.xml -> test.2
//test       -> test
//test.      -> test
//}
    
    

