package com.Surge.FactoryMethodPatterns.ExamplePattern1;

class ExamplePattern1 {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape  shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		//throws null pointer exception
//		Shape shape4 = shapeFactory.getShape("RHOMBUS");
//		shape4.draw();
//		
//		Shape shape5 = shapeFactory.getShape(null);
//		shape5.draw();
	}

}
