package Shop;

public class Customer {
    private MemberShip memberShip;
    private int id;
    private String name;


    public Customer(MemberShip memberShip , int id , String name) {
        this.memberShip = memberShip;
        this.id = id;
        this.name = name;

    }

    public MemberShip getMembership() {
        return memberShip;
    }

    public void setMembership(MemberShip membership) {
        this.memberShip = membership;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
