package Visitor.Aft_Use;


public class RemoteWorkShiftScheduleManagement implements ScheduleManagement {
    @Override
    public void generateReport() {
        System.out.println("Generating Remote Work Shift Schedule Management Report");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating Over Time Remote Work Shift...");
    }

    @Override
    public void accept(ManageLeaveRequestVisitor manageLeaveRequestVisitor) {
        manageLeaveRequestVisitor.visit(this);

    }
}
