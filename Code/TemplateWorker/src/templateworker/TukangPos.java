/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateworker;

/**
 *
 * @author User
 */
public class TukangPos extends Pekerja{
    public TukangPos(){
        super.jenis = "tukang pos";
    }

    public void bekerja(){
        System.out.println("Mengantarkan surat");
    }
}
