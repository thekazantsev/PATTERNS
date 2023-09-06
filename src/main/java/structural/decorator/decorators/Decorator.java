package structural.decorator.decorators;

import structural.decorator.elements.Element;

public abstract class Decorator implements Element {
    protected Element element;

    public Decorator( Element element) {
        this.element = element;
    }

    public abstract void beforeDraw();

    public abstract void afterDraw();

    @Override
    public void draw() {
        beforeDraw();
        element.draw();
        afterDraw();
    }
}
