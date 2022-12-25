package Kalıtım;

public class Akademisyen extends Calışan{
protected String bolum;
protected String gorev;
protected String dersler;
protected Akademisyen(String ad,String soyad,String email,String bolum,String gorev, String dersler)
{
	super(ad,soyad,email);
	this.gorev=gorev;
	this.bolum=bolum;
	this.dersler=dersler;
}
public String getBolum() {
	return bolum;
}
public void setBolum() {
	this.bolum=bolum;
}
public String getGorev() {
	return gorev;
}
public void setGorev() {
	this.gorev=gorev;
}
public String getDersler() {
	return dersler;
}

public void setDersler() {
	this.dersler=dersler;
}
public void derseGir() {
	System.out.println("akademiasyen derse girer");
}
public void giriş() {
	System.out.println("akademisyen öğrenciden sonra girer ");
}
}
