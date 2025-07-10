package Visitor.Bef_Use;

public class NightShiftScheduleManagement implements ScheduleManagement{
    @Override
    public void generateReport() {
        System.out.println("Generating Report Night Shift...");

    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating Over Time Night Shift...");

    }

    @Override
    public void manageLeaveRequests() {
        System.out.println("Managing Leave Requests Remote Work Shift...");
    }
}
