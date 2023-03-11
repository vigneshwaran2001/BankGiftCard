import java.util.*;
public class Purchase{
BankGiftCard b=new BankGiftCard();
AccountLogin al=new AccountLogin();
int redeem=0;
public void purchase(){
boolean check=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter card Number:");
int n=sc.nextInt();
System.out.println("Enter pin Number:");
int pin=sc.nextInt();
int purchase=0;
for(GiftCards c: b.card) {
if(c.cardNo==n&&c.pin==pin) {
check=true;
System.out.println("LOGGED-IN \nEnter the Purchase Amount: ");
int amt= sc.nextInt();
purchase+=amt;
redeem= redeem+ (purchase/100)*10;
purchase=purchase%100;
c.amount-=amt;
c.history.add("Rs."+amt+" Purchased -"+" Available balance: "+c.amount);
System.out.println("Available balance: "+c.amount);
break;
}
}
al.card= b.card;
if(!check) System.out.println("Invalid Card Number or pin");
}
public void Redeem() {
if (redeem>10) {
Scanner sc=new Scanner(System.in);
boolean check=false;
System.out.println("Enter card Number:");
int n=sc.nextInt();
System.out.println("Enter pin Number:");
int pin=sc.nextInt();
for(GiftCards c: b.card) {
if(c.cardNo==n&&c.pin==pin) {
check=true;
int index=0;
Encryption en=new Encryption();
if(c.userId==101) index=0;
if(c.userId==102) index=1;
if(c.userId==103) index=2;
UserInfo u = en.userinfo.get(index);
if(redeem%10==0){
u.accBalance += redeem;
redeem=0;
}
else{
u.accBalance+= (redeem/10)*10;
redeem-= (redeem/10)*10;
}
System.out.println("Balance of "+u.id+" is "+u.accBalance);
break;
}
} if(!check) System.out.println("Invalid Card Number or pin");
} else System.out.println("You Don't have enough Redeem points");
}
}
