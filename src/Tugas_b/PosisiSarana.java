/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PosisiSarana implements InterfaceSarana{
    int CCTV;
    int KipasAngin;
    int KabelLCD;

    public int getCCTV() {
        return CCTV;
    }

    public void setCCTV(int CCTV) {
        this.CCTV = CCTV;
    }

    public int getKipasAngin() {
        return KipasAngin;
    }

    public void setKipasAngin(int KipasAngin) {
        this.KipasAngin = KipasAngin;
    }

    public int getKabelLCD() {
        return KabelLCD;
    }

    public void setKabelLCD(int KabelLCD) {
        this.KabelLCD = KabelLCD;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }
    int AC;
    int StopKontak;

    public int getStopKontak() {
        return StopKontak;
    }

    public void setStopKontak(int StopKontak) {
        this.StopKontak = StopKontak;
    }
    Scanner input;
    
    @Override
    public int CCTV(){
        input= new Scanner (System.in);
        System.out.println("Pilih Posisi CCTV:");
        System.out.println("1.Tengah 2.Depan atau Belakang");
        setCCTV(input.nextInt());
        if(getCCTV()>1){
            System.out.println("posisi CCTV Sesuai");
            
        }else{
             System.out.println("Posisi CCTV Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
      public int StopKontak(){
        input= new Scanner (System.in);
        System.out.println("Pilih Posisi StopKontak:");
        System.out.println("1.Belakang 2.DekatDosen");
        setStopKontak(input.nextInt());
        if(getStopKontak()>1){
            System.out.println("posisi StopKontak Sesuai");
            
        }else{
             System.out.println("Posisi StopKontak Tidak Sesuai");
        }
        return 0;
        
    }
      
    @Override
          public int KabelLCD(){
        input= new Scanner (System.in);
        System.out.println("Pilih Posisi Kabel LCD:");
        System.out.println("1.Jauh dari Dosen 2.Dekat Dosen");
        setKabelLCD(input.nextInt());
        if(getKabelLCD()>1){
            System.out.println("posisi Kabel LCD Sesuai");
            
        }else{
             System.out.println("Posisi Kabel LCD Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
            public int KipasAngin(){
        input= new Scanner (System.in);
        System.out.println("Pilih Posisi KipasAngin:");
        System.out.println("1.Bawah  2.Pelapon");
        setKipasAngin(input.nextInt());
        if(getKipasAngin()>1){
            System.out.println("posisi Kipas Angin Sesuai");
            
            
        }else{
             System.out.println("Posisi Kipas Angin Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
          public int AC(){
              input= new Scanner (System.in);
        System.out.println("Pilih Posisi AC:");
        System.out.println("1.Depan  2.Dibelakang/Di pinggir");
        setAC(input.nextInt());
        if(getAC()>1){
            System.out.println("posisi AC Sesuai");
            
            
        }else{
             System.out.println("Posisi AC Tidak Sesuai");
        }
        return 0;
              
          }
    
        void Save(){
        String namafile = "PosisiSarana.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("StopKontak "+getStopKontak());
                        os.writeObject("Kabel LCD "+getKabelLCD());
                        os.writeObject("Kipas Angin "+getKipasAngin());
                          os.writeObject("CCTV "+getCCTV());
                            os.writeObject("AC "+getAC());
			
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
    
}