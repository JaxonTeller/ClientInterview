package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

class Account
{
    private String accountNumber;
    private String accountHolderName;

    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return accountNumber.equals(account.accountNumber);
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    @Override
    public String toString() {
        return "CollectionFramework.Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
public class CustomeKeyImplementation {
    public static void main(String[] args) {
        Account account=new Account("123","Nishikant");
        Account account1=new Account("123","Golu");

        Map<Account,Integer> accountIntegerMap=new HashMap<>();
        accountIntegerMap.put(account,10000);//hashocde calls---index generated based on hashcode--put into that index,into internal table array
        accountIntegerMap.put(account1,11000);//check for equality, means same hashcode--->so goes to that index and replaces.

        accountIntegerMap.forEach((accountInfo,balance)-> System.out.println(accountInfo+" "+balance));
    }
}
