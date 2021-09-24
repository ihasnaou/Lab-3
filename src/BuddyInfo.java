public class BuddyInfo {

    private String name;
    private int phoneNumber;
    private String address;

    public String getName() {
        return name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }

    public BuddyInfo(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public BuddyInfo() {
        this.name = "Not given";
        this.phoneNumber = -1;
        this.address = "Unavailable";
    }
    public static void main(String[] args) {
        BuddyInfo Homer = new BuddyInfo("Homer", 101010101, "101 rd.");
        System.out.println("Hello " + Homer.getName() + "!");
    }

    public boolean equals(BuddyInfo buddy2){
        if (name.equals(buddy2.getName())){
            if (phoneNumber == buddy2.getPhoneNumber()){
                if (address.equals(buddy2.getAddress())){
                    return true;
                }
            }
        }
        return false;
    }
}