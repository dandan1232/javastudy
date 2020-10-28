package entity;

public class Department {

    private String id;
    private String name;
    private String departmentmanger;
    private String departmentphone;
    private String departmentjj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentmanger() {
        return departmentmanger;
    }

    public void setDepartmentmanger(String departmentmanger) {
        this.departmentmanger = departmentmanger;
    }

    public String getDepartmentphone() {
        return departmentphone;
    }

    public void setDepartmentphone(String departmentphone) {
        this.departmentphone = departmentphone;
    }

    public String getDepartmentjj() {
        return departmentjj;
    }

    public void setDepartmentjj(String departmentjj) {
        this.departmentjj = departmentjj;
    }

    public Department() {
        // TODO Auto-generated constructor stub
    }


    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ", departmentmanger=" + departmentmanger
                + ", departmentphone=" + departmentphone + ", departmentjj=" + departmentjj + "]";
    }

}
