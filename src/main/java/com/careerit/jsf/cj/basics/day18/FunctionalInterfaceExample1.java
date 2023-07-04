package com.careerit.jsf.cj.basics.day18;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

enum PaymentType {
  CREDIT_CARD, DEBIT_CARD, UPI, NET_BANKING
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Payment {
  private String name;
  private double amount;
  private PaymentType type;
}

class PaymentService {
  private List<Payment> paymentList;

  public PaymentService(List<Payment> paymentList) {
    this.paymentList = paymentList;
  }

  public List<Payment> filter(Predicate<Payment> predicate) {
    List<Payment> payments = new ArrayList<>();
    for (Payment payment : paymentList) {
      if (predicate.test(payment)) {
        payments.add(payment);
      }
    }
    return payments;
  }

}

public class FunctionalInterfaceExample1 {
  public static void main(String[] args) {
    // create 10 payment objects add to list and pass to payment service
    Payment payment1 = new Payment("Krish", 1000, PaymentType.CREDIT_CARD);
    Payment payment2 = new Payment("Manoj", 2000, PaymentType.DEBIT_CARD);
    Payment payment3 = new Payment("Charan", 3000, PaymentType.UPI);
    Payment payment4 = new Payment("Manoj", 4000, PaymentType.NET_BANKING);
    Payment payment5 = new Payment("Krish", 5000, PaymentType.CREDIT_CARD);
    Payment payment6 = new Payment("Charan", 6000, PaymentType.DEBIT_CARD);
    Payment payment7 = new Payment("Balu", 7000, PaymentType.UPI);
    Payment payment8 = new Payment("Ramesh", 8000, PaymentType.NET_BANKING);
    Payment payment9 = new Payment("Manjunath", 9000, PaymentType.CREDIT_CARD);
    Payment payment10 = new Payment("Sunil", 10000, PaymentType.DEBIT_CARD);

    // add all the payments to list
    List<Payment> paymentList = List.of(payment1, payment2, payment3, payment4, payment5, payment6, payment7, payment8, payment9, payment10);
    PaymentService service = new PaymentService(paymentList);

    // get all the payments paid by given payment type
    // get all the payments paid by given name
    // get all the payments paid by given amount
    List<Payment> payments = service.filter((p) -> p.getType() == PaymentType.CREDIT_CARD);
    System.out.println(payments);
    List<Payment> paymentOfManoj = service.filter((p) -> p.getName().equals("Manoj"));
    System.out.println(paymentOfManoj);
    List<Payment> paymentOfAmount = service.filter((p) -> p.getAmount() == 10000);
    System.out.println(paymentOfAmount);

    BiFunction<Integer, Integer, Integer> operation = (a, b) -> a + b;
    int res = perform(operation, 10, 20);
    System.out.println(res);

  }

  private static int perform(BiFunction<Integer, Integer, Integer> operation, int a, int b) {
    return operation.apply(a, b);
  }


}
