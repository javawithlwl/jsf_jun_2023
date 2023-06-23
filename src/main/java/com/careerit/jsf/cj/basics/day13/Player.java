package com.careerit.jsf.cj.basics.day13;

public class Player {

  private String name;
  private String role;
  private String country;
  private double price;
  private String team;

  public Player(String name, String role, String country, double price, String team) {
    this.name = name;
    this.role = role;
    this.country = country;
    this.price = price;
    this.team = team;
  }

  public void showDetails() {
    System.out.println("Name     :" + name);
    System.out.println("Role     :" + role);
    System.out.println("Country  :" + country);
    System.out.println("Price    :" + price);
    System.out.println("Team     :" + team);
  }

  public String getName() {
    return name;
  }

  public String getRole() {
    return role;
  }

  public String getCountry() {
    return country;
  }

  public double getPrice() {
    return price;
  }

  public String getTeam() {
    return team;
  }
}
