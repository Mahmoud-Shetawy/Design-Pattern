package Visitor.Aft_Use;

public interface ScheduleManagementVisitor {
    void visit(DayShiftScheduleManagement dayShiftScheduleManagement);
    void visit(NightShiftScheduleManagement nightShiftScheduleManagement);
    void visit(RemoteWorkShiftScheduleManagement remoteWorkShiftScheduleManagement);
}
