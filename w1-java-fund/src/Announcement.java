
public class Announcement {
    public static void main(String[] args) {

        Announcement myAnnouncement = new Announcement();

        System.out.println(
                myAnnouncement.celebration() + "\n" + Announcement.changeOfPlan()
        );
        System.out.println(
                Announcement.changeOfPlan()
        );

    }

    // this is a instance method - it needs to me called my the instance of the class
    public String celebration() {
        return "It's almost Christmas";
    }
    // this is a static method - it can be call my the class name directly
    public static  String changeOfPlan() {
        return "Change of Plans, we're going the the Maldives ahhbmfgcfsidbh";
    }
}
