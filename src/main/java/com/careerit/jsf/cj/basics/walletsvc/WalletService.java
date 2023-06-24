package com.careerit.jsf.cj.basics.walletsvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WalletService {

  private List<Wallet> walletList;

  public WalletService() {
    walletList = new ArrayList<>();
  }

  public void createWallet(Wallet wallet) {
    if (getWalletByMobile(wallet.getMobile()).isPresent()) {
      System.out.println("Wallet with mobile number :" + wallet.getMobile() + " already exists");
      return;
    }
    walletList.add(wallet);
    System.out.println("Wallet created successfully with id :" + wallet.getId());
  }

  public List<Wallet> getWallets() {
    return walletList;
  }

  public Optional<Wallet> getWalletByMobile(String mobile) {
    if (walletList.size() != 0) {
      for (Wallet wallet : walletList) {
        if (wallet.getMobile().equals(mobile)) {
          return Optional.of(wallet);
        }
      }
    }
    return Optional.empty();
  }

  public void deleteWallet(String mobile) {
    Optional<Wallet> optionalWallet = getWalletByMobile(mobile);
    if (optionalWallet.isPresent()) {
      Wallet wallet = optionalWallet.get();
      if (wallet.getBalance() != 0) {
        System.out.println("Can't delete wallet, balance is not zero");
      } else {
        walletList.remove(wallet);
      }
    }else{
      System.out.println("Wallet with mobile number :"+mobile+" does not exists");
    }
  }

  public List<Wallet> search(String name){
      // TODO : Implement this method
    return null;
  }
  public double maxBalance(){
      // TODO : Implement this method
    return 0;
  }
  public double totalBalance(){
      // TODO : Implement this method
     return 0;
  }

  public void transferAmount(String fromMobile, String toMobile, double amount) {
    Optional<Wallet> optionalFromWallet = getWalletByMobile(fromMobile);
    Optional<Wallet> optionalToWallet = getWalletByMobile(toMobile);
    if (optionalFromWallet.isPresent() && optionalToWallet.isPresent()) {
      Wallet fromWallet = optionalFromWallet.get();
      Wallet toWallet = optionalToWallet.get();
      if (fromWallet.getBalance() >= amount) {
        fromWallet.setBalance(fromWallet.getBalance() - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);
        System.out.println(String
            .format("Amount %s is transferred from %s to %s", amount, fromMobile, toMobile));
      } else {
        System.out.println("Insufficient funds");
      }
    } else {
      System.out.println("From or To wallet not found");
    }
  }

  public void loadAmount(String mobile, double amount) {
    Optional<Wallet> optionalWallet = getWalletByMobile(mobile);
    if (optionalWallet.isPresent()) {
      Wallet wallet = optionalWallet.get();
      wallet.setBalance(wallet.getBalance() + amount);
      System.out.println(String
          .format("Wallet with mobile : %s is credited with  %s and balance is %s",
              mobile, amount,wallet.getBalance()));
    } else {
      System.out.println("Wallet not found");
    }
  }

}
