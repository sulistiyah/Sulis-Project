package com.sulis.sulistiyah.SQLite.Util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.sulis.sulistiyah.SQLite.Model.Mahasiswa;

public class DbHelp extends SQLiteOpenHelper {

    private  static final String DbName="akademik";
    private  static  final int DbVersion=1;

    private Context context;

    public DbHelp(Context context) {
        super(context, DbName, null, DbVersion);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Mahasiswa.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
