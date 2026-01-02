package Java8;

import java.util.Optional;

public class OptionalDemo1 {
	public static void main(String[] args) {
		String str = null;
		Optional<String> ofNullable = Optional.ofNullable(str);
		String orElse = ofNullable.orElse("No Value is Contains");
		System.out.println(orElse);
		if (ofNullable.isPresent()) {
			System.out.println("Value by get :" + ofNullable.get());
		} else {
			System.err.println("No value is available in the container");
		}

	}
}
