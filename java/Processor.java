class Processor{

    //atribut
    private String name;
    private int price;

    Processor(){
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    //getter
    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    //prosedur untuk keluaran
    void printProcessor(){
        System.out.println ("Processor~ ");
        System.out.println ("Name       : " + this.name);
        System.out.println ("Price      : Rp " + this.price);
        }
}