package entity;

public class Employee {
    private String id;
    private String gh;
    private String name;
    private String sex;
    private String  age;
    private String department;
    private String zw;
    private String rzsj;
    private String lzsj;
    private String gl;
    private String zjhm;
    private String xl;
    private String jtzz;
    private String phone;
    private String yx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    public String getRzsj() {
        return rzsj;
    }

    public void setRzsj(String rzsj) {
        this.rzsj = rzsj;
    }

    public String getLzsj() {
        return lzsj;
    }

    public void setLzsj(String lzsj) {
        this.lzsj = lzsj;
    }

    public String getGl() {
        return gl;
    }

    public void setGl(String gl) {
        this.gl = gl;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    public String getJtzz() {
        return jtzz;
    }

    public void setJtzz(String jtzz) {
        this.jtzz = jtzz;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getYx() {
        return yx;
    }

    public void setYx(String yx) {
        this.yx = yx;
    }

    public Employee() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "id"+this.id+"工号"+this.gh+"名字"+this.name+"性别"
                +this.sex+"年龄"+this.age+"部门"+this.department+"职位"+this.zw+"入职时间"
                +this.rzsj+"离职时间"+this.lzsj+"工龄"+this.gl+"证件号码"+this.zjhm+"学历"
                +this.xl+"家庭住址"+this.jtzz+"电话号码"+this.phone+"邮箱"+this.yx;
    }

}