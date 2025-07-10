package Visitor.Aft_Use;

public class ManageLeaveRequestVisitor implements ScheduleManagementVisitor{
    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Visiting Schedule Management DayShift...");
    }

    @Override
    public void visit(NightShiftScheduleManagement nightShiftScheduleManagement) {
        System.out.println("Managing Leave Requests Night Shift...");

    }

    @Override
    public void visit(RemoteWorkShiftScheduleManagement remoteWorkShiftScheduleManagement) {
        System.out.println("Managing Leave Requests Remote Work Shift...");
    }
}
