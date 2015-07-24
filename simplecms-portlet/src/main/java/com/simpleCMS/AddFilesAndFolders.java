package com.simpleCMS;

/**
 * An interface for adding files and folders.
 * Repository implementations must implement this interface.
 * Created by Lando on 7/21/2015.
 */
public interface AddFilesAndFolders {

	/**
	 * addFile
	 * It adds a file based on the given filename with path included.
	 * @param fileName The path where the file is going to live.
	 * @return indicate whether or not the operation was successful.
	 */
	// C:\xyz\123\ABC.PDF
	// true
	// parameters: input stream, byte[], java.io.File, ....
	// 				com.simplecms.model.File parentFolder
	// 
	public File addFile(String fileName);

	public boolean addFolder(String folderName);
}
