/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rdy.model;

import java.util.List;

/**
 *
 * @author user
 */
public class Keluarga {

    private String marga;
    private List <Orang> anggota;

    public Keluarga() {
    }

    public Keluarga(String marga, List<Orang> anggota) {
        this.marga = marga;
        this.anggota = anggota;
    }

    /**
     * @return the marga
     */
    public String getMarga() {
        return marga;
    }

    /**
     * @param marga the marga to set
     */
    public void setMarga(String marga) {
        this.marga = marga;
    }

    /**
     * @return the anggota
     */
    public List <Orang> getAnggota() {
        return anggota;
    }

    /**
     * @param anggota the anggota to set
     */
    public void setAnggota(List <Orang> anggota) {
        this.anggota = anggota;
    }
    
    
    
}
