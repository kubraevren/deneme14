package deneme1;

public class denemecalismasi {

	public static void main(String[] args) {
		// kal�n sesliler : a, �, o, u
		// ince sesliler : e , i, � , �

		char harf = 'u';
		boolean kalin = true;
		char[] kalinlar = { 'a', '�', 'o', 'u' };
		char[] inceler = { 'e', 'i', '�', '�' };

		for (char myList : kalinlar) {
			if (harf == myList) {
				kalin = true;
			}
		}
		for (char myList2 : inceler) {
			if (harf == myList2) {
				kalin = false;
			}
		}
		if (kalin)
			System.out.println("kal�n seslidir");
		else {
			System.out.println("ince seslidir.");
		}

	}
}