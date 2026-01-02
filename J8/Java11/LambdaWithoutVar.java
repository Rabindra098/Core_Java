package Java11;

import java.util.Arrays;
import java.util.List;

//Local-Variable Syntax in Lambda Parameters (var)
public class LambdaWithoutVar {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");

		names.forEach((String name) -> {
			System.out.println(name.toUpperCase());
		});
	}
}

class LambdaWithVar {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");

		names.forEach((var name) -> {
			System.out.println(name.toUpperCase());
		});
	}
}

class LambdaVarAnnotation {
    public static void main(String[] args) {

        List<String> list = List.of("java", "spring", "boot");

        list.forEach((var item) -> {
            System.out.println(item);
        });
    }
}
