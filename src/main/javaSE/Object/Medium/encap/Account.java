package Object.Medium.encap;

public class Account {
    /**
     * 创建程序,在其中定义两个类：Account 和AccountTest 类体会Java 的封装性。
     * Account 类要求具有属性：姓名（长度为2 位3 位或4 位）、余额(必须>20)、
     * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
     * 通过setXxx 的方法给Account 的属性赋值。
     * 在AccountTest 中测试
     */
    private String name;
    private int balance;
    private String password;

    public Account(){}

    public Account(String name,int balance,String password){
        setName(name);
        setBalance(balance);
        setPassword(password);
    }


    public void setName(String name) {
        if (name.length() == 2||name.length() == 3 || name.length() == 4){
            this.name = name;
        }else {
            System.out.println("名字长度不对，请输入（2-4个字符）");
            this.name = "无名";
        }
    }

    public void setBalance(int balance) {
        if (balance > 20){
            this.balance = balance;
        }else {
            System.out.println("余额最小20，默认0");
            this.balance = 0;
        }
    }

    public void setPassword(String password) {
        if (password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码必须大于六位，默认密码666");
            this.password = "666";
        }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public void showInfo(){
        System.out.println("账号信息：name = " + name + " 余额 = " + balance + " 密码 = " + password);
    }
}
