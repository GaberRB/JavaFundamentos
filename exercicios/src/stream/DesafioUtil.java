package stream;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioUtil {
	
	public final static Function<Integer, String> convertBinary = 
			n -> Integer.toBinaryString(n) ;
	
	public final static UnaryOperator<String> revertString =
			n -> new StringBuilder(n).reverse().toString();
			
	public final static Function<String, Integer> convertInteger = 
			n -> Integer.parseInt(n, 2);
			
}
