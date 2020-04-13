package com.hsc.nashhorn;

import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.Bindings;

public class NashornSample {
	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		String name = "Puneet";
		Object result = null;
		try {
			nashorn.eval("print('" + name + "')");
			result = (Integer) nashorn.eval("10 + 2");
			// Simple evaluation of string
			result = nashorn.eval("var greeting='hello world';" + "print(greeting);" + "greeting");

			// We can perform the binding properties feature of JS
			nashorn.eval("var first = {" + "name: 'Whiskey'," + "age: 5" + "};" + "var second = {" + "volume: 100"
					+ "};" + "Object.bindProperties(first, second);" + "print(first.volume);" + "second.volume = 1000;"
					+ "print(first.volume);");

			// Using nashorn engine we can easily convert JSON to map directly
			// and can access its properties and values
			Object obj = nashorn
					.eval("Java.asJSONCompatible({ number: 28, greet: 'Hi Puneet', primes: [2,3,5,7,11,13] })");
			@SuppressWarnings("unchecked")
			Map<String, Object> map = (Map<String, Object>) obj;
			System.out.println("\n\n********Converting JSON to map**************");
			System.out.println(map.get("greet"));
			System.out.println(map.get("primes"));
			System.out.println(List.class.isAssignableFrom(map.get("primes").getClass()));
			
			// We can also pass the variables in the JS function using Binding results
			Bindings bindings = nashorn.createBindings();
			bindings.put("count", 2);
			bindings.put("name", "Puneet");
 
			String script = "var greeting='Hello ';" +
			"for(var i=count;i>0;i--) { " +
			"greeting+=name + ' '" +
			"}" +
			"greeting";
 
			Object bindingsResult = nashorn.eval(script, bindings);
			System.out.println("\n\n********Binding values from JAVA to JS");
			System.out.println(bindingsResult.toString());
		} catch (ScriptException e) {
			System.out.println("Error executing script: " + e.getMessage());
		}
		System.out.println("simple evaluation of eval function: " + result.toString());
	}
}
