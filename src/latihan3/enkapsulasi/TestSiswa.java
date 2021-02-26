/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.enkapsulasi;

/**
 *
 * @author MOKLET-2
 */
public class TestSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek dari class EncapSiswa
        EncapSiswa siswa = new EncapSiswa();
        
        //memberi nilai kepada method void
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        //menampilkan nilai dari method 
        System.out.println("Name = "+siswa.getName()
        + " Absen = "+siswa.getAbsen()+ " Address = "+siswa.getAddress());
    }
    
}
