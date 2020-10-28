package collections;
/*	 使用List存储企鹅类的实例信息。
     要求把不定数量的企鹅信息添加到集合中，
     可查看企鹅的数量及所有企鹅的信息（使用Iterator遍历），
     也可以删除集合中指定的企鹅信息。
     提示：企鹅类需要重写equals方法；使用ArrayList存储。*/
public class Penguin {
    private String name;
    private int age;
    private String strain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Penguin(String name, int age, String strain) {
        this.name = name;
        this.age = age;
        this.strain = strain;
    }
    public Penguin(){

    }

    @Override
    public String toString() {
        return "名称:"+this.name+"\t年龄:"+this.age+"岁\t品种:"+this.strain;
    }

}
