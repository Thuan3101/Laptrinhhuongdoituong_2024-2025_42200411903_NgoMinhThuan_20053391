package account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(72354, "Ted Murphy", 102.56);
        Account acc2 = new Account(69713, "Jane Smith", 40.00);
        Account acc3 = new Account(93757, "Edward Demsey", 759.32);

        acc1.deposit(25.85);
        acc2.deposit(500.00);

        acc2.withdraw(430.75, 1.50);

        acc3.addInterest();

        hienThongTinAccount(acc1);
        hienThongTinAccount(acc2);
        hienThongTinAccount(acc3);

        acc2.transfer(acc1, 100.00);

        hienThongTinAccount(acc1);
        hienThongTinAccount(acc2);
    }

    public static void hienThongTinAccount(Account acc) {
        System.out.println("Thông tin tài khoản:");
        System.out.println(acc);
        System.out.println("-----------------------------");
    }
}

