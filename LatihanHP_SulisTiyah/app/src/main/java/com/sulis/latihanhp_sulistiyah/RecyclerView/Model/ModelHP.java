package com.sulis.latihanhp_sulistiyah.RecyclerView.Model;

public class ModelHP {
    private String namaHP, hargaHP, spesifikasiHP, tahunHp;
    private int imgHP;

    public ModelHP(String namaHP, String hargaHP, String spesifikasiHP, String tahunHp, int imgHP) {
        this.namaHP = namaHP;
        this.hargaHP = hargaHP;
        this.spesifikasiHP = spesifikasiHP;
        this.tahunHp = tahunHp;
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

    public String getTahunHp() {
        return tahunHp;
    }

    public void setTahunHp(String tahunHp) {
        this.tahunHp = tahunHp;
    }

    public int getImgHP() {
        return imgHP;
    }

    public void setImgHP(int imgHP) {
        this.imgHP = imgHP;
    }
}
