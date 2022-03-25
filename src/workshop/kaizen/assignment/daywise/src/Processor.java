public class Processor {

    public Processor(){}

    String name;
    String company;
    String model;
    double clockFrequency;
    int core;
    String architecture;

    public Processor(String n,String c,String m,double cF,int cr,String atc){
        this.name = n;
        this.company = c;
        this.model = m;
        this.clockFrequency = cF;
        this.core = cr;
        this.architecture = atc;
    }



public void describe(){
    System.out.println(" " + name + " " + company + " " + model + " " + clockFrequency + " " + core + " " + architecture);
}

    public static void main(String[] args) {

        Processor prssr = new Processor();
        prssr.describe();

        Processor pro = new Processor("Ryzen-7","AMD","5800x",4700.00d,8,"x84/64bit");
        pro.describe();

        Processor laptop = new Processor("i3","Intel","10th GEN",4.00d,4,"64bit");
        laptop.describe();


    }
}