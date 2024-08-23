package Attendance;
public class AttendanceRecord {
    private String studentName;
    private String date;
    private boolean present;

    public AttendanceRecord(String studentName, String date, boolean present) {
        this.studentName = studentName;
        this.date = date;
        this.present = present;
    }

    @Override
    public String toString() {
        return "Name: " + studentName + ", Date: " + date + ", Present: " + (present ? "Yes" : "No");
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public String getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }
}

