package _21_Template_Method;

public class People extends Visitor {
    public People(PopCorns popCorn, String name) {
        super(popCorn, name);
    }

    @Override
    protected void buyPopCorn() {
        if(this.popCorn.equals(PopCorns.POP_CORN_SALT)) {
            System.out.println("SALT");
        } else {
            System.out.println("CHEESE");
        }
    }
}
