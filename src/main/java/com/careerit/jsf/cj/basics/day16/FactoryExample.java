package com.careerit.jsf.cj.basics.day16;

class Printer{
     void print(String data){
     }
}
class Sony extends Printer{
    @Override
    void print(String data) {
        System.out.println("Sony printer is printing :"+data);
    }
}
class Hp extends Printer{
    @Override
    void print(String data) {
        System.out.println("Hp printer is printing :"+data);
    }
}
class Epson extends Printer{
    @Override
    void print(String data) {
        System.out.println("Epson printer is printing :"+data);
    }
}

enum PrinterType{
     SONY,HP,EPSON;
}

public class FactoryExample {

  public static void main(String[] args) {

      String message = "Hello World";
      Printer printer = getPrinter(PrinterType.SONY);
      printer.print(message);

  }

  private static Printer getPrinter(PrinterType type) {
      Printer printer = switch (type) {
        case SONY -> new Sony();
        case HP -> new Hp();
        case EPSON -> new Epson();
        default -> throw new IllegalArgumentException("Invalid printer type");
      };
    return printer;
  }


}
