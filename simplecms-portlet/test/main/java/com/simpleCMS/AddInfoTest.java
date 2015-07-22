package com.simpleCMS;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Lando on 7/21/2015.
 */
public class AddInfoTest {

    @Mock
    private AddInfo fileToAdd;
    private AddInfo folderToAdd;

    @Before
    public void setup ()
    {
        MockitoAnnotations.initMocks(this);

    }

    @Test

    public void testAddingFiles()
    {
        when(fileToAdd.addFile("c:\\file.txt")).thenCallRealMethod();
        assertTrue(fileToAdd.addFile("c:\\file.txt"));
    }

    @Test

    public void testAddingFolders()
    {
        when(fileToAdd.addFolder("c:\\newTestFolder")).thenCallRealMethod();
        assertTrue(fileToAdd.addFolder("\"c:\\newTestFolder"));

    }


}
