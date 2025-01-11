package core;
class Member {
    String name;
    int age;
    String address;
    String phoneNumber; 
    public Member(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println();
    }
}
public class MemberArray {
    public static void main(String[] args) {
        Member[] members = new Member[5];
        members[0] = new Member("VIVEK", 18, "205 GROUP5", "1234567890");
        members[1] = new Member("SHIVA", 19, "200 GROUP5", "9876543210");
        members[2] = new Member("VENKAT SAI", 19, "713 GROUP4", "1122334455");
        members[3] = new Member("ARUN", 18, "659 GROUP4", "2233445566");
        members[4] = new Member("SRI SAI", 19, "235 GROUP5", "3344556677");
        for (Member member : members) {
            member.displayDetails();
        }
    }
}

    
