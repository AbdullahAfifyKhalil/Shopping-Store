package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class terramycin extends AppCompatActivity {
Product p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terramycin);
        p = new Product();
    }
    public void add2(View view){
        p.setProductName(((TextView)findViewById(R.id.textViewXD)).getText().toString());
        p.setCategory("medicine");
        p.setProductPrice(11);
        p.calcTotPrice();
        p.addProduct(p);
        Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
    }
}