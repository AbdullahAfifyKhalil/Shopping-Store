package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class Clothes extends AppCompatActivity {
    Button Addcb1, Addcb2,Addcb3,Addcb4,more1,more2,more3,more4;
    TextView name1,name2,name3,name4;
    Product p;
    //CustomerCartdb db;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);
        Addcb1 = (Button)findViewById(R.id.cadd1);
        Addcb2 = (Button)findViewById(R.id.cadd2);
        Addcb3 = (Button)findViewById(R.id.cadd3);
        Addcb4 = (Button)findViewById(R.id.cadd4);
        more1 = (Button)findViewById(R.id.cview1);
        more2 = (Button)findViewById(R.id.cview2);
        more3 = (Button)findViewById(R.id.cview3);
        more4 = (Button)findViewById(R.id.cview4);
        name1 = (TextView)findViewById(R.id.ctext1);
        name2 = (TextView)findViewById(R.id.ctext2);
        name3 = (TextView)findViewById(R.id.ctext3);
        name4 = (TextView)findViewById(R.id.ctext4);
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
                p.setCategory("Clothes");
                p.setProductPrice(1600);
                p.calcTotPrice();
                Product.cart.add(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name2.getText().toString());
                p.setCategory("Clothes");
                p.setProductPrice(450);
                p.calcTotPrice();
                Product.cart.add(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name3.getText().toString());
                p.setCategory("Clothes");
                p.setProductPrice(700);
                p.calcTotPrice();
                Product.cart.add(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name4.getText().toString());
                p.setCategory("Clothes");
                p.setProductPrice(125);
                p.calcTotPrice();
                Product.cart.add(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        //db.insert(p.getProductName(),p.getCategory(),p.getProductPrice());
    }
}