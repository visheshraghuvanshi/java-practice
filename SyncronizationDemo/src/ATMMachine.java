// WIP - if is useless idk what i am doing
class ATM {
    public int balance = 0;
    public String name;
    public int checkBalance (String name) { // 2 log hi h atm me
        if (this.name.equals(name)) {
            return this.balance;
        }
        return -1;
    }
    public void withdraw (String name, int amount) {
        if (this.name.equals(name) && amount < balance) {
            balance -= amount;
        }

    }
}
public class ATMMachine {
}
