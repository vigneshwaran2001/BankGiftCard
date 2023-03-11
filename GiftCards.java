import java.util.ArrayList;
public class GiftCards{
int userId;
int cardNo;
int pin;
int amount;
ArrayList<String> history= new ArrayList<>();
GiftCards(int cardNo,int pin,int amount){
this.cardNo=cardNo;
this.pin=pin;
this.amount=amount;
}
}