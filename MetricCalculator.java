public class MetricCalculator {

	private static float FOOT_IN_CM = 30.48f;
	private static float INCH_IN_CM = 2.54f;
	

	/* boolean switch for cm to foot OR foot to cm */
	private float cmFoot(float input, boolean swap) {	
		return (swap) ? (FOOT_IN_CM * input) : (input / FOOT_IN_CM);
	}
	
	/* boolean switch for cm to inches OR inches to cm */
	private float cmInch(float input, boolean swap) {
		return (swap) ? (INCH_IN_CM * input) : (input / INCH_IN_CM);
	}

	
	public static void main(String args[]) {
	
		MetricCalculator calc = new MetricCalculator();

		System.out.println("heidu\n");

		System.out.println("Testing 300 cm to inches");
		System.out.println(calc.cmInch(300, false)+"\n");

		System.out.println("Testing 300 inches to cm");
		System.out.println(calc.cmInch(300, true)+"\n");

		System.out.println("Testing 300 cm to foot");
		System.out.println(calc.cmFoot(300, false)+"\n");
		
		System.out.println("Testing 300 foot to cm");
		System.out.println(calc.cmFoot(300, true)+"\n");
	}
}
