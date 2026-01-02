package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserSession implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private String username;

	// transient data (won't be serialized)
	private transient String password;

	public UserSession(int userId, String username, String password) {
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	public void display() {
		System.out.println("UserId   : " + userId);
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}
}

class SerializeDemo {

	public static void main(String[] args) {

		try {
			UserSession user = new UserSession(101, "rabindra", "secret123");

			FileOutputStream fos = new FileOutputStream("session.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(user);

			oos.close();
			fos.close();

			System.out.println("Object Serialized Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class DeSerializeDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("session.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			UserSession user = (UserSession) ois.readObject();

			ois.close();
			fis.close();

			System.out.println("Object De-Serialized Successfully");
			user.display();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
