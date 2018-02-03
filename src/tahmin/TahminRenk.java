package tahmin;
import java.util.*;
public class TahminRenk {
	public static void main(String[] args) {
		System.out.println("Renk Tahmin Oyununa Hoþ Geldiniz ...");
        System.out.println("-------------------------------------");
        String[] renkler = {"Sarý","Mavi","Yeþil","Siyah","Beyaz","Kýrmýzý","Gümüþ","Gri","Bordo","Mor","Turkuvaz","Haki","Menekþe","Pembe"};
        String[] kýtalar = {"Afrika","Avrupa","Amerika","Avustralya","Asya","Antartika"};
        String[] ülkeler = {"Almanya","Avustralya","Avusturya","Azerbeycan","Bangladeþ","Belçika","Bosna-Hersek","Brezilya","Bulgaristan","Cezayir","Çek Cumhuriyeti","Danimarka","Ermenistan","Fransa","Ýngiltere","Japonya","Rusya","Suriye","Türkiye","Türkmenistan","Yeni Zelanda"};
        Scanner veri1 = new Scanner(System.in);
        System.out.println("Kaç kez oynamak istiyorsunuz : ");
        int KacKez = veri1.nextInt();
        int sayac = 0,yanlýþ=0,doðru=0;
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
        		if (PcTahmin.equals("Sarý")){
        			System.out.println("Yeþil ile turuncu arasýnda bir renk");
        			sayac+=1;
        			String tahmin = Tahmin();
        			if (tahmin.equals("Sarý")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap sari .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Mavi")){
        			System.out.println("Yeþil ile menekþe rengi arasýnda bir renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Mavi")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap mavi .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Yeþil")){
        			System.out.println("Sarý ile mavinin karýþmasýndan ortaya çýkan, bitki yapraklarýnýn çoðunda görülen renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Yeþil")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else{
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap yeþil .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Siyah")){
        			System.out.println("Ak, beyaz karþýtý renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Siyah")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap siyah .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Beyaz")){
        			System.out.println("Kara, siyah karþýtý renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Beyaz")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap beyaz .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Kýrmýzý")){
        			System.out.println("Al, kýzýl renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Kýrmýzý")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap kýrmýzý .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Gümüþ")){
        			System.out.println("Gümüþ parlaklýðýnda, gümüþü andýran renk, gümüþi");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Gümüþ")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap gümüþ .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Gri")){
        			System.out.println("Kül rengi, boz renk, demir rengi, demirî");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Gri")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap gri .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Bordo")){
        			System.out.println("Mora çalan kýrmýzý renk, þarap tortusu rengi");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Bordo")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap bordo .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Mor")){
        			System.out.println("Kýrmýzý ile mavinin karýþmasýndan oluþan renk, menekþe renginin kýrmýzýya çalaný");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Mor")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap mor .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Haki")){
        			System.out.println("Yeþile çalan toprak rengi");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Haki")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap haki .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Menekþe")){
        			System.out.println("Menekþe çiçeðinin mor rengi");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Menekþe")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap menekþe .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Pembe")){
        			System.out.println("Beyaza biraz kýrmýzý karýþtýrýlmasýyla oluþan açýk renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Pembe")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap pembe .");
        				System.out.println("--------------------------------------");
        			}
        		}
        	}
        }
        if (secim==2){
        	Kýtalar();
        	System.out.println("------------------------------------------------");
        	while(sayac<KacKez){
        		Random pc = new Random();
        		int Pc = pc.nextInt(kýtalar.length);
        		String PcTahmin = kýtalar[Pc];
        		if (PcTahmin.equals("Avrupa")){
        			System.out.println("Afrika'nýn kuzeyinde, Asya'nýn batýsýnda ve Atlas Okyanusu'nun doðusunda bulunan, yarýmada þeklindeki kýta.");
        			sayac+=1;
        			String tahmin = Tahmin();
        			if (tahmin.equals("Avrupa")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Avrupa .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Asya")){
        			System.out.println("Avrupa'nýn doðusunda, Büyük Okyanus'un batýsýnda, Okyanusya'nýn kuzeyinde ve Arktik Okyanus'un güneyinde bulunan kýta. ");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Asya")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Asya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Antartika")){
        			System.out.println("Afrika ve Okyanusya'nýn güneyinde olan ve içinde ülke bulunmayan tek kýta");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Antartika")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else{
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Antartika .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Amerika")){
        			System.out.println("Batý Yarýmküre'de, Yeni Dünya olarak adlandýrýlan bölge");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Amerika")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Amerika .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Avustralya")){
        			System.out.println("Komþularý Endonezya, Doðu Timor, Papua Yeni Gine, Solomon Adalarý, Vanuatu, Yeni Kaledonya ve Yeni Zelanda'dýr.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Avustralya")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Avustralya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Afrika")){
        			System.out.println("Yüzölçümü ve nüfus yoðunluðu açýsýndan dünyanýn en büyük ikinci kýtasý.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Afrika")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Afrika .");
        				System.out.println("--------------------------------------");
        			}
        		}
        	}
        }
        if (secim == 3){
        	Ülkeler();
        	System.out.println("--------------------------------------");
        	while(sayac<KacKez){
        		Random pc = new Random();
        		int Pc = pc.nextInt(ülkeler.length);
        		String PcTahmin = ülkeler[Pc];
        		if (PcTahmin.equals("Almanya")){
        			System.out.println("357.021 km²'lik bir alaný kaplar ve ýlýman iklim kuþaðýnýn içinde yer alýr. 81,5 milyonun üzerindeki nüfusu ile Avrupa Birliði'nin en büyük nüfusa sahip ülkesi konumundadýr.Amerika Birleþik Devletleri'nden sonra, dünyanýn en çok göç alan ikinci ülkesidir.");
        			sayac+=1;
        			String tahmin = Tahmin();
        			if (tahmin.equals("Almanya")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Almanya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Avustralya")){
        			System.out.println("Güney yarým kürede yer alan bir ada ülkesidir. Hint Okyanusu ve Büyük Okyanus arasýnda uzanýr. Okyanusya kýtasýnda bulunur ve kýtanýn çok büyük bir bölümünü kaplar.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Avustralya")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Avustralya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Avusturya")){
        			System.out.println("Orta Avrupa'da denize kýyýsý olmayan, dokuz eyaletten oluþan ülke. Batýda Lihtenþtayn ve Ýsviçre, güneyde Ýtalya ve Slovenya, doðuda Macaristan ve Slovakya, kuzeyde ise Almanya ve Çek Cumhuriyeti ile komþudur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Avusturya")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else{
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Avusturya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Azerbeycan")){
        			System.out.println("Batý Asya ile Doðu Avrupa'nýn kesiþim noktasý olan Kafkasya'da yer alan ülkedir.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Azerbeycan")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Azerbeycan .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Bangladeþ")){
        			System.out.println("Kara, siyah karþýtý renk");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Bangladeþ")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Bangladeþ .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Belçika")){
        			System.out.println("Güney Asya'da bir ülkedir. Myanmar ile Hindistan sýnýr komþusudur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Belçika")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Belçika .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Bosna-Hersek")){
        			System.out.println("Balkanlar'da 51.197 km²'lik yüz ölçümü ve yaklaþýk 4.500.000 nüfusa sahip ülkedir.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Bosna-Hersek")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Bosna-Hersek .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Brezilya")){
        			System.out.println("Güney Amerika'da yer alan, kýtanýn en büyük ve en kalabalýk ülkesidir. Uzun bir Atlas Okyanusu kýyýsý vardýr. ");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Brezilya")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Brezilya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Bulgaristan")){
        			System.out.println("Balkanlar'da yer alan ülke. Batýda Sýrbistan ve Makedonya, doðuda Karadeniz, kuzeyde Romanya, güneyde Yunanistan güneydoðuda Türkiye ile çevrilidir. 110 bin 994 kilometrekarelik yüzölçümüyle Avrupa'nýn en büyük 16. ülkesidir.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Bulgaristan")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Bulgaristan .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Cezayir")){
        			System.out.println("Kuzey Afrika'da ülke, Afrika'nýn yüzölçümü olarak en büyük ülkesi.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Cezayir")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Cezayir .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Çek Cumhuriyeti")){
        			System.out.println("Orta Avrupa'da bir ülkedir. Kuzeyinde Polonya, batý ve kuzeybatýsýnda Almanya, güneyinde Avusturya ve doðusunda Slovakya ile komþudur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Çek Cumhuriyeti")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Çek Cumhuriyeti .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Danimarka")){
        			System.out.println("Kuzey Avrupa'da Ýskandinavya'da baþkenti Kopenhag olan ülke.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Danimarka")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Danimarka .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Ermenistan")){
        			System.out.println("Güney Kafkasya'da denize kýyýsý olmayan bir ülkedir.Baþkenti ve en büyük þehri Erivan'dýr.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Ermenistan")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Ermenistan .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Fransa")){
        			System.out.println("Anakara topraklarý Batý Avrupa'da bulunan ve dünyanýn pek çok bölgesinde denizaþýrý topraklarý olan bir ülkedir.Baþkenti Paris.");
        			sayac+=1;
        			String tahmin = Tahmin();
        			if (tahmin.equals("Fransa")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Fransa .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Ýngiltere")){
        			System.out.println(" Birleþik Krallýk'ý meydana getiren dört ülkeden en büyük ve merkezî olaný. Avrupa'nýn batýsýnda, Büyük Britanya adasýnda bulunur.Baþkenti Londra.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Ýngiltere")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Ýngiltere .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Japonya")){
        			System.out.println("Doðu Asya'da bir ada ülkesidir. Büyük Okyanus'ta bulunur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Japonya")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else{
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Japonya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Rusya")){
        			System.out.println("Kuzey Avrasya'da bir ülkedir.Yönetim þekli federal yarý baþkanlýk tipi cumhuriyettir.Baþkent Moskova.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Rusya")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Rusya .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Suriye")){
        			System.out.println("Ortadoðu'da Lübnan, Ýsrail, Ürdün, Irak ve Türkiye ile komþu bir ülkedir.");
        			System.out.println("Akdeniz'e kýyýsý vardýr. Baþkenti ve en büyük þehri Þam'dýr.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Suriye")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Suriye .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Türkiye")){
        			System.out.println("Topraklarýnýn büyük bölümü Anadolu'ya");
        			System.out.println("küçük bir bölümü ise Balkanlar'ýn uzantýsý olan Trakya'ya yayýlmýþ bir ülke.Baþkent Ankara.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Türkiye")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Türkiye .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Türkmenistan")){
        			System.out.println("1991'de Sovyetler Birliði'nin daðýlýþýndan sonra baðýmsýzlýðýný kazanan Orta Asya Türk cumhuriyeti.Baþkent Aþkabat.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Türkmenistan")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Türkmenistan .");
        				System.out.println("--------------------------------------");
        			}
        		}
        		if (PcTahmin.equals("Yeni Zelanda")){
        			System.out.println("Güney Büyük Okyanus'da bir ada ülkesidir. Güney Yarýmkürede, Okyanusya'daki Güney Pasifik adalarý arasýnda, Avustralya'nýn yaklaþýk 1.500 km güney doðusunda yer almaktadýr. Baþlýca iki büyük (North Island ve South Island) ve birçok küçük adadan oluþur.");
        			String tahmin = Tahmin();
        			sayac+=1;
        			if (tahmin.equals("Yeni Zelanda")){
        				System.out.println("Tebrikler doðru tahmin .");
        				doðru+=1;
        				System.out.println("--------------------------------------");
        			}else {
        				System.out.println("Yanlýþ cevap .");
        				yanlýþ+=1;
        				System.out.println("Dogru cevap Yeni Zelanda .");
        				System.out.println("--------------------------------------");
        			}
        		}
        	}
        }
        System.out.println("Doðru sayiniz = " + doðru + "\n"+
    		      "Yanlýþ sayýnýz = " + yanlýþ + " týr.");
        }
    public static void Renkler(){
        System.out.println("Sarý\n"+
                "Mavi\n"+
                "Yeþil\n"+
                "Siyah\n"+
                "Beyaz\n"+
                "Kýrmýzý\n"+
                "Gümüþ\n"+
                "Gri\n"+
                "Bordo\n"+
                "Mor\n"+
                "Haki\n"+
                "Menekþe\n"+
                "Pembe");
    }
    public static void Kýtalar(){
    	System.out.println("Afrika\n"+
    			"Avrupa\n"+
    			"Amerika\n"+
    			"Avustralya\n"+
    			"Asya\n"+
    			"Antartika");
    }
    public static void Ülkeler(){
    	System.out.println("Almanya\n"+
    			"Avustralya\n"+
    			"Avusturya\n"+
    			"Azerbeycan\n"+
    			"Bangladeþ\n"+
    			"Belçika\n"+
    			"Bosna-Hersek\n"+
    			"Brezilya\n"+
    			"Bulgaristan\n"+
    			"Cezayir\n"+
    			"Çek Cumhuriyeti\n"+
    			"Danimarka\n"+
    			"Ermenistan\n"+
    			"Fransa\n"+
    			"Ýngiltere\n"+
    			"Japonya\n"+
    			"Rusya\n"+
    			"Suriye\n"+
    			"Türkiye\n"+
    			"Türkmenistan\n"+
    			"Yeni Zelanda");
    }
    public static String Tahmin(){
        Scanner veri = new Scanner(System.in);
        System.out.println("Lütfen tahmininizi giriniz : ");
        String tahmin = veri.next();
        return tahmin;
    }
    public static void Secenekler(){
    	System.out.println("1-Renkler\n"+
    			"2-Kýtalar\n"+
    			"3-Ülkeler\n");
    }
    public static int SeceneklerSecim(){
    	Scanner veri = new Scanner(System.in);
    	int secenek;
    	System.out.println("Bir secenek giriniz : ");
    	return secenek = veri.nextInt();
    }

    
}



