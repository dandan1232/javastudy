package entity;

public class Salary {

    private String id;
    private String gh;
    private String name;
    private String password;
    private String sf;

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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSf() {
        return sf;
    }
    public void setSf(String sf) {
        this.sf = sf;
    }


    public Salary() {
        // TODO Auto-generated constructor stub
    }


    @Override
    public String toString() {
        return "Salary [id=" + id + ", gh=" + gh + ", name=" + name + ", password=" + password + ", sf=" + sf + "]";
    }


}