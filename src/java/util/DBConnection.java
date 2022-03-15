
package util;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author husam
 */
public class DBConnection {
    
    public Connection connect(){
        Connection c=null;//veritabanına bağlanması için connection tanımladık
        try{
            Class.forName("org.postgresql.Driver");//javadaki postgre dosyasındaki("org.postgresql.Driver") konumundaki dosyayı aldık veri yolu için
            
            c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/MSC_2","postgres","149847");//Veritabanı bağlantı yolunu tamamladık
            System.out.println("DATABASE Bağlantısı Başarılı");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("DATABASE Bağlantısı Başarrısız!!");
        }
        return c;
    }
    
    
}
