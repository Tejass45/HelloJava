/*

 */

class ATM {
    public static void main(String[] args)
    {
        double amt_wd=500, acc_bal=1000;

        if(amt_wd%5==0 && acc_bal>0 && amt_wd+.5<acc_bal)
        {
            acc_bal =  acc_bal-amt_wd-.5;
        }
        System.out.println("Balance : "+acc_bal);
    }
}
