package ua.lviv.lgs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class wk = Worker.class;

		// get name of class
		String nameOfClass = wk.getName();
		System.out.println("Name of class : " + nameOfClass);

		System.out.println();

		// get name of class without way
		String simpleName = wk.getSimpleName();
		System.out.println("Simple Name of class : " + simpleName);
		System.out.println();

		// get Modifier
		int modifier = wk.getModifiers();
		String modifierText = Modifier.toString(modifier);
		System.out.println();
		System.out.println("Class modifier: " + modifierText + " int: " + modifier);
		System.out.println();
		System.out.println("is Static: " + Modifier.isStatic(modifier));
		System.out.println();
		System.out.println("is Public: " + Modifier.isPublic(modifier));
		System.out.println();
		System.out.println("is Abstract: " + Modifier.isAbstract(modifier));
		System.out.println();
		System.out.println("is Protected: " + Modifier.isProtected(modifier));
		System.out.println();
		System.out.println("is Native: " + Modifier.isNative(modifier));
		System.out.println();

		// Package info
		Package classPackage = wk.getPackage();
		System.out.println("Package of current: " + classPackage);

		System.out.println();

		// get superclasses
		Class superClass = wk.getSuperclass();
		System.out.println("superClass: " + superClass);

		System.out.println();

		// get implements interfaces
		Class[] interfaces = wk.getInterfaces();
		System.out.println("interfaces: " + Arrays.toString(interfaces));

		System.out.println();

		// get Constructors
		Constructor<Worker>[] workerConstructor = wk.getConstructors();
		for (int i = 0; i < workerConstructor.length; i++) {
			Constructor<Worker> constructor = workerConstructor[i];
			System.out.println("Constructors: " + constructor);
		}
		System.out.println();

		System.out.println("Constructors size: " + workerConstructor.length);

		System.out.println();

		// get param types of constructor
		Constructor<Worker> constructor = workerConstructor[1];
		Class<?>[] parameterTypes = constructor.getParameterTypes();
		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println(class1);

		}
		System.out.println();

		// get Constructor by Parametrs
		Constructor<Worker> singleConstructor = wk.getConstructor(int.class, int.class, String.class, String.class,
				String.class);
		System.out.println("singleConstructor: " + singleConstructor);

		System.out.println();

		// get Fields
		java.lang.reflect.Field[] fields = wk.getFields();
		for (int i = 0; i < fields.length; i++) {
			java.lang.reflect.Field field = fields[i];
			System.out.println(field);

		}

		System.out.println();

		fields = wk.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			java.lang.reflect.Field field = fields[i];
			System.out.println(field);

		}
		System.out.println();
		// get Methods
		Method[] methods = wk.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);

		}
		System.out.println();

		// create object
		Worker newInstance = singleConstructor.newInstance(2222, 5000, "Kornat", "Lubov", "Director");
		System.out.println(newInstance);

		System.out.println();

		// field set
		java.lang.reflect.Field firstName = wk.getField("firstName");
		firstName.set(newInstance, "Klara");
		System.out.println("Worker's first name:" + firstName.get(newInstance));

		System.out.println();

		java.lang.reflect.Field privateSalary = wk.getDeclaredField("salary");

		privateSalary.setAccessible(true);
		privateSalary.set(newInstance, 3000);
		System.out.println("Worker Salary is: " + privateSalary.get(newInstance));

		System.out.println();

		System.out.println(newInstance);

		// private method set

		System.out.println();

		Method declaredMethod1 = newInstance.getClass().getDeclaredMethod("myMethod", String.class, int.class);
		Method declaredMethod2 = newInstance.getClass().getDeclaredMethod("myMethod1", String.class);

		System.out.println("Private methods :" + declaredMethod1 + "" + declaredMethod2);
		
		System.out.println();

		declaredMethod1.setAccessible(true);
		declaredMethod1.invoke(newInstance, "it does not matter what write here", 57);
		
		System.out.println();

		declaredMethod2.setAccessible(true);
		declaredMethod2.invoke(newInstance, "it does not matter what write here");

	}

}
