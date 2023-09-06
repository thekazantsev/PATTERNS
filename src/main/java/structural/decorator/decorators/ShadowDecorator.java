package structural.decorator.decorators;

import structural.decorator.elements.Element;

public class ShadowDecorator extends Decorator {

    public ShadowDecorator(Element element) {
        super(element);
    }

    @Override
    public void beforeDraw() {
        System.out.println("Draw a shadow");
    }

    @Override
    public void afterDraw() {}
}
