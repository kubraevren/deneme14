package deneme1;

public class denemecalismasi {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 10;
		boolean sonuc = true;
		for (int myList : sayilar) {
			if (myList == aranacak) {
				sonuc = true;
				break; // d�ng�y� yani aramay� bitirsin.
			} else {
				sonuc = false;
			}
		}
		if (sonuc == true) {
			System.out.println("aranan say� bulundu");
		}
			else {
			System.out.println("say� bulunamad�");
		}
	}
}