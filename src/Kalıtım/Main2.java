package Kalıtım;

public class Main2 {

	public static void main(String[] args) {
		Calışan c=new Calışan("ahmet","mehmet","meh@gmail.com");
		c.yemek();
		System.out.println(c.getAd()+" "+c.getSoyad()+" "+c.getEmail());
		c.giriş();
        c.cıkış();
        Akademisyen a=new Akademisyen("ali","veli","al@gmaiil.com");
        System.out.println(a.getAd()+""+a.getSoyad()+""+a.getEmail());
        a.derseGir();
        a.giriş();
	}

}
