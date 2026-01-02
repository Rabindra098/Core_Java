package Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
//		add() → Add one product to cart.
//
//		addAll() → Merge Instagram & Facebook contacts.
//
//		retainAll() → Find common movies between two people.
//
//		removeAll() → Remove completed tasks from to-do list.
//
//		remove() → Remove one cancelled product from cart.
//
//		size() → Count items in cart.
//
//		clear() → Empty cart completely.
		
		//public boolean add(E element)
		List<String> cart = new ArrayList<>();
		cart.add("Laptop");
		cart.add("Mobile");
		System.out.println(cart); // [Laptop, Mobile]

		//public boolean addAll(Collection c)
		List<String> friendsFacebook = new ArrayList<>();
		friendsFacebook.add("Ramesh");
		friendsFacebook.add("Sita");

		List<String> friendsInstagram = new ArrayList<>();
		friendsInstagram.add("Rahul");
		friendsInstagram.add("Priya");

		// merge both
		friendsFacebook.addAll(friendsInstagram);
		System.out.println(friendsInstagram);
		System.out.println(friendsFacebook);
		// [Ramesh, Sita, Rahul, Priya]
		
		
		//public boolean retainAll(Collection c)
		List<String> myMovies = new ArrayList<>();
		myMovies.add("Inception");
		myMovies.add("Avatar");
		myMovies.add("Titanic");

		List<String> friendMovies = new ArrayList<>();
		friendMovies.add("Titanic");
		friendMovies.add("Avatar");
		friendMovies.add("Avengers");

		// Keep only common movies
		myMovies.retainAll(friendMovies);
		System.out.println(myMovies); 
		// [Avatar, Titanic]
		
		
//		public boolean removeAll(Collection c)
		List<String> todoList = new ArrayList<>();
		todoList.add("Study");
		todoList.add("Workout");
		todoList.add("Shopping");

		List<String> completed = new ArrayList<>();
		completed.add("Workout");
		completed.add("Shopping");

		todoList.removeAll(completed);
		System.out.println(todoList); 
		// [Study]
		
//		public boolean remove(Object element)
		List<String> cart1= new ArrayList<>();
		cart1.add("Laptop");
		cart1.add("Mobile");
		cart1.remove("Mobile");
		System.out.println(cart1); 
		// [Laptop]

//		public int size()
		List<String> cart2 = new ArrayList<>();
		cart2.add("Shoes");
		cart2.add("Watch");
		System.out.println("Items in cart: " + cart2.size()); 
		// Items in cart: 2

		

	}
}
