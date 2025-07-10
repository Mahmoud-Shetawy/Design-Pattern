package Visitor.Aft_Use;

public interface ScheduleManagement {
    void generateReport();
    void calculateOverTime();
//    void manageLeaveRequests();
    void accept(ManageLeaveRequestVisitor manageLeaveRequestVisitor);
}
