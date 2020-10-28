package entity;

public class Attendance {

    private String id;
    private String gn;
    private String gzr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGn() {
        return gn;
    }

    public void setGn(String gn) {
        this.gn = gn;
    }

    public String getGzr() {
        return gzr;
    }

    public void setGzr(String gzr) {
        this.gzr = gzr;
    }

    public Attendance() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Attendance [id=" + id + ", gn=" + gn + ", gzr=" + gzr + "]";
    }


}