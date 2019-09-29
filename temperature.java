import java.util.Scanner;
/**
 * 
 */
package temp;

/**
 * @author Keshav
 *
 */
public class temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float temperature ;
		
		System.out.println("Enter temperature in Faherenheit");
		temperature = in.nextInt();
		temperature =((temperature-32)*5)/9;
		System.out.println("Temperatue in Celcius=" + temperature);
		
		
		

	}

}
