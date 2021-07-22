package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/**
		 * 1 . Número para string binária.... 6=> "110"
		 * 2. Reverter a String .... "110" => "011"
		 * 3. Converter de volta para inteeiro => "011" => 3
		 * 
		 * Integer.
		 */
		
		nums.stream()
			.map(DesafioUtil.convertBinary)
			.map(DesafioUtil.revertString)
			//.map(DesafioUtil.convertInteger)
			.forEach(print);

		
	}

}
