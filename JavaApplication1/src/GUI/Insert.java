/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author LENOVO
 */
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Insert {

    Koneksi konek = new Koneksi();
   

    public void insert(int nim, String nama, String prodi, String jenis, String noHp, String agama, String alamat, String status) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "insert into datamahasiswa values('" + nim + "','" + nama + "','" + prodi + "','" + jenis + "','" + noHp + "','" + agama + "','" + alamat + "','" + status + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }

}
