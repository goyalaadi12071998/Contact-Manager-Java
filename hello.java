import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import sun.security.ec.point.Point;
import sun.tools.tree.DoubleExpression;


class Contact {
    String name;
    String email;
    String phoneNumber;

    Contact(String name , String email , String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

}

class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact newContact){
        this.myFriends[friendsCount] = newContact;
        this.friendsCount++;
    }

    Contact searchContact(String name) {
        for(int i = 0 ; i < this.friendsCount ; i++){
            if(myFriends[i].name.equals(name)){
                return myFriends[i];
            }
        }
        Contact defaul = new Contact(" ", " ", " ");
        return defaul;
    }
}




public class hello {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContactsManager myContactManager = new ContactsManager();
        for(int i = 0 ; i < 2 ; i++){
            String name = scanner.nextLine();
            String email = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            Contact newContact = new Contact(name , email , phoneNumber);
            myContactManager.addContact(newContact);
        }
        String name = scanner.nextLine();
        Contact foundContact = myContactManager.searchContact(name);
        System.out.println("Name: " + foundContact.name);
        System.out.println("Email: " + foundContact.email);
        System.out.println("Phone Number: " + foundContact.phoneNumber);
    }
}