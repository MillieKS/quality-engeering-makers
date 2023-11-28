public class Order {
    Integer total = 0;

    public void addAmount(Integer amount) {
        this.total += amount;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer addDiscount(Integer amount){
        this.total -= (total / 10) * amount;
        return this.total;
    }

    public String friendlyTotal() {

        return String.format("Thanks! The total value of your order is £ %d.", this.total);
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addAmount(10);
        order.addDiscount(2);
        Integer total = order.getTotal();
        System.out.println(total);
        String friendlyTotal = order.friendlyTotal();
        System.out.println(friendlyTotal);
    }
}
