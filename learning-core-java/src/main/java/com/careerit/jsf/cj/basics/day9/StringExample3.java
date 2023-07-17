package com.careerit.jsf.cj.basics.day9;

public class StringExample3 {

  public static void main(String[] args) {

      String data = "learning java is fun to have fun learn java";
      String txnData = "1005/Krish/3000/Blr,1006/Manoj/5000/Hyd,1003/Krish/3000/Blr-10/Manoj/5000/Hyd,1002/John/3000/Blr,1001/Charan/5000/Hyd";
      System.out.println(totalAmount(txnData,"Hyd"));
  }
  private static double totalAmount(String data,String city){
      String[] arr = data.split(",");
      double sum = 0;
      for(String ele:arr){
          String[] res = ele.split("/");
          String city1 = res[3];
          if(city1.equals(city)){
              sum += Double.parseDouble(res[2]);
          }
      }
      return sum;

  }
  private static int occurrenceOfWord(String data, String word) {
      String[] arr = data.split(" ");
      int count = 0;
      for(String ele:arr) {
          if(ele.equals(word)) {
              count++;
          }
      }
      return count;
  }
}
