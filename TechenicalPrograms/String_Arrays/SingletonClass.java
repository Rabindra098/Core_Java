package String_Arrays;

public class SingletonClass {
	private static SingletonClass singleton_instance=null;
	public String str;
	public SingletonClass() {
		str="Hello I am Singleton";
	}
	public static SingletonClass getInstance() {
		if(singleton_instance==null) 
			singleton_instance=new SingletonClass();
		return singleton_instance;
	}
	public static void main(String[] args) {
		SingletonClass x = SingletonClass.getInstance();
		SingletonClass y = SingletonClass.getInstance();
		SingletonClass z = SingletonClass.getInstance();
		
		System.out.println(x.str.toLowerCase()+"<-->"+x.str.hashCode());
		System.out.println(y.str+"<-->"+y.str.hashCode());
		System.out.println(z.str.toUpperCase()+"<-->"+z.str.hashCode());
	}
}
