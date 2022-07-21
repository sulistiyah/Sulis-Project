package com.sulis.sulistiyah.RecyclerView.Model;

public class ModelLaptop {
    private  String namaLaptop, hargaLaptop, spesifikasiLaptop;
    private int imgLaptop;

    public ModelLaptop(String namaLaptop, String hargaLaptop, String spesifikasiLaptop, int imgLaptop) {
        this.namaLaptop = namaLaptop;
        this.hargaLaptop = hargaLaptop;
        this.spesifikasiLaptop = spesifikasiLaptop;
        this.imgLaptop = imgLaptop;
    }

    public String getNamaLaptop() {
        return namaLaptop;
    }

    public void setNamaLaptop(String namaLaptop) {
        this.namaLaptop = namaLaptop;
    }

    public String getHargaLaptop() {
        return hargaLaptop;
    }

    public void setHargaLaptop(String hargaLaptop) {
        this.hargaLaptop = hargaLaptop;
    }

    public String getSpesifikasiLaptop() {
        return spesifikasiLaptop;
    }

    public void setSpesifikasiLaptop(String spesifikasiLaptop) {
        this.spesifikasiLaptop = spesifikasiLaptop;
    }

    public int getImgLaptop() {
        return imgLaptop;
    }

    public void setImgLaptop(int imgLaptop) {
        this.imgLaptop = imgLaptop;
    }
}
