package pk.gb.useraccount;

import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements checkable {
    private String name;
    private String Mail;
    private String Pass;

    private  int id;
    public static ArrayList<Customer> Customers = new ArrayList<Customer>();
    public Customer(){
        name = "";
        Mail = "";
        Pass = "";
        id = 0;

    }
    public Customer(String n, String m, String p, int id){
        name = n;
        Mail = m;
        Pass = p;
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return Mail;
    }

    public String getPass() {
        return Pass;
    }
    public int getId() {
        return id;
    }

    @Override
    public boolean checkSignUp(String M) {
        for(int i = 0;i < Customers.size();i++) {
            if (M.equals(Customers.get(i).getMail()) == true) {
                return false;
            }

        }

        return true;
    }

    @Override
    public boolean signUp(Customer c) {
        if(checkSignUp(c.getMail()) == true){
            c.id++;
            Customers.add(c);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkLogIn(Customer c) {
        for(int i = 0;i < Customers.size();i++) {
            if (c.getMail().equals(Customers.get(i).getMail()) == true) {
                if(c.getPass().equals(Customers.get(i).getPass())) {
                    c.setName(Customers.get(i).getName());
                    c.setId(Customers.get(i).getId());
                    return true;
                }
            }

        }

        return false;
    }




}
