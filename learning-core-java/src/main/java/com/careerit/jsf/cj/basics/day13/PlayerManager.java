package com.careerit.jsf.cj.basics.day13;

import java.util.Scanner;

public class PlayerManager {

  public static void main(String[] args) {

    Scanner sc = new Scanner(PlayerManager.class.getResourceAsStream("/player.csv"));
    sc.nextLine();
    Player[] players = new Player[242];
    int i = 0;
    while (sc.hasNext()) {
      String line = sc.nextLine();
      String[] arr = line.split(",");
      String name = arr[0];
      String role = arr[1];
      double amount = Double.parseDouble(arr[2]);
      String country = arr[3];
      String team = arr[4];
      Player player = new Player(name, role, country, amount, team);
      players[i++] = player;
    }
    showPlayers(players);
    double maxAmount = getMaxAmount(players);
    System.out.println("Max Amount is : " + maxAmount);
    String teamName = "CSK";
    double totalAmount = getTotalAmount(players,teamName);
    System.out.println("Total amount spent by "+teamName+" is :"+totalAmount);

    sc.close();
  }

  private static long getPlayerCount(Player[] player, String teamName) {
    //TODO: Need to implement
    return 0;
  }
  private static long getPlayerCountOf(Player[] player, String country) {
    //TODO: Need to implement
    return 0;
  }
  private static long getPlayerCountOf(Player[] player,String team, String country) {
    //TODO: Need to implement
    return 0;
  }
  private static Player[] maxPaidPlayers(Player[] players){
      //TODO: Need to implement
    return null;
  }
  private static Player[] maxPaidPlayers(Player[] players,String teamName){
      //TODO: Need to implement
    return null;
  }
  private static double getTotalAmount(Player[] players, String teamName) {
      double totalAmount = 0;
      for(Player player:players){
          if(player.getTeam().equals(teamName)){
              totalAmount += player.getPrice();
          }
      }
      return totalAmount;
  }
  private static double getMinAmount(Player[] player){
    //TODO: Need to implement
    return 0;
  }

  private static double getMaxAmount(Player[] players) {
    double maxAmount = players[0].getPrice();
    for (Player player : players) {
      if (player.getPrice() > maxAmount) {
        maxAmount = player.getPrice();
      }
    }
    return maxAmount;
  }

  private static void showPlayers(Player[] players) {
    for (Player player : players) {
      player.showDetails();
      System.out.println("-".repeat(100));
    }
  }
}
