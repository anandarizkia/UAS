/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Update {
    
    Koneksi konek = new Koneksi();
    
    public void Update (int nim, String nama, String prodi, String jenis, String noHp, String agama, String alamat, String status) {
        
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_Nama = "update datamahasiswa set Nama='"+ nama + "'where NIM ='" + nim + "'";
            String sql_Prodi = "update datamahasiswa set Prodi='"+ prodi + "'where NIM ='" + nim + "'";
            String sql_Jenis_Kelamin = "update datamahasiswa set Jenis_Kelamin='"+ jenis + "'where NIM ='" + nim + "'";
            String sql_Nomor_HP = "update datamahasiswa set Nomor_HP='"+ noHp + "'where NIM ='" + nim + "'";
            String sql_Agama = "update datamahasiswa set Agama='"+ agama+ "'where NIM ='" + nim + "'";
            String sql_Alamat = "update datamahasiswa set Alamat='"+ alamat + "'where NIM ='" + nim + "'";
            String sql_Status = "update datamahasiswa set Status='"+ status + "'where NIM ='" + nim + "'";
            

            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_Prodi);
            statement.executeUpdate(sql_Jenis_Kelamin);
            statement.executeUpdate(sql_Nomor_HP);
            statement.executeUpdate(sql_Agama);
            statement.executeUpdate(sql_Alamat);
            statement.executeUpdate(sql_Status);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
