
public class Main {
    public static void main(String[] args) {
        HDFCAccount nitin = new HDFCAccount("nitin","nitin931",20000);
        SBIAccont yash = new SBIAccont("yash","yash931",200102);

        System.out.println(nitin);
        System.out.println(yash);

        System.out.println(nitin.addMoney(10000));
        System.out.println(nitin.fetchBalance("98432"));
        System.out.println(nitin.changePassword("nitin931","nitin123"));
        System.out.println(nitin.withdrawMoney(50000,"nitin123"));
        System.out.println(nitin.withdrawMoney(5000,"nitin123"));

        System.out.println(yash.addMoney(10000));
        System.out.println(yash.fetchBalance("98432"));
        System.out.println(yash.changePassword("yash931","yash123"));
        System.out.println(yash.withdrawMoney(50000,"yash123"));
        System.out.println(yash.withdrawMoney(5000,"yash123"));
        System.out.println(nitin);
        System.out.println(yash);

    }
}