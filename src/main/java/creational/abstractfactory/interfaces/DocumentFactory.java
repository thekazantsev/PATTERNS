package creational.abstractfactory.interfaces;

public interface DocumentFactory {
    Contract getContract();
    Patent getPatent();
    Statement getStatement();
}
