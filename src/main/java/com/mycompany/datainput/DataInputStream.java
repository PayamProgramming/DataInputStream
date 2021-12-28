package com.mycompany.datainput;

import java.io.*;

public class DataInputStream {
    
    public static void main(String[] args) {
        
        try {
            InputStream input = new FileInputStream("D:\\faradars.txt");
            java.io.DataInputStream dis = new java.io.DataInputStream(input);
            int count = input.available();
            byte[] array = new byte[count];
            dis.read(array);
            
            // For Display
            for (byte bt : array) {
                char chr = (char) bt;
                System.out.print(chr);
            }
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
    }
    
}
