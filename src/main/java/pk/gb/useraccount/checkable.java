package pk.gb.useraccount;

public interface checkable {
    public abstract boolean checkSignUp(String n);
    public abstract boolean signUp(Customer c);
    public abstract boolean checkLogIn(Customer c);
}
