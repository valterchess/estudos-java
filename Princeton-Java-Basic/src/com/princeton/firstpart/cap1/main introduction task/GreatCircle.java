public class GreatCircle {
	public static void main(String []args){
		double x1 = Math.toRadians(Double.parseDouble(args[0]));
		double y1 = Math.toRadians(Double.parseDouble(args[1]));
		double x2 = Math.toRadians(Double.parseDouble(args[2]));
		double y2 = Math.toRadians(Double.parseDouble(args[3]));
		
		double r = 6371.0;
		double senX = Math.pow(Math.sin((x2 - x1) /2),2);

		double cosen = Math.cos(x1) * Math.cos(x2);

		double senY = Math.pow(Math.sin((y2 - y1)/ 2),2);

		double squareRoot = Math.sqrt(senX + cosen * senY);

		double distance = 2.0 * r * Math.asin(squareRoot);

		System.out.println(distance + " kilometers");
	}
}

