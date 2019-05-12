package _22_Visitor;

public class Main {
    public static void main(String[] args) {
        People user = new SimpleVisitor();
        user.doJob(new ConcreteVisitor());
    }
}

interface People {
    void doJob(Visitor visitor);
}

class SimpleVisitor implements People {
    @Override
    public void doJob(Visitor visitor) {
        visitor.doSimple();
    }
}

class Manager implements People {

    @Override
    public void doJob(Visitor visitor) {
        visitor.doManager();
    }
}

interface Visitor {
    void doSimple();
    void doManager();
}

class ConcreteVisitor implements Visitor {

    @Override
    public void doSimple() {
        System.out.println("Look Film");
    }

    @Override
    public void doManager() {
        System.out.println("Look for security");
    }
}
