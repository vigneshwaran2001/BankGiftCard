import java.util.ArrayList;
import java.util.HashMap;
public class Encryption{
static HashMap<Integer,String> users=new HashMap<>();
static ArrayList< UserInfo> userinfo=new ArrayList<>();
UserInfo user1=new UserInfo(101,"Vignesh",10000);
UserInfo user2=new UserInfo(102,"Mahesh",50000);
UserInfo user3=new UserInfo(103,"karan",30000);
int index=0;
Encryption(){
users.put(101, encryptPassword("viki1234"));
users.put(102,encryptPassword("miki1234"));
users.put(103, encryptPassword("karan1234"));
userinfo.add(user1);
userinfo.add(user2);
userinfo.add(user3);
}
static String encryptPassword(String password) {
StringBuilder sb = new StringBuilder();
for (char c : password.toCharArray()) {
if(c>='A'&&c<='Z')
sb.append(++c);
else if(c>='a'&&c<='z')
sb.append(++c);
else if(c>='0'&&c<='9')
sb.append(++c);
}
return sb.toString();
}
public static boolean authenticate(int userid, String password){
Encryption en=new Encryption();
if (users.containsKey(userid)){
if(userid==101)en.index=0;
if(userid==102)en.index=1;
if(userid==103)en.index=2;
String val=users.get(userid);
if(val.equals(encryptPassword(password))) {
UserInfo u= userinfo.get(en.index);
System.out.println("Login successful ");
u.display();
return true;
}
}
return false;
}
}