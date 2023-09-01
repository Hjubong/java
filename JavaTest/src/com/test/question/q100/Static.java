package com.test.question.q100;

public class Static {

}

class Pencil{
	private String hardness;

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}
	
	public String info() {
		return String.format("%s 진하기 연필", this.hardness);
	}
}

class Eraser{
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public String info() {
		return String.format("%s 사이즈 지우개", this.size);
	}
}

class BallPointPen{
	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String info() {
		return String.format("%s 색상 %.1fmm 볼펜", this.color, this.thickness);
	}
}

class Ruler{
	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String info() {
		return String.format("%dcm %s", this.length, this.shape); 
	}
	
}