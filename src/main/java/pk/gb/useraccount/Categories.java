package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Categories extends AppCompatActivity {
   // String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        //Intent intent = getIntent();
        //str = intent.getStringExtra("Key");
        //Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
    }
    public void clothesOC(View view) {
        Intent i = new Intent(Categories.this, Clothes.class);
        //i.putExtra("obj",str);
        startActivity(i);
    }
    public void groceryOC(View view){
        Intent i = new Intent(Categories.this, Grocery.class);
        //i.putExtra("obj",str);
        startActivity(i);
    }
    public void electronicsOC(View view){
        Intent i = new Intent(Categories.this, Electronics.class);
        //i.putExtra("obj",str);
        startActivity(i);
    }
    public void medicineOC(View view){
        Intent i = new Intent(Categories.this, Medicine.class);
        //i.putExtra("obj",str);
        startActivity(i);
    }
    public void makeUpOC(View view){
        Intent i = new Intent(Categories.this, Makeup.class);
        //i.putExtra("obj",str);
        startActivity(i);
    }
    public void shoesOC(View view){
        Intent i = new Intent(Categories.this, Shoes.class);
        //i.putExtra("obj",str);
        startActivity(i);
    }
    public void SignIn(View view) {
        Intent sign = new Intent(Categories.this,MainActivity.class);
        startActivity(sign);
    }
    public void toCart(View view) {
        Intent i = new Intent(Categories.this,cart.class);
        startActivity(i);
    }

}