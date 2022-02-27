class Disk{

    //atribut
    private String type;
    private String capacity;
    private int price;

    Disk(){
    }

    //setter
    public void setType(String type){
        this.type = type;
    }

    public void setCapacity(String capacity){
        this.capacity = capacity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    //getter
    public String getType(){
        return this.type;
    }

    public String getCapacity(){
        return this.capacity;
    }

    public int getPrice(){
        return this.price;
    }

    //prosedur untuk keluaran
    void printDisk(){
        System.out.println ("Disk~ ");
        System.out.println ("Type       : " + this.type);
        System.out.println ("Capacity   : " + this.capacity);
        System.out.println ("Price      : Rp " + this.price);
        }
}