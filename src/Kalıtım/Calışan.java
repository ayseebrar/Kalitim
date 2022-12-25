package Kalıtım;

public class Calışan {
protected String ad, soyad, email;
public Calışan(String ad,String soyad,String email){
	this.ad=ad;
	this.soyad=soyad;
	this.email=email;
}
public String getAd() {
	return ad;
}
public void setAd() {
	this.ad=ad;
}
public String getSoyad() {
	return soyad;
}
public void setSoyad() {
	this.soyad=soyad;
}
public String getEmail() {
	return email;
}
public void setEmail() {
	this.email=email;
}
public void giriş() {
	System.out.println("çalışan kapısından girdi");
}
public void cıkış() {
	System.out.println("çalışan kapısından çıktı");
}
public void yemek() {
	System.out.println("yemekhanede yedi");
}
}
