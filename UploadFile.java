/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application;
import java.io.File;
import javax.swing.filechooser.*;

public class UploadFile extends FileFilter {
    
    private final String extension;
    private final String description;
    
    public UploadFile(String extension,String description)
    {
        this.extension=extension;
        this.description=description;
    }
    
    public boolean accept(File file)
    {
        if(file.isDirectory())
        {
            return true;
        }
        return file.getName().endsWith(extension);
    }
    
    public String getDescription()
    {
        return description + String.format(" (*%s)",extension);
    }
}
