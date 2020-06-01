
public class Uye {
    private int sıra;
    private String ad;
    private String soyad;
    private String boy;
    private String kilo;
    private String yas;
    private String paket;
    private String fiyat;

    public Uye(int sıra, String ad, String soyad, String boy, String kilo, String yas, String paket, String fiyat) {
        this.sıra = sıra;
        this.ad = ad;
        this.soyad = soyad;
        this.boy = boy;
        this.kilo = kilo;
        this.yas = yas;
        this.paket = paket;
        this.fiyat = fiyat;
    }

    public int getSıra() {
        return sıra;
    }

    public void setSıra(int sıra) {
        this.sıra = sıra;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBoy() {
        return boy;
    }

    public void setBoy(String boy) {
        this.boy = boy;
    }

    public String getKilo() {
        return kilo;
    }

    public void setKilo(String kilo) {
        this.kilo = kilo;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }
    
}
