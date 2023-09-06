package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LoginDb db;
    Button btn;
    Customer c, c1;
    int id;
    String n , m , p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new LoginDb(this);
        btn = findViewById(R.id.joinus);
        c = new Customer();
        Cursor cr = db.retrieve();
        while(!cr.isAfterLast()){
            id = Integer.parseInt(cr.getString(0));
            n = cr.getString(1);
            m = cr.getString(2);
            p = cr.getString(3);
            c1 = new Customer(n,m,p,id);
            Customer.Customers.add(c1);
            cr.moveToNext();
        }

    }

    public void gotoNext(View view) {
        Intent dsp = new Intent(MainActivity.this,LoginActivity.class);
        EditText name ,mail,password;
        name = (EditText)findViewById(R.id.name);
        mail = (EditText)findViewById(R.id.mail);
        password = (EditText)findViewById(R.id.pass);
        if(name.getText().toString().equals("")|| mail.getText().toString().equals("")||password.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "please fill all the text fields", Toast.LENGTH_LONG).show();
            return;
        }
        c = new Customer();
        c.setId(id);
        c.setName(name.getText().toString());
        c.setMail(mail.getText().toString());
        c.setPass(password.getText().toString());
        if(c.signUp(c)){
            if(db.insert(c.getName(),c.getMail(),c.getPass())) {
                Toast.makeText(getApplicationContext(), "added successfully", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getApplicationContext(), "this mail is already signed up", Toast.LENGTH_LONG).show();
            return;
        }
        startActivity(dsp);
    }

    public void LognIn(View view) {
        Intent ds = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(ds);

    }


}
