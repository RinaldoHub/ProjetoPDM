package pdm.rinaldo.projetopdm;

import java.util.Date;

public class TimeBase {
    public double usedHours, hoursLeft, totalHours;

    //TODO perguntar se essa classe é necessária ou se seria possível usar apenas a MonitoredApp

    public TimeBase(double usedHours, double hoursLeft, double totalHours) {
        this.usedHours = usedHours;
        this.hoursLeft = hoursLeft;
        this.totalHours = totalHours;
    }

    public double getUsedHours() {
        return usedHours;
    }

    public void setUsedHours(double usedHours) {
        this.usedHours = usedHours;
    }

    public double getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(double hoursLeft) {
        this.hoursLeft = hoursLeft;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public String toString() {
        return "TimeBase{" +
                "usedHours=" + usedHours +
                ", hoursLeft=" + hoursLeft +
                ", totalHours=" + totalHours +
                '}';
    }
}
