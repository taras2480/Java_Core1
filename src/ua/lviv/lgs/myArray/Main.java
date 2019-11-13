package ua.lviv.lgs.myArray;

public class Main {

	public static void main(String[] args) {

		MyArrayInterface<String> arrayList = new MyArray<>();
		arrayList.add("cat");
		arrayList.add("dog");
		arrayList.add("cow");
		arrayList.add("horse");

		System.out.println(arrayList.toString());

		arrayList.add("Pig");
		System.out.println(arrayList.toString());

		arrayList.removable(4);
		System.out.println(arrayList.toString());

	}

}
