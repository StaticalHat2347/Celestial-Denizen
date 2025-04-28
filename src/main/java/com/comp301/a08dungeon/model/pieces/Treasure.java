package com.comp301.a08dungeon.model.pieces;

public class Treasure extends APiece {

  private final int treasure_value = 100;

  public Treasure() {
    super("Compoments", "src/main/resources/ship_components.png");
  }

  public int getValue() {
    return treasure_value;
  }
}
