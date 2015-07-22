package com.simpleCMS;

import java.io.File;
import java.io.IOException;

/**
 * Created by Lando on 7/21/2015.
 */
public class AddInfo implements AddFilesAndFolders {


    public boolean addFile(String fileName)
    {
        try {
            File file = new File(fileName);

            if (file.createNewFile())
            {
                return true;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean addFolder(String folderName)
    {

        File folder = new File(folderName);

        if (!folder.exists())
        {
            if (folder.mkdir()){
                return true;
            }
        }
       return false;
    }
}
