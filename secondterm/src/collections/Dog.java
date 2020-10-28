package collections;

public class Dog  implements Comparable<Dog>{
    private String name; //作为主人的名字
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

    public Dog(String name, int age, String strain) {
        this.name = name;
        this.age = age;
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "名称:"+this.name+"\t年龄:"+this.age+"\t品种:"+this.strain;
    }

    @Override
    public int hashCode() {
        int prime=31;
        int result=17;
        result=prime*result+(this.name!=null?this.name.hashCode():0);
        result=prime*result+(this.strain!=null?this.strain.hashCode():0);

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Dog){
            Dog dog=(Dog)obj;
            if(this.name.equals(dog.getName())&&this.strain.equals(dog.getStrain())){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public int compareTo(Dog o) {
        		/*这里面使用age来作为TreeSet排序及判断是否是同一对象的依据，
		和上面的equals的判断原则不一样，这种做法不推荐，仅为展示而如此编码*/
        if(this.age<o.getAge()){
            return  -1; //升序 如果这里写1，下面写-1就是降序
        }
        else if(this.age>o.getAge()){
            return 1;
        }else {
            return 0;
        }
    }
}
