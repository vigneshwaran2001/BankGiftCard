public class UserInfo {
String name;
int id;
int accBalance;
UserInfo(int id,String name, int accBalance){
this.id=id;
this.name=name;
this.accBalance=accBalance;
}
void display(){
System.out.println("User ID: "+ id);
System.out.println("User Name: "+ name);
System.out.println("Account Balance: "+ accBalance);
}
}