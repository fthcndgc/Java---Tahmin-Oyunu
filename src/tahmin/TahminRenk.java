package tahmin;
import java.util.*;
public class TahminRenk {
	public static void main(String[] args) {
		System.out.println("Renk Tahmin Oyununa Ho� Geldiniz ...");
        System.out.println("-------------------------------------");
        String[] renkler = {"Sar�","Mavi","Ye�il","Siyah","Beyaz","K�rm�z�","G�m��","Gri","Bordo","Mor","Turkuvaz","Haki","Menek�e","Pembe"};
        String[] k�talar = {"Afrika","Avrupa","Amerika","Avustralya","Asya","Antartika"};
        String[] �lkeler = {"Almanya","Avustralya","Avusturya","Azerbeycan","Banglade�","Bel�ika","Bosna-Hersek","Brezilya","Bulgaristan","Cezayir","�ek Cumhuriyeti","Danimarka","Ermenistan","Fransa","�ngiltere","Japonya","Rusya","Suriye","T�rkiye","T�rkmenistan","Yeni Zelanda"};
        Scanner veri1 = new Scanner(System.in);
        System.out.println("Ka� kez oynamak istiyorsunuz : ");
        int KacKez = veri1.nextInt();
        int sayac = 0,yanl��=0,do�ru=0;
        System.out.println("--------------------------------------");
        Secenekler();
        System.out.println("--------------------------------------");
        int secim = SeceneklerSecim();
        System.out.println("--------------------------------------");
        if (secim == 1){
        	Renkler();
        	System.out.println("--------------------------------------");
        	while(sayac<KacKez){
        		Random pc = new Random();
        		int Pc = pc.nextInt(renkler.length);
        		String PcTahmin = renkler[Pc];
        		if (PcTahmin.equals("Sar�")){
        			System.out.println("Ye�il ile turuncu aras�nda bir renk");
        			sayac+=1;
        			String tahmin = Tahmin();
        			if (tahmin.equals("Sar�")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap sari .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Mavi")){
        			System.out.println("Ye�il ile menek�e rengi aras�nda bir renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Mavi")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap mavi .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Ye�il")){
        			System.out.println("Sar� ile mavinin kar��mas�ndan ortaya ��kan, bitki yapraklar�n�n �o�unda g�r�len renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Ye�il")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else{
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap ye�il .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Siyah")){
        			System.out.println("Ak, beyaz kar��t� renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Siyah")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap siyah .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Beyaz")){
        			System.out.println("Kara, siyah kar��t� renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Beyaz")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap beyaz .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("K�rm�z�")){
        			System.out.println("Al, k�z�l renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("K�rm�z�")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap k�rm�z� .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("G�m��")){
        			System.out.println("G�m�� parlakl���nda, g�m��� and�ran renk, g�m��i");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("G�m��")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap g�m�� .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Gri")){
        			System.out.println("K�l rengi, boz renk, demir rengi, demir�");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Gri")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap gri .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Bordo")){
        			System.out.println("Mora �alan k�rm�z� renk, �arap tortusu rengi");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Bordo")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap bordo .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Mor")){
        			System.out.println("K�rm�z� ile mavinin kar��mas�ndan olu�an renk, menek�e renginin k�rm�z�ya �alan�");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Mor")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap mor .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Haki")){
        			System.out.println("Ye�ile �alan toprak rengi");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Haki")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap haki .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Menek�e")){
        			System.out.println("Menek�e �i�e�inin mor rengi");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Menek�e")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap menek�e .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Pembe")){
        			System.out.println("Beyaza biraz k�rm�z� kar��t�r�lmas�yla olu�an a��k renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Pembe")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap pembe .");
        				System.out.println("--------------------------------------");
        			}
        		}
        	}
        }
        if (secim==2){
        	K�talar();
        	System.out.println("------------------------------------------------");
        	while(sayac<KacKez){
        		Random pc = new Random();
        		int Pc = pc.nextInt(k�talar.length);
        		String PcTahmin = k�talar[Pc];
        		if (PcTahmin.equals("Avrupa")){
        			System.out.println("Afrika'n�n kuzeyinde, Asya'n�n bat�s�nda ve Atlas Okyanusu'nun do�usunda bulunan, yar�mada �eklindeki k�ta.");
        			sayac+=1;
        			String tahmin = Tahmin();
        			if (tahmin.equals("Avrupa")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Avrupa .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Asya")){
        			System.out.println("Avrupa'n�n do�usunda, B�y�k Okyanus'un bat�s�nda, Okyanusya'n�n kuzeyinde ve Arktik Okyanus'un g�neyinde bulunan k�ta. ");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Asya")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Asya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Antartika")){
        			System.out.println("Afrika ve Okyanusya'n�n g�neyinde olan ve i�inde �lke bulunmayan tek k�ta");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Antartika")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else{
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Antartika .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Amerika")){
        			System.out.println("Bat� Yar�mk�re'de, Yeni D�nya olarak adland�r�lan b�lge");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Amerika")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Amerika .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Avustralya")){
        			System.out.println("Kom�ular� Endonezya, Do�u Timor, Papua Yeni Gine, Solomon Adalar�, Vanuatu, Yeni Kaledonya ve Yeni Zelanda'd�r.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Avustralya")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Avustralya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Afrika")){
        			System.out.println("Y�z�l��m� ve n�fus yo�unlu�u a��s�ndan d�nyan�n en b�y�k ikinci k�tas�.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Afrika")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Afrika .");
        				System.out.println("--------------------------------------");
        			}
        		}
        	}
        }
        if (secim == 3){
        	�lkeler();
        	System.out.println("--------------------------------------");
        	while(sayac<KacKez){
        		Random pc = new Random();
        		int Pc = pc.nextInt(�lkeler.length);
        		String PcTahmin = �lkeler[Pc];
        		if (PcTahmin.equals("Almanya")){
        			System.out.println("357.021 km�'lik bir alan� kaplar ve �l�man iklim ku�a��n�n i�inde yer al�r. 81,5 milyonun �zerindeki n�fusu ile Avrupa Birli�i'nin en b�y�k n�fusa sahip �lkesi konumundad�r.Amerika Birle�ik Devletleri'nden sonra, d�nyan�n en �ok g�� alan ikinci �lkesidir.");
        			sayac+=1;
        			String tahmin = Tahmin();
        			if (tahmin.equals("Almanya")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Almanya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Avustralya")){
        			System.out.println("G�ney yar�m k�rede yer alan bir ada �lkesidir. Hint Okyanusu ve B�y�k Okyanus aras�nda uzan�r. Okyanusya k�tas�nda bulunur ve k�tan�n �ok b�y�k bir b�l�m�n� kaplar.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Avustralya")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Avustralya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Avusturya")){
        			System.out.println("Orta Avrupa'da denize k�y�s� olmayan, dokuz eyaletten olu�an �lke. Bat�da Lihten�tayn ve �svi�re, g�neyde �talya ve Slovenya, do�uda Macaristan ve Slovakya, kuzeyde ise Almanya ve �ek Cumhuriyeti ile kom�udur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Avusturya")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else{
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Avusturya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Azerbeycan")){
        			System.out.println("Bat� Asya ile Do�u Avrupa'n�n kesi�im noktas� olan Kafkasya'da yer alan �lkedir.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Azerbeycan")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Azerbeycan .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Banglade�")){
        			System.out.println("Kara, siyah kar��t� renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Banglade�")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Banglade� .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Bel�ika")){
        			System.out.println("G�ney Asya'da bir �lkedir. Myanmar ile Hindistan s�n�r kom�usudur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Bel�ika")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Bel�ika .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Bosna-Hersek")){
        			System.out.println("Balkanlar'da 51.197 km�'lik y�z �l��m� ve yakla��k 4.500.000 n�fusa sahip �lkedir.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Bosna-Hersek")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Bosna-Hersek .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Brezilya")){
        			System.out.println("G�ney Amerika'da yer alan, k�tan�n en b�y�k ve en kalabal�k �lkesidir. Uzun bir Atlas Okyanusu k�y�s� vard�r. ");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Brezilya")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Brezilya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Bulgaristan")){
        			System.out.println("Balkanlar'da yer alan �lke. Bat�da S�rbistan ve Makedonya, do�uda Karadeniz, kuzeyde Romanya, g�neyde Yunanistan g�neydo�uda T�rkiye ile �evrilidir. 110 bin 994 kilometrekarelik y�z�l��m�yle Avrupa'n�n en b�y�k 16. �lkesidir.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Bulgaristan")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Bulgaristan .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Cezayir")){
        			System.out.println("Kuzey Afrika'da �lke, Afrika'n�n y�z�l��m� olarak en b�y�k �lkesi.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Cezayir")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Cezayir .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("�ek Cumhuriyeti")){
        			System.out.println("Orta Avrupa'da bir �lkedir. Kuzeyinde Polonya, bat� ve kuzeybat�s�nda Almanya, g�neyinde Avusturya ve do�usunda Slovakya ile kom�udur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("�ek Cumhuriyeti")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap �ek Cumhuriyeti .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Danimarka")){
        			System.out.println("Kuzey Avrupa'da �skandinavya'da ba�kenti Kopenhag olan �lke.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Danimarka")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Danimarka .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Ermenistan")){
        			System.out.println("G�ney Kafkasya'da denize k�y�s� olmayan bir �lkedir.Ba�kenti ve en b�y�k �ehri Erivan'd�r.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Ermenistan")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Ermenistan .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Fransa")){
        			System.out.println("Anakara topraklar� Bat� Avrupa'da bulunan ve d�nyan�n pek �ok b�lgesinde deniza��r� topraklar� olan bir �lkedir.Ba�kenti Paris.");
        			sayac+=1;
        			String tahmin = Tahmin();
        			if (tahmin.equals("Fransa")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Fransa .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("�ngiltere")){
        			System.out.println(" Birle�ik Krall�k'� meydana getiren d�rt �lkeden en b�y�k ve merkez� olan�. Avrupa'n�n bat�s�nda, B�y�k Britanya adas�nda bulunur.Ba�kenti Londra.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("�ngiltere")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap �ngiltere .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Japonya")){
        			System.out.println("Do�u Asya'da bir ada �lkesidir. B�y�k Okyanus'ta bulunur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Japonya")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else{
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Japonya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Rusya")){
        			System.out.println("Kuzey Avrasya'da bir �lkedir.Y�netim �ekli federal yar� ba�kanl�k tipi cumhuriyettir.Ba�kent Moskova.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Rusya")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Rusya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Suriye")){
        			System.out.println("Ortado�u'da L�bnan, �srail, �rd�n, Irak ve T�rkiye ile kom�u bir �lkedir.");
        			System.out.println("Akdeniz'e k�y�s� vard�r. Ba�kenti ve en b�y�k �ehri �am'd�r.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Suriye")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Suriye .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("T�rkiye")){
        			System.out.println("Topraklar�n�n b�y�k b�l�m� Anadolu'ya");
        			System.out.println("k���k bir b�l�m� ise Balkanlar'�n uzant�s� olan Trakya'ya yay�lm�� bir �lke.Ba�kent Ankara.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("T�rkiye")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap T�rkiye .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("T�rkmenistan")){
        			System.out.println("1991'de Sovyetler Birli�i'nin da��l���ndan sonra ba��ms�zl���n� kazanan Orta Asya T�rk cumhuriyeti.Ba�kent A�kabat.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("T�rkmenistan")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap T�rkmenistan .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Yeni Zelanda")){
        			System.out.println("G�ney B�y�k Okyanus'da bir ada �lkesidir. G�ney Yar�mk�rede, Okyanusya'daki G�ney Pasifik adalar� aras�nda, Avustralya'n�n yakla��k 1.500 km g�ney do�usunda yer almaktad�r. Ba�l�ca iki b�y�k (North Island ve South Island) ve bir�ok k���k adadan olu�ur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Yeni Zelanda")){
        				System.out.println("Tebrikler do�ru tahmin .");
        				do�ru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanl�� cevap .");
        				yanl��+=1;
        				System.out.println("Dogru cevap Yeni Zelanda .");
        				System.out.println("--------------------------------------");
        			}
        		}
        	}
        }
        System.out.println("Do�ru sayiniz = " + do�ru + "\n"+
    		      "Yanl�� say�n�z = " + yanl�� + " t�r.");
        }
    public static void Renkler(){
        System.out.println("Sar�\n"+
                "Mavi\n"+
                "Ye�il\n"+
                "Siyah\n"+
                "Beyaz\n"+
                "K�rm�z�\n"+
                "G�m��\n"+
                "Gri\n"+
                "Bordo\n"+
                "Mor\n"+
                "Haki\n"+
                "Menek�e\n"+
                "Pembe");
    }
    public static void K�talar(){
    	System.out.println("Afrika\n"+
    			"Avrupa\n"+
    			"Amerika\n"+
    			"Avustralya\n"+
    			"Asya\n"+
    			"Antartika");
    }
    public static void �lkeler(){
    	System.out.println("Almanya\n"+
    			"Avustralya\n"+
    			"Avusturya\n"+
    			"Azerbeycan\n"+
    			"Banglade�\n"+
    			"Bel�ika\n"+
    			"Bosna-Hersek\n"+
    			"Brezilya\n"+
    			"Bulgaristan\n"+
    			"Cezayir\n"+
    			"�ek Cumhuriyeti\n"+
    			"Danimarka\n"+
    			"Ermenistan\n"+
    			"Fransa\n"+
    			"�ngiltere\n"+
    			"Japonya\n"+
    			"Rusya\n"+
    			"Suriye\n"+
    			"T�rkiye\n"+
    			"T�rkmenistan\n"+
    			"Yeni Zelanda");
    }
    public static String Tahmin(){
        Scanner veri = new Scanner(System.in);
        System.out.println("L�tfen tahmininizi giriniz : ");
        String tahmin = veri.next();
        return tahmin;
    }
    public static void Secenekler(){
    	System.out.println("1-Renkler\n"+
    			"2-K�talar\n"+
    			"3-�lkeler\n");
    }
    public static int SeceneklerSecim(){
    	Scanner veri = new Scanner(System.in);
    	int secenek;
    	System.out.println("Bir secenek giriniz : ");
    	return secenek = veri.nextInt();
    }

    
}



