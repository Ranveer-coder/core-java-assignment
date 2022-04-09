package com.kaizen.CodingExercises.Inheritance;

public class Wall {

	private double width;
	private double height;
	
	public Wall() {
		
		System.out.println("No args Called!!!");
	}
	
	public Wall(double width, double height) {
		this.width = width;
		this.height = height;
		
		if(width < 0 ) {
			this.width = 0;
		}if(height < 0 ) {
			this.height = 0;
		}
	}
	
	public double getWidth() {
	 
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		if(width < 0 ) {
			width = 0;
		}else{
		    this.width = width;
		}
	}
	public void setHeight(double height) {
		if(height < 0 ) {
			height = 0;
		}else{
		    this.height = height;
		}
	}
	
	public double getArea() {
		return height*width;
		
	}
	

	
	public static void main(String[] args) {
		
		Wall area = new Wall(5,4);
		System.out.println("Wall area = " +area.getArea());
		
		Wall wall = new Wall();
		wall.setHeight(-1.5);
		System.out.println("Width = " +wall.getWidth());
		System.out.println("Height = " +wall.getHeight());
		System.out.println("Area = " + wall.getArea());
		
		wall.setHeight(1.5);
		System.out.println("Width = " +wall.getWidth());
		System.out.println("Height = " +wall.getHeight());
		System.out.println("Area = " + wall.getArea());
		
		wall.setWidth(-1.5);
		System.out.println("Width = " +wall.getWidth());
		System.out.println("Height = " +wall.getHeight());
		System.out.println("Area = " + wall.getArea());

		wall.setWidth(1.5);
		System.out.println("Width = " +wall.getWidth());
		System.out.println("Height = " +wall.getHeight());
		System.out.println("Area = " + wall.getArea());
		
	}
}
