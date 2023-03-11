import java.util.*;
public class BankGiftCard{
static int id;
static ArrayList<GiftCards> card = new ArrayList<>();
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
AccountLogin acc = new AccountLogin();
Purchase p = new Purchase();
Encryption en = new Encryption();
while (true) {
System.out.println("press 1 for Account login\npress 2 for Purchase\npress 0 to exit the App");
int choose = sc.nextInt();
if (choose == 1) {
System.out.println("Enter Userid:");
id = sc.nextInt();
sc.nextLine();
System.out.println("Enter Password:");
String pass = sc.nextLine();
if (en.authenticate(id, pass)) {
while(true){
System.out.println("1.ToCreateGiftCard:\n2.ToTopUp:\n3.ToTransactionHistory:\n4.ToBlock:\n5.ToLogout:");
int n = sc.nextInt();
if (n == 1) 
acc.giftCard();
if (n == 2) 
acc.TopUp();
if (n == 3) 
acc.TransactionHistory();
if (n == 4) 
acc.Block();
if (n == 5) {
card= acc.card;
break;
}
}
} 
else
System.out.print("Invalid Password or userName");
}
if (choose == 2) {
System.out.println("1. Purchase:\n2. Redeem Points:");
int n = sc.nextInt();
if (n == 1)
p.purchase();
if (n == 2)
p.Redeem();
}
if(choose==0) {
System.out.print("Thank you for your visit");
break;
}
}
}
}