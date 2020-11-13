/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : subclass Bilangan
 */
public class JumlahBilangan extends Bilangan{
    public void tampilHasilJumlah() {
        int jumlah = getX() + getY();
        System.out.println("Hasil perjumlahan = " + jumlah);
    }
}
