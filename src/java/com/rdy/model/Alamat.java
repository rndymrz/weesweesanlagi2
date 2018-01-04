/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rdy.model;

/**
 *
 * @author user
 */
public class Alamat {
    
    private String jalan;
    private String kota;

    public Alamat() {
    }

    public Alamat(String jalan, String kota) {
        this.jalan = jalan;
        this.kota = kota;
    }
    
    

    /**
     * @return the jalan
     */
    public String getJalan() {
        return jalan;
    }

    /**
     * @param jalan the jalan to set
     */
    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }
    
    
}
