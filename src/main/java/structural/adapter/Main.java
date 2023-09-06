package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List textList = new ArrayList();
        textList.add("text1");
        textList.add("text2");
        textList.add("text3");

        PrinterAdapter serialPrinter = new PrinterAdapter();
        serialPrinter.print(textList);
    }
}
