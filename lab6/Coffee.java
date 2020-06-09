public class Coffee {
    String condition = "";
    String pack = "";
    double price = 0;
    int weight = 0;

    /*Returns all info*/
    public void name() {
        System.out.println("Кава" + condition + " " + pack + " - " + price + "грн/" + weight + "гр");
    }
    /*Returns name,condition and pack*/
    public void GetPackCon() {
        System.out.println("Кава" + condition + " " + pack);
    }
    /*Returns price*/
    public double GetPrice() {
        return price;
    }
    /*Returns weight*/
    public int GetWeight() {
        return weight;
    }


}
