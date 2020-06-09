public class Lofbergs extends Coffee {
    Lofbergs(String condition,String pack,double price,int weight){
        super.condition=condition;
        super.pack=pack;
        super.price=price;
        super.weight=weight;
    }

    /*Returns all info*/
    public void name() {
        System.out.println("Löfbergs "+super.condition+" "+super.pack+" - "+super.price+"грн/"+super.weight+"гр");
    }
    /*Returns name,condition and pack*/
    public void GetPackCon() {
        System.out.printf("%-5s%-15s%-5s%-11s%-5s%-11s%-4s", "⎜","Löfbergs","⎜",super.condition,"⎜",super.pack,"⎜");
    }
    /*Returns price*/
    public double GetPrice() {
        return super.price;
    }
    /*Returns weight*/
    public int GetWeight() {
        return super.weight;
    }
}
