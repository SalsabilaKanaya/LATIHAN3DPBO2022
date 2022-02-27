class Ram{

    //atribut
    private String capacity;
    private int price;

    Ram(){
    }

    //setter
    public void setCapacity(String capacity){
        this.capacity = capacity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    //getter
    public String getCapacity(){
        return this.capacity;
    }

    public int getPrice(){
        return this.price;
    }

    //prosedur untuk keluaran
    void printRam(){
        System.out.println ("Ram~ ");
        System.out.println ("Capacity   : " + this.capacity);
        System.out.println ("Price      : Rp " + this.price);
        }
}