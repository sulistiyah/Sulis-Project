package com.sulis.projectsulistiyah.RecyclerView.Model;

public class ModelHP {
    private String namaHP,hargaHP,spesifikasiHP,tahunHP;
    private int imgHP;

    public ModelHP(String namaHP, String hargaHP, String spesifikasiHP, String tahunHP, int imgHP) {
        this.namaHP = namaHP;
        this.hargaHP = hargaHP;
        this.spesifikasiHP = spesifikasiHP;
        this.tahunHP = tahunHP;
        this.imgHP = imgHP;
    }

    public String getNamaHP() {
        return namaHP;
    }

    public void setNamaHP(String namaHP) {
        this.namaHP = namaHP;
    }

    public String getHargaHP() {
        return hargaHP;
    }

    public void setHargaHP(String hargaHP) {
        this.hargaHP = hargaHP;
    }

    public String getSpesifikasiHP() {
        return spesifikasiHP;
    }

    public void setSpesifikasiHP(String spesifikasiHP) {
        this.spesifikasiHP = spesifikasiHP;
    }

    public String getTahunHP() {
        return tahunHP;
    }

    public void setTahunHP(String tahunHP) {
        this.tahunHP = tahunHP;
    }

    public int getImgHP() {
        return imgHP;
    }

    public void setImgHP(int imgHP) {
        this.imgHP = imgHP;
    }


}
