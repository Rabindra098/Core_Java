package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
	static class Product{
		private Integer pid;
		private List<String> listofProd;
		@Override
		public String toString() {
			return "Product [pid=" + pid + ", listofProd=" + listofProd + "]";
		}
		public Product(Integer pid, List<String> listofProd) {
			super();
			this.pid = pid;
			this.listofProd = listofProd;
		}
		public Integer getPid() {
			return pid;
		}
		public void setPid(Integer pid) {
			this.pid = pid;
		}
		public List<String> getListofProd() {
			return listofProd;
		}
		public void setListofProd(List<String> listofProd) {
			this.listofProd = listofProd;
		}
	}
	
	public static void main(String[] args) {
		List<Product> asList = Arrays.asList(
				new Product(1, Arrays.asList("Camera","Mobile","Laptop")),
				new Product(2, Arrays.asList("Bat","Ball","Wecket")),
				new Product(3, Arrays.asList("Chair","Table","Sofa")),
				new Product(4, Arrays.asList("Cycle","Bike","Car"))
				);
		List<String> collect = asList.stream().flatMap(str->str.getListofProd().stream()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
