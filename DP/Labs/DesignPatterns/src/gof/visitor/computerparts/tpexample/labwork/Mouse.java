package gof.visitor.computerparts.tpexample.labwork;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public void accept(ComputerPartMaintenanceVisitor computerPartMaintainVisitor) {
        computerPartMaintainVisitor.maintain(this);
    }
}