import java.util.ArrayList;
import java.util.Scanner;
public class AccountLogin{
ArrayList<GiftCards> card= new ArrayList<>();
int cardNumber=12345,pin=1010,amount=0;
GiftCards g;
public void giftCard(){
int index=0;
Encryption en=new Encryption();
BankGiftCard b=new BankGiftCard();
if(b.id==101)index=0;
if(b.id==102)index=1;
if(b.id==103)index=2;
UserInfo u= en.userinfo.get(index);
g=new GiftCards(cardNumber,pin,amount);
g.userId=u.id;
card.add(g);
System.out.println("Gift card created");
System.out.println("GiftCard No:" +cardNumber);
System.out.println("Pin No: "+pin);
System.out.println("Balance: "+amount);
this.cardNumber++;
this.pin++;
}
public void TopUp(){
boolean check=false;
Scanner sc=new Scanner(System.in);
Encryption en=new Encryption();
System.out.println("Enter card Number");
int n=sc.nextInt();
System.out.println("Enter pin Number:");
int pin=sc.nextInt();
System.out.println("Enter amount to TopUp:");
int amt=sc.nextInt();
for(GiftCards c: card) {
if (c.cardNo == n&&c.pin==pin) {
check=true; 
int index=0;
if(c.userId==101) index=0;
if(c.userId==102) index=1;
if(c.userId==103) index=2;
UserInfo u = en.userinfo.get(index);
System.out.println(u.accBalance);
if (amt < u.accBalance) {
u.accBalance = u.accBalance - amt;
c.amount += amt;
}
System.out.println("ToppedUp\n" + "Balance: " + String.valueOf(c.amount));
c.history.add("Rs." + String.valueOf(amt) + " ToppedUp -" + " Available Balance: " + String.valueOf(c.amount));
break;
}
}
if(!check) System.out.println("Not a valid Card Number");
}
public void TransactionHistory(){
boolean check=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter card Number");
int n=sc.nextInt();
System.out.println("Enter pin Number:");
int pin=sc.nextInt();
System.out.println("Transaction History:");
for(GiftCards c: card) {
if(c.cardNo==n&&c.pin==pin) {
check=true;
for (int i = 0; i < c.history.size(); i++)
System.out.println(c.history.get(i));
break;
}
}
if(!check) System.out.print("Not a valid Card Number");
}
public void Block(){
Encryption en=new Encryption();
UserInfo u= en.userinfo.get(en.index);
Scanner sc=new Scanner(System.in);
System.out.println("Enter card Number");
int n=sc.nextInt();
for(GiftCards c: card) {
if(c.cardNo==n) {
u.accBalance+=c.amount;
System.out.println("Card "+c.cardNo+" Blocked");
card.remove(c);
break;
}
}
}
}