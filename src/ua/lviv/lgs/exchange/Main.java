package ua.lviv.lgs.exchange;

public class Main {

	public static void main(String[] args) {

		String text = new String(
				"Прості слова, які однаково читаються як зліва направо, так і справа наліво,— очевидні: "
						+ "око, дід, піп, наган, Пилип, радар, ротатор. Важче придумувати речення, "
						+ "які даватимуть однаковий зміст при прямому та зворотному читанні, як-от: «Я несу гусеня» чи «Де помити мопед?»");

		text = text.replaceAll("а", "-");
		text = text.replaceAll("о", "-");
		text = text.replaceAll("е", "-");
		text = text.replaceAll("і", "-");
		text = text.replaceAll("ю", "-");
		text = text.replaceAll("я", "-");
		text = text.replaceAll("ї", "-");
		text = text.replaceAll("у", "-");
		text = text.replaceAll("и", "-");
		System.out.println(text);

	}

}
