package structural.decorator;

import structural.decorator.decorators.BorderDecorator;
import structural.decorator.decorators.ShadowDecorator;
import structural.decorator.elements.AlertBox;
import structural.decorator.elements.Element;

public class Main {
    public static void main(String[] args) {
        Element alertBox = new AlertBox();

        Element alertBoxDecorated = new ShadowDecorator(new BorderDecorator(alertBox));
        alertBoxDecorated.draw();
    }
}
