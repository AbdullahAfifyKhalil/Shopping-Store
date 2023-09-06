package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Shoes extends AppCompatActivity {
    Button Addcb1, Addcb2,Addcb3,Addcb4,more1,more2,more3,more4;
    TextView name1,name2,name3,name4;
    Product p;
    //CustomerCartdb db;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);
        Addcb1 = (Button)findViewById(R.id.sadd1);
        Addcb2 = (Button)findViewById(R.id.sadd2);
        Addcb3 = (Button)findViewById(R.id.sadd3);
        Addcb4 = (Button)findViewById(R.id.sadd4);
        //more1 = (Button)findViewById(R.id.cview1);
        //more2 = (Button)findViewById(R.id.cview2);
        //more3 = (Button)findViewById(R.id.cview3);
        //more4 = (Button)findViewById(R.id.cview4);
        name1 = (TextView)findViewById(R.id.stext1);
        name2 = (TextView)findViewById(R.id.stext2);
        name3 = (TextView)findViewById(R.id.stext3);
        name4 = (TextView)findViewById(R.id.stext4);
        p = new Product();
        /*Intent intent = getIntent();
        s = intent.getStringExtra("obj");
        db = new CustomerCartdb(this,s);
        Cursor cr = db.retrieve();
        while(!cr.isAfterLast()){
            p.setProductName(cr.getString(1));
            p.setCategory(cr.getString(2));
            p.setProductPrice(Integer.parseInt(cr.getString(3)));
            p.addProduct(p);
            cr.moveToNext();
        }
        p.calcTotPrice();*/
        Addcb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name1.getText().toString());
                p.setCategory("shoes");
                p.setProductPrice(370);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name2.getText().toString());
                p.setCategory("shoes");
                p.setProductPrice(218);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name3.getText().toString());
                p.setCategory("shoes");
                p.setProductPrice(145);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name4.getText().toString());
                p.setCategory("shoes");
                p.setProductPrice(135);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        //db.insert(p.getProductName(),p.getCategory(),p.getProductPrice());

    }
}