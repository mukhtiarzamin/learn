package gof.visitor.computerparts.tpexample.labwork;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Multimedia multimedia);
}
