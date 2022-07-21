package com.sulis.sulistiyah.SQLite.Model.Dao;

import static com.sulis.sulistiyah.SQLite.Model.Mahasiswa.COLUMN_ALAMAT;
import static com.sulis.sulistiyah.SQLite.Model.Mahasiswa.COLUMN_NAMA;
import static com.sulis.sulistiyah.SQLite.Model.Mahasiswa.COLUMN_NO_BP;
import static com.sulis.sulistiyah.SQLite.Model.Mahasiswa.COLUMN_NO_TLP;
import static com.sulis.sulistiyah.SQLite.Model.Mahasiswa.TABLE_NAME;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.sulis.sulistiyah.SQLite.Model.Mahasiswa;
import com.sulis.sulistiyah.SQLite.Util.DbHelp;

public class MahasiswaDao {
    private DbHelp dbHelp;
    SQLiteDatabase db;

    public MahasiswaDao(Context c){
        dbHelp=new DbHelp(c);
    }
    public void save(Mahasiswa data){
        SQLiteDatabase db=dbHelp.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NO_BP,data.getNo_bp());
        values.put(COLUMN_NAMA,data.getNama());
        values.put(COLUMN_NO_TLP,data.getNo_tlp());
        values.put(COLUMN_ALAMAT,data.getAlamat());
        db.insert(TABLE_NAME,null,values);
        db.close();
    }

}
