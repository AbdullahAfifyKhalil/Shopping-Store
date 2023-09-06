package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Medicine extends AppCompatActivity {
    Button Addcb1, Addcb2,Addcb3,Addcb4;
    TextView name1,name2,name3,name4;
    Product p;
    //CustomerCartdb db;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);
        Addcb1 = (Button)findViewById(R.id.madd1);
        Addcb2 = (Button)findViewById(R.id.madd2);
        Addcb3 = (Button)findViewById(R.id.madd3);
        Addcb4 = (Button)findViewById(R.id.madd4);
        name1 = (TextView)findViewById(R.id.mtext1);
        name2 = (TextView)findViewById(R.id.mtext2);
        name3 = (TextView)findViewById(R.id.mtext3);
        name4 = (TextView)findViewById(R.id.mtext4);
        p = new Product();
       /* Intent intent = getIntent();
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
                p.setCategory("medicine");
                p.setProductPrice(32);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name2.getText().toString());
                p.setCategory("medicine");
                p.setProductPrice(28);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name3.getText().toString());
                p.setCategory("medicine");
                p.setProductPrice(11);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        Addcb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setProductName(name4.getText().toString());
                p.setCategory("medicine");
                p.setProductPrice(49);
                p.calcTotPrice();
                p.addProduct(p);
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        });
        //db.insert(p.getProductName(),p.getCategory(),p.getProductPrice());


    }
    public void more1(View view){
        Intent i = new Intent(Medicine.this,asp.class);
        startActivity(i);
    }
    public void more2(View view){
        Intent i = new Intent(Medicine.this,ketofan.class);
        startActivity(i);
    }
    public void more3(View view){
        Intent i = new Intent(Medicine.this,terramycin.class);
        startActivity(i);
    }
    public void more4(View view){
        Intent i = new Intent(Medicine.this,dexa.class);
        startActivity(i);
    }

}