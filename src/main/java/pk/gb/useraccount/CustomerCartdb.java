package pk.gb.useraccount;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CustomerCartdb extends SQLiteOpenHelper {
    private final static String dbName = "cart";
    private static String dbTable = "cart";
    private final static String c1 = "pName";
    private final static String c2 = "pCategory";
    private final static String c3 = "pPrice";
    public CustomerCartdb(Context c,String mail){
        super(c,dbName,null,1);
        dbTable = dbTable.concat(mail);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+dbTable+"(ID integer primary key autoincrement,"+c1+" text,"+c2+"text,"+c3+"integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists " + dbTable);
        onCreate(db);
    }
    public boolean insert(String pname, String pCat, int pPr){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(c1,pname);
        cv.put(c2,pCat);
        cv.put(c3,pPr);
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
