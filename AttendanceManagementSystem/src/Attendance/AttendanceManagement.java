package Attendance;
import java.util.ArrayList;
import java.util.List;

public class AttendanceManagement {
    private List<AttendanceRecord> records;

    public AttendanceManagement() {
        records = new ArrayList<>();
    }

    public void addRecord(AttendanceRecord record) {
        records.add(record);
    }

    public List<AttendanceRecord> getRecords() {
        return records;
    }

    public void displayRecords() {
        if (records.isEmpty()) {
            System.out.println("No attendance records available.");
        } else {
            for (AttendanceRecord record : records) {
                System.out.println(record);
            }
        }
    }
}
