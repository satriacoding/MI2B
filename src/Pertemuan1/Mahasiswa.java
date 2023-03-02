/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author E410MAO
 */
public class Mahasiswa {
   String nama, nobp, kelas, prodi, jurusan;
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nama ="Satria";
        mhs.nobp = "2101092069";
        mhs.kelas = "mi 2b";
        mhs.prodi = "manajemen informatika";
        mhs.jurusan = "Teknologi informasi";
        
        System.out.println("nama : "+mhs.nama+ "\n"
                +"no bp : "+mhs.nobp+"\n"
                    +"kelas : "+mhs.kelas+"\n"
                       +"prodi : "+mhs.prodi+"\n" 
                          +"jurusan : "+mhs.jurusan+"\n");
        
        System.out.println("");
         Mahasiswa mhs2 = new Mahasiswa();
        
        mhs2.nama = "Dhaniel";
        mhs2.nobp = "2101091043";
    }
}
