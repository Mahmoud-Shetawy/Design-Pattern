package Visitor.Aft_Use;

public class CalculateBonusVisitor implements ScheduleManagementVisitor{
    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("calculate bonus visitor DayShiftScheduleManagement ");
    }

    @Override
    public void visit(NightShiftScheduleManagement nightShiftScheduleManagement) {
        System.out.println("calculate bonus visitor NightShiftScheduleManagement ");
    }

    @Override
    public void visit(RemoteWorkShiftScheduleManagement remoteWorkShiftScheduleManagement) {
        System.out.println("calculate bonus visitor RemoteWorkShiftScheduleManagement ");
    }
}
