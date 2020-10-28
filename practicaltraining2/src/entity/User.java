package entity;

public class User {
    private String  id;
    private String gh;
    private String yhm;
    private String mm;
    private String sf;
    private String sex;
    private String age;
    private String phone;

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

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String yhm) {
        this.yhm = yhm;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public String getSf() {
        return sf;
    }

    public void setSf(String sf) {
        this.sf = sf;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "user [id=" + id + ", gh=" + gh + ", yhm=" + yhm + ", mm=" + mm + ", sf=" + sf + ", sex=" + sex
                + ", age=" + age + ", phone=" + phone + "]";
    }


}