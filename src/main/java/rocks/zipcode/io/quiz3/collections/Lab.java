package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    public String labName;
    public LabStatus labStatus;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
        this.labStatus = LabStatus.PENDING;
    }

    public Lab(String labName, LabStatus labStatus) {
        this.labName = labName;
        this.labStatus = labStatus;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
