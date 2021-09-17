import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> collection;

    public void addBuddy(BuddyInfo newBuddy){
        for(int i = 0; i < collection.size(); i++) {
            if (collection.get(i).equals(newBuddy)) {
                return;
            }
        }
        collection.add(newBuddy);
        return;
    }

    public void removeBuddy(BuddyInfo newBuddy){
        for(int i = 0; i < collection.size(); i++) {
            if (collection.get(i).equals(newBuddy)) {
                collection.remove(i);
                return;
            }
        }
        System.out.print("Buddy not found in address book!");
        return;
    }

    public ArrayList<BuddyInfo> getCollection() {
        return collection;
    }

    public AddressBook(){
        this.collection = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}