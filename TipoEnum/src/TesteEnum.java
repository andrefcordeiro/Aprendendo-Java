import java.util.EnumSet;

public class TesteEnum {
	
	public static void main(String[] args) {
	
		
		for(TrafficLight tf : EnumSet.range(TrafficLight.RED, TrafficLight.YELLOW)) {
			System.out.println(tf.getDuracaoLuz() + " " + tf.getNome());
		}
	}
}
 