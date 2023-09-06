package pk.gb.useraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    LoginDb db;
    ImageView img;
    Customer c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new LoginDb(this);
        img = findViewById(R.id.GoBackIcon);

    }

    public void goback(View view) {
        Intent ic = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(ic);
    }
    public void logIn(View view){
        Intent i = new Intent(LoginActivity.this, Categories.class);
        EditText mail = (EditText) findViewById(R.id.LogIn_mail);
        EditText pass = (EditText) findViewById(R.id.LogIn_pass);
        if(mail.getText().toString().equals("")||pass.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"please fill the text fields",Toast.LENGTH_LONG).show();
            return;
        }
        c = new Customer();
        c.setMail(mail.getText().toString());
        c.setPass(pass.getText().toString());
        if(c.checkLogIn(c)){
            Product.cart = new ArrayList<Product>();
            Toast.makeText(getApplicationContext(),"logged-In successfully",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"invalid E-mail or password",Toast.LENGTH_LONG).show();
            return;
        }
        //i.putExtra("key",c.getMail());
        startActivity(i);
    }

    public void SignIn(View view) {
        Intent sign = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(sign);
    }
}
