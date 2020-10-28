package Computer;

public class Student extends Person {
    private String no;
    private  double scoreOfEn;
    private  double scoreOfJava;
    private  double scoreOfHtml;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getScoreOfEn() {
        return scoreOfEn;
    }

    public void setScoreOfEn(double scoreOfEn) {
        this.scoreOfEn = scoreOfEn;
    }

    public double getScoreOfJava() {
        return scoreOfJava;
    }

    public void setScoreOfJava(double scoreOfJava) {
        this.scoreOfJava = scoreOfJava;
    }

    public double getScoreOfHtml() {
        return scoreOfHtml;
    }

    public void setScoreOfHtml(double scoreOfHtml) {
        this.scoreOfHtml = scoreOfHtml;
    }
/*    public double aver() { 
          return(phi+eng+comp)/3.0;  
    }  
    public int max({int temp,max;   temp=phi>eng?phi:eng;   max=temp>comp?temp:comp;   return max;  }  
    public int min()  {   int temp,min;   temp=phi<eng?phi:eng;   min=temp<comp?temp:comp;   return min;  }  
    public String toString()  { 
          return "学号："+number+" "+super.toString()+"\n平均分:"   +aver()+" 最高分:"+max()+" 最低分： "+min(); 
         } 
}*/

public double aver(){
    return (scoreOfEn+scoreOfHtml+scoreOfJava)/3.0;
}
public double max() {
            double temp,max;
            temp=scoreOfHtml>scoreOfJava?scoreOfHtml:scoreOfJava;
            max=temp>scoreOfEn?temp:scoreOfEn;
    return max;
}
public double min(){
    double temp,min;
    temp=scoreOfEn<scoreOfHtml?scoreOfEn:scoreOfHtml;
    min=temp<scoreOfJava?temp:scoreOfJava;
    return  min;
}

    @Override
    public String toString() {
        return "学号"+getNo()+super.toString()+"\t平均分："+aver()+"\t最高分："+max()+"最低分"+min();
    }
}

