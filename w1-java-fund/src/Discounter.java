public class Discounter {

    Integer discount;

    public Discounter(Integer discount) {
        this.discount = discount;

    }

    public Integer applyTo(Integer total) {
        return total - discount;
    }

    public static void main(String[] args) {
        Discounter myDiscounter = new Discounter(20);

        System.out.println(myDiscounter.applyTo(100));
    }
}

