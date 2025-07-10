package Visitor.Aft_Use;


public class NightShiftScheduleManagement implements ScheduleManagement {
    @Override
    public void generateReport() {
        System.out.println("Generating Report Night Shift...");

    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating Over Time Night Shift...");

    }

    @Override
    public void accept(ManageLeaveRequestVisitor manageLeaveRequestVisitor) {
        manageLeaveRequestVisitor.visit(this);

    }
}
