package BinaryTree;

class Room {
    private int roomNo;
    private int capacity;
    private static int roomCounter=500;

    public Room() {
        roomNo = roomCounter++;
        capacity = 4;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRoomCounter() {
        return roomCounter;
    }

    public void setRoom(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRoomCounter(int roomCounter) {
        this.roomCounter = roomCounter;
    }

    public String toString() {
        return "Room\nroomNo: " + this.roomNo + "\ncapacity: " + this.capacity;
    }
}

class Member {
    private int memberId;
    private String name;
    private Room room;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String toString() {
        return "Member\nmemberId: " + this.memberId + "\nname: " + this.name;
    }
}

class Admin {
    public void assignRoom(Room[] rooms, Member member) {
        for(Room i: rooms){
            if(i.getCapacity()>0){
                member.setRoom(i);
                i.setCapacity(i.getCapacity()-1);
                break;
            }
        }
    }
}

public class Tester {
    public static void main(String args[]) {
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();

        Room[] totalRooms = {room1, room2, room3, room4, room5};

        Admin admin = new Admin();

        Member member1 = new Member(101, "Serena");
        Member member2 = new Member(102, "Martha");
        Member member3 = new Member(103, "Nia");
        Member member4 = new Member(104, "Maria");
        Member member5 = new Member(105, "Eva");

        Member[] members = {member1, member2, member3, member4, member5};

        for (Member member : members) {
            admin.assignRoom(totalRooms, member);
            if (member.getRoom() != null) {
                System.out.println("Hi " + member.getName() + "! Your room number is " + member.getRoom().getRoomNo());
            } else {
                System.out.println("Hi " + member.getName() + "! No room available");
            }
        }
    }
}



