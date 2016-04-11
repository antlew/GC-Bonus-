package gc.java.bootcamp.lab9;

import java.text.*;

public class Circle {

	private double pi = Math.PI;
	private double r;
	private double c;
	private double a;
	private static int plus;

	public Circle(double radius) {
		r = radius;
		plus++;
	}

	public double getCircumference() {
		c = 2 * pi * r;
		return c;
	}

	public String getFormattedCircumference() {
		return formatNumber(c);
	}

	private String formatNumber(double x) {
		DecimalFormat myFormat = new DecimalFormat("#.##");
		String gave = myFormat.format(x);
		return gave;
	}

	public double getArea() {
		a = pi * (r * r);
		return a;

	}

	public String getFormattedArea() {
		return formatNumber(a);
	}

	public static int getObjectCount() {
		return plus;
	}

}
