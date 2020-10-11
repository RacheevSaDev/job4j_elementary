package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to04then5() {
        int expected = 5;
        int x1 = 3;
        int y1 = 0;
        int x2 = 0;
        int y2 = 4;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to01then1p4() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        int expected = 0;
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to211thenSqrt2() {
        double expected = Math.sqrt(2);
        int x1 = 1;
        int y1 = 1;
        int z1 = 1;
        int x2 = 2;
        int y2 = 1;
        int z2 = 2;
        Point point1 = new Point(x1, y1, z1);
        Point point2 = new Point(x2, y2, z2);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to211thenSqrt12() {
        double expected = Math.sqrt(12);
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;
        int x2 = 2;
        int y2 = 2;
        int z2 = 2;
        Point point1 = new Point(x1, y1, z1);
        Point point2 = new Point(x2, y2, z2);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}