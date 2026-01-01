public class Print{
    public static void main(String[] args) {
        Atm user = new Atm("Kia Hiatari", 25, 968925871631L, 8928, 25000);
        user.bal(8928);
        user.debit(200000);
        user.withdrawl(8928, 200000000);
        user.pinchange(8928);
    }
}
