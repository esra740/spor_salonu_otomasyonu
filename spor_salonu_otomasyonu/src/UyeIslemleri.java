
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UyeIslemleri {
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement=null;
    
     public ArrayList<Uye> uyeleriGetir(){
         ArrayList<Uye> cikti=new ArrayList<Uye>();
        try {
            statement = con.createStatement();
            String sorgu="Select * From uyeler";
            ResultSet rs=statement.executeQuery(sorgu);
            
            while(rs.next()){
                int sıra= rs.getInt("sıra");
                String ad=rs.getString("ad");
                String soyad=rs.getString("soyad");
                String boy=rs.getString("boy");
                String kilo=rs.getString("kilo");
                String yas=rs.getString("yas");
                String paket=rs.getString("paket");
                String fiyat=rs.getString("fiyat");
                cikti.add(new Uye(sıra, ad, soyad, boy, kilo, yas, paket, fiyat));
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
         
     }
      public void uyeSil(int sıra){
        
        String silme_sorgusu = "DELETE FROM uyeler where sıra = ?";
        
        try {
            preparedStatement = con.prepareStatement(silme_sorgusu);
            
            preparedStatement.setInt(1, sıra);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     
       public void uyeGuncelle(int sıra, String yeni_ad,String yeni_soyad,String yeni_boy,String yeni_kilo,String yeni_yas,String yeni_paket,String yeni_fiyat){
        
        String guncelleyen_sorgu = "UPDATE uyeler set ad = ?, soyad = ?, boy = ?,kilo = ?, yas = ?, paket = ?, fiyat = ? where sıra= ?";
        
        try {
            preparedStatement = con.prepareStatement(guncelleyen_sorgu);
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_soyad);
            preparedStatement.setString(3, yeni_boy);
            preparedStatement.setString(4, yeni_kilo);
            preparedStatement.setString(5, yeni_yas);
            preparedStatement.setString(6, yeni_paket);
            preparedStatement.setString(7, yeni_fiyat);
            
            preparedStatement.setInt(8, sıra);  
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     
     
     
     public void uyeEkle(String ad, String soyad, String boy, String kilo, String yas, String paket, String fiyat){
          String ekleme = "Insert INTO uyeler (ad,soyad,boy,kilo,yas,paket,fiyat) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(ekleme);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, boy);
            preparedStatement.setString(4, kilo);
            preparedStatement.setString(5, yas);
            preparedStatement.setString(6, paket);
            preparedStatement.setString(7, fiyat);
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         
         
     }
     
    public boolean girisYap(String kullanıcı_adi,String parola){
        
        String sorgu= "Select * from adminler where username =? and password=?";
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanıcı_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs=preparedStatement.executeQuery();
            
           if (rs.next()== false) {
                return false;
            }
            else return true;
         
          
            
        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    
    
    public UyeIslemleri(){
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useTimezone=true&serverTimezone=UTC";
         try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
    }
        
    }
   
    
}
