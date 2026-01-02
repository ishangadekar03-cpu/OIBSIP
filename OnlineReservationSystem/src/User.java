public class User {
    private String name;
    private int age;
    private String trainNumber;
    private String trainName;
    private String classType;
    private String from;
    private String to;
    private String date;
    private String pnr;

    public User(String name, int age, String trainNumber, String trainName,
                String classType, String from, String to, String date, String pnr) {
        this.name = name;
        this.age = age;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.classType = classType;
        this.from = from;
        this.to = to;
        this.date = date;
        this.pnr = pnr;
    }

    public String getPnr() {
        return pnr;
    }

    public void displayDetails() {
        System.out.println("----- Ticket Details -----");
        System.out.println("PNR Number   : " + pnr);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Train No     : " + trainNumber);
        System.out.println("Train Name   : " + trainName);
        System.out.println("Class        : " + classType);
        System.out.println("Journey Date : " + date);
        System.out.println("From         : " + from);
        System.out.println("To           : " + to);
        System.out.println("--------------------------");
    }
}

