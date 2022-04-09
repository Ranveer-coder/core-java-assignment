package com.kaizen.CodingExercises.Inheritance;

public class Point {
    private int x;
    private int y;
 
    public Point() {
        this(0,0);
    }
 
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public int getX() {
        return x;
    }
 
    public void setX(int x) {
        this.x = x;
    }
 
    public int getY() {
        return y;
    }
 
    public void setY(int y) {
        this.y = y;
    }
 
    public double distance (){
        return distance(0,0);
    }
 
    public double distance (Point point){
        return distance(point.getX(), point.getY());
    }
 
    public double distance (int k, int f){
        return Math.sqrt(Math.pow((getX() - k), 2) + Math.pow((getY() - f), 2));
    }


	public static void main(String[] args) {

	Point first = new Point(6,5);
	Point second = new Point(3, 1);
	System.out.println("distance(0,0)= " + first.distance());
	System.out.println("distance(first)= " + first.distance(first));
	System.out.println("distance(second)= " + first.distance(second));
	System.out.println("distance between 2 and 2 = " + first.distance(2, 2));
	Point point = new Point();
	System.out.println("distance()= " + point.distance());
	
	}

}
