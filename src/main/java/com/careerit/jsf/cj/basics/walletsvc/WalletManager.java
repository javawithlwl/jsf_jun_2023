package com.careerit.jsf.cj.basics.walletsvc;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class WalletManager {

  public static void main(String[] args) {

    WalletService walletService = new WalletService();

    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("1. Create Wallet 2.Show Wallet 3. Show all wallets 4. Delete wallet 5. Transfer amount 6. Load amount 7. Exit");
      System.out.println("Enter your choice :");
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          System.out.println("Enter name :");
          String name = sc.next();
          System.out.println("Enter the mobile number :");
          String mobile = sc.next();
          System.out.println("Enter amount :");
          double amount = sc.nextDouble();
          Wallet wallet = new Wallet(name, mobile, amount);
          walletService.createWallet(wallet);
          break;
        case 2:
          System.out.println("Enter the mobile number :");
          String mobileNumber = sc.next();
          Optional<Wallet> optionWallet = walletService.getWalletByMobile(mobileNumber);
          if (optionWallet.isPresent()) {
            Wallet w = optionWallet.get();
            w.showDetails();
          } else {
            System.out.println("Wallet with mobile number :" + mobileNumber + " does not exists");
          }
          break;
        case 3:
          List<Wallet> list = walletService.getWallets();
          if(list.size() == 0){
            System.out.println("No wallets found");
          }else {
            for (Wallet w : list) {
              w.showDetails();
              System.out.println("---------------------------");
            }
          }
          break;
        case 4:
          System.out.println("Enter the mobile number :");
          String mobileNumber1 = sc.next();
          walletService.deleteWallet(mobileNumber1);
          break;
        case 5:
          System.out.println("Enter the from mobile number :");
          String fromMobile = sc.next();
          System.out.println("Enter the to mobile number :");
          String toMobile = sc.next();
          System.out.println("Enter the amount :");
          double amount1 = sc.nextDouble();
          walletService.transferAmount(fromMobile, toMobile, amount1);
          break;
        case 6:
          System.out.println("Enter the mobile number :");
          String mobileNumber2 = sc.next();
          System.out.println("Enter the amount :");
          double amount2 = sc.nextDouble();
          walletService.loadAmount(mobileNumber2, amount2);
          break;
        case 7:
          System.out.println("Thanks for using wallet service");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice");
      }
    }

  }
}
