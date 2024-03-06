package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	
	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color cor, Double width, Double height) {
		super(cor);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public final double area() {
		return getHeight() * getWidth();
	}

}
