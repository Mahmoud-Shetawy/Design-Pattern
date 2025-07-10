package Visitor.Bef_Use;

public class DayShiftScheduleManagement implements ScheduleManagement{
    @Override
    public void generateReport() {
        System.out.println("Generating Schedule Management Report DayShift...");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating Over Time DayShift...");

    }

    @Override
    public void manageLeaveRequests() {
        System.out.println("Managing Leave Requests DayShift...");
    }
}
