package Parttern;

import javax.script.*;

public class Demo {
	public static void main(String[] args) throws ScriptException {
		ScriptEngine engine=new ScriptEngineManager().getEngineByName("nashorn");
//		engine.eval("print('Hello from Java script');");
		Bindings bindings = engine.createBindings();
		bindings.put("name", "Ravi");
		engine.eval("print('Hello, ' + name);", bindings);

	}

}
