class Pc{

    //atribut
    private int totalPrice;
    private Processor procObj;
    private Disk diskObj;
    private Ram ramObj;

    Pc(){
    }

    public Pc(Processor procObj, Disk diskObj, Ram ramObj){
		this.procObj = procObj;
		this.diskObj = diskObj;
        this.ramObj = ramObj;
        this.totalPrice = this.procObj.getPrice() + this.diskObj.getPrice() + this.ramObj.getPrice();
	}

    //setter
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    public void setProcObj(Processor procObj){
        this.procObj = procObj;
    }
        
    public void setDiskObj(Disk diskObj){
        this.diskObj = diskObj;
    }

    public void setRamObj(Ram ramObj){
        this.ramObj = ramObj;
    }

    //getter
    public int getTotalPrice(){
        return this.totalPrice;
    }

    public Processor getProcObj(){
        return this.procObj;
    }

    public Disk getDiskObj(){
        return this.diskObj;
    }

    public Ram getRamObj(){
        return this.ramObj;
    }

    //prosedur untuk keluaran
    void printPc(){
        System.out.println ("--------------------------------");
        System.out.println ("PC Salsa ");
        System.out.println ("Total Price : Rp" + this.totalPrice);
        System.out.println ("\n");
        this.procObj.printProcessor();
        System.out.println ("\n");
        this.diskObj.printDisk(); 
        System.out.println ("\n");
        this.ramObj.printRam();
        }
}