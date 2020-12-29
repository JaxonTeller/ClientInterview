package Java8Features;

interface WithOnlyAbstarctMethod
{
    void printName();
}
class Print implements WithOnlyAbstarctMethod
{
    @Override
    public void printName() {
        System.out.println("Name is Nishikant");
    }
}
/*---------------------------------------------------------*/
interface WithAbstarctAndDefaultMethod
{
    void printName();
    default void  printPrivacyStatement()
    {
        System.out.println("Privacy statement");
    }
}
class PrintPrivacyStatement implements WithOnlyAbstarctMethod,WithAbstarctAndDefaultMethod
{
    @Override
    public void printName() {
        System.out.println("Name is Nisjikant in Default Method");
    }
}
/*--------------------------------------------------------------------------------*/
interface WithAbstractDefaultAndPrivateMethod
{
    void printName();
    default void printPrivacyStatement2()
    {
        System.out.println("Privacy statement");
        privacyStatementPart();
    }
    private void privacyStatementPart()
    {
        System.out.println("Part of the privacy statement");
    }
}
class PrintPrivacyAndPartStatement implements WithAbstarctAndDefaultMethod,WithAbstractDefaultAndPrivateMethod
{
    @Override
    public void printName() {
        System.out.println("Nishikant private method");
    }

}
/*----------------------------------------------------------------------------------------*/
interface WithStaticMethod
{
    static void printName()
    {
        System.out.println("Nishikant");
    }
}
class PrintStatic implements WithStaticMethod
{
     public static void printName()
     {
         System.out.println("Something");
     }
}
/*-------------------------------------------------------------*/
interface WithPrivateStaticMethod
{
    static void printName()
    {
        System.out.println("Calling to part of the Name");
        printPartOfName();
    }
    private static void printPartOfName()
    {
        System.out.println("Part of the Name");
    }
}
abstract class Payment
{
    private String customerName;
    private String customerAddress;

    public Payment(String customerName,String customerAddress)
    {
        this.customerName=customerName;
        this.customerAddress=customerAddress;
    }

    @Override
    public String toString() {
        return "Java8Features.Payment{" +
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
class CardPayment extends Payment
{
    private String cardDetails;
    public CardPayment(String customerName, String customerAddress,String cardDetails) {
        super(customerName, customerAddress);
        this.cardDetails=cardDetails;
    }

    @Override
    public String toString() {
        return "Java8Features.CardPayment{" +
                "cardDetails='" + cardDetails + '\'' +
                '}';
    }
}
public class DifferentTypeOfInterface {
    public static void main(String[] args) {

        Payment payment=new CardPayment("Nishu","Pune","SBICARD");
        System.out.println(payment);

        WithAbstarctAndDefaultMethod withAbstarctAndDefaultMethod=new PrintPrivacyStatement();
        withAbstarctAndDefaultMethod.printName();
        withAbstarctAndDefaultMethod.printPrivacyStatement();

        WithAbstractDefaultAndPrivateMethod withAbstractDefaultAndPrivateMethod=new PrintPrivacyAndPartStatement();
        withAbstractDefaultAndPrivateMethod.printName();
        withAbstractDefaultAndPrivateMethod.printPrivacyStatement2();


        PrintStatic.printName();
        WithStaticMethod.printName();

        WithPrivateStaticMethod.printName();

    }
}
