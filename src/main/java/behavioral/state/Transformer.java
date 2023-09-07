package behavioral.state;

public class Transformer implements TransformerState {
    private TransformerState context;

    public TransformerState getContext() {
        return context;
    }

    public void setContext(TransformerState state) {
        context = state;
    }


    @Override
    public void move() {
        context.move();
    }

    @Override
    public void fire() {
        context.fire();
    }

    @Override
    public void fly() {
        context.fly();
    }
}
