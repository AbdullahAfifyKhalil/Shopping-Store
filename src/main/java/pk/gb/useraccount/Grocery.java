package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Grocery extends AppCompatActivity {
    Button Add1, Add2, Add3, Add4;
    TextView name1,name2,name3,name4;
    Product p;
    //CustomerCartdb db;
    //String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        Add1 = (Button)findViewById(R.id.gadd1);
        Add2 = (Button)findViewById(R.id.gadd2);
        Add3 = (Button)findViewById(R.id.gadd3);
        Add4 = (Button)findViewById(R.id.gadd4);
        //more1 = (Button)findViewById(R.id.cview1);
        //more2 = (Button)findViewById(R.id.cview2);
        //more3 = (Button)findViewById(R.id.cview3);
        //more4 = (Button)findViewById(R.id.cview4);
        name1 = (TextView)findViewById(R.id.gtext1);
        name2 = (TextView)findViewById(R.id.gtext2);
        name3 = (TextView)findViewById(R.id.gtext3);
        name4 = (TextView)findViewById(R.id.gtext4);
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
        Add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name1.getText().toString());
                p.setCategory("Grocery");
                p.setProductPrice(18);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name2.getText().toString());
                p.setCategory("Grocery");
                p.setProductPrice(22);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name3.getText().toString());
                p.setCategory("Grocery");
                p.setProductPrice(8);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name4.getText().toString());
                p.setCategory("Grocery");
                p.setProductPrice(26);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
       // db.insert(p.getProductName(),p.getCategory(),p.getProductPrice());

    }
}