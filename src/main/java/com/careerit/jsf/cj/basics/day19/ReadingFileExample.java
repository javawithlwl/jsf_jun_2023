package com.careerit.jsf.cj.basics.day19;

import java.io.*;

public class ReadingFileExample {

  public static void main(String[] args)  {


         readDataFromFile();

  }
  private static void readDataFromFile() {
    File file=null;
    FileReader fr=null;
    BufferedReader br = null;
    try {
      file = new File(ReadingFileExample.class.getResource("/names.txt").getFile());
      fr = new FileReader(file);
      br = new BufferedReader(fr);
      String line = null;
      while ((line=br.readLine())!=null){
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("File not found " +e);
    }finally {
      try {
        if(br!=null){
          br.close();
        }
        if(fr!=null){
          fr.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
