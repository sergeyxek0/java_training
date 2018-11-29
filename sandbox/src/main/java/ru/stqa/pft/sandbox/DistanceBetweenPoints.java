package ru.stqa.pft.sandbox;

public class DistanceBetweenPoints {

  public static void main(String[] args) {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(4, 4);
    System.out.println("Расстояние между точками A(" +p1.x+ ":" +p1.y+ ") и B("+p2.x+ ":" +p2.y+") = " + p1.distance(p2));
  }
}
