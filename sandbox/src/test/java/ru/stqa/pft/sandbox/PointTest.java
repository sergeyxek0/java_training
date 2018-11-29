package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistance1(){
    Point p1 = new Point(1, 2);
    Point p2 = new Point(1, 5);
    Assert.assertEquals(p1.distance(p2), 3);
  }

  @Test
  public void testDistance2(){
    Point p1 = new Point(4, 55);
    Point p2 = new Point(2, 22);
    Assert.assertEquals(p1.distance(p2), 33.06055050963308);
  }

  @Test
  public void testDistance3(){
    Point p1 = new Point(1, 3);
    Point p2 = new Point(3, 5);
    Assert.assertNotEquals(p1.distance(p2), 0);
  }
}
