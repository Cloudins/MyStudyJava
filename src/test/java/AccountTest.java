import Object.Medium.encap.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(10);
        account.setPassword("123456");
        account.showInfo();
    }
}
