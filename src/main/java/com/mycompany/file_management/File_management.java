/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.file_management;

import java.io.File;

/**
 *
 * @author caleb
 */
public class File_management {

    public static void main(String[] args) {
        
        File file = new File("C:/hola.txt");
        
        if(!file.exists()){
            System.out.println("Nombre del archivo "+ file.getName());
            System.out.println("Ruta "+ file.getAbsolutePath());
            System.out.println("Se puede escribir? "+ file.canWrite());
            System.out.println("Se puede leer?"+ file.canRead());
            System.out.println("Tamaño "+ file.length());
        }
    
    }
}
