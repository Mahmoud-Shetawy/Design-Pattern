package Visitor.Bef_Use;

public class RemoteWorkShiftScheduleManagement implements ScheduleManagement{
    @Override
    public void generateReport() {
        System.out.println("Generating Remote Work Shift Schedule Management Report");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating Over Time Remote Work Shift...");
    }

    @Override
    public void manageLeaveRequests() {
        System.out.println("Managing Leave Requests Remote Work Shift...");
    }
}
