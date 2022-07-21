package com.sulis.sulistiyah.SQLite.Model;

public class Mahasiswa {
    public static final String TABLE_NAME = "mahasiswa";
    public static final String COLUMN_ID = "id_mahasiswa";
    public static final String COLUMN_NO_BP = "no_bp";
    public static final String COLUMN_NAMA = "nama";
    public static final String COLUMN_NO_TLP = "no_telp";
    public static final String COLUMN_ALAMAT = "alamat";

    // Create table SQL Query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NO_BP + " TEXT,"
                    + COLUMN_NAMA + " TEXt,"
                    + COLUMN_NO_TLP + " TEXT,"
                    + COLUMN_ALAMAT + " TEXt"
                    + ")";

    private int id_mahasiswa;
    private String no_bp;
    private String nama;
    private String no_tlp;
    private String alamat;

    public int getId_mahasiswa() {
        return id_mahasiswa;
    }

    public void setId_mahasiswa(int id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

    public String getNo_bp() {
        return no_bp;
    }

    public void setNo_bp(String no_bp) {
        this.no_bp = no_bp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Mahasiswa() {

    }
}


