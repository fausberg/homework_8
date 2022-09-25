package task1;

public class Main {
    public static void main(String[] args) {
        Phone nokia = new Phone(743827489,"nokia", 2);
        Phone iphone = new Phone(4285789,"iphone", 3);
        Phone xioami = new Phone(49389058,"xiaomi", 4);

        nokia.receiveCall("Anton");
        System.out.println(nokia.getNumber());
        iphone.receiveCall("Ivan");
        System.out.println(iphone.getNumber());
        xioami.receiveCall("Vlad");
        System.out.println(xioami.getNumber());

        nokia.receiveCall("Anton", nokia.getNumber());

        nokia.sendMassage(nokia.getNumber(), iphone.getNumber());
    }
}