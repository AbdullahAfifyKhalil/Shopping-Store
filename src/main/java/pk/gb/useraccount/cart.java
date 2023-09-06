package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class cart extends AppCompatActivity {
    ListView itemList;
    ArrayAdapter<String> arr;
    AlertDialog dialog;
    Product p;
    TextView tp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        p = new Product();
        itemList = (ListView)findViewById(R.id.lv);
        tp = (TextView)findViewById(R.id.totP);
        arr = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1);
        itemList.setAdapter(arr);
        for(int i =0; i<Product.cart.size();i++){
            arr.add(Product.cart.get(i).getProductName());
        }
        itemList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = ((TextView)view).getText().toString();
                for(int j = 0; j<Product.cart.size();j++){
                    if(Product.cart.get(j).getProductName().equals(s)){
                        sd(s,"category : "+Product.cart.get(j).getCategory()+"\nprice : "+Product.cart.get(j).getProductPrice());
                    }
                }
            }
        });
        p.calcTotPrice();
        tp.setText(String.valueOf(p.getTotPrice()));
    }
    public void sd(String title , String message)
    {
        dialog = new AlertDialog.Builder(this).setTitle(title).setMessage(message).setPositiveButton("OK", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialog.cancel();
            }
        }).show();
    }
    public void toCat(View view){
        Intent i = new Intent(cart.this,Categories.class);
        startActivity(i);
    }
}