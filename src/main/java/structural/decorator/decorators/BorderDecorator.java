package structural.decorator.decorators;

import structural.decorator.elements.Element;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Element element) {
        super(element);
    }

    @Override
    public void beforeDraw() {}

    @Override
    public void afterDraw() {
        System.out.println("Draw a border");
    }
}
