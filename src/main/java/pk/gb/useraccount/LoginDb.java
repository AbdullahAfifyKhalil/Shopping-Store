package pk.gb.useraccount;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LoginDb extends SQLiteOpenHelper {
    private final static String dbName = "signUp";
    private final static String dbTable = "customers";
    private final static String c1 = "Name";
    private final static String c2 = "Email";
    private final static String c3 = "Password";
    public LoginDb(Context c){
        super(c,dbName,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ dbTable + "(ID integer primary key autoincrement, "+c1+" text , "+c2+" text, "+c3+" text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists "+ dbTable);
        onCreate(db);
    }
    public boolean insert(String name, String mail, String pass){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(c1,name);
        cv.put(c2,mail);
        cv.put(c3,pass);
        if(db.insert(dbTable,null,cv)== -1){
            db.close();
            return false;
        }
        db.close();
        return true;
    }
    public Cursor retrieve(){
        SQLiteDatabase db = this.getReadableDatabase();
        String[] row = {"ID",c1,c2,c3};
        Cursor cur = db.query(dbTable,row,null, null, null, null, null);
        if (cur != null) {
            cur.moveToFirst();
        }
        db.close();
        return cur;
    }

}
