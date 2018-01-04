/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rdy.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Orang {
 
    private String nama;
    private String pekerjaan;
    private Date ttl;
    private Alamat alamat;

    public Orang() {
    }

    public Orang(String nama, String pekerjaan, Date ttl, Alamat alamat) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.ttl = ttl;
        this.alamat = alamat;
    }

    public Orang(String nama, String pekerjaan, Date ttl) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.ttl = ttl;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    
    
    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the ttl
     */
    public Date getTtl() {
        return ttl;
    }

    /**
     * @param ttl the ttl to set
     */
    public void setTtl(Date ttl) {
        this.ttl = ttl;
    }

    /**
     * @return the alamat
     */
    public Alamat getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
    
    
    
}
