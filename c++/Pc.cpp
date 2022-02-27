class Pc{
    private:
        //atribut
        int totalPrice;
        Processor procObj;
        Disk diskObj;
        Ram ramObj;
    
    public:
        //konstruktor
        Pc(){
        }
        
        Pc(Processor procObj, Disk diskObj, Ram ramObj){
            this->procObj = procObj;
            this->diskObj = diskObj;
            this->ramObj = ramObj;
            this->totalPrice = this->procObj.getPrice() + this->diskObj.getPrice() + this->ramObj.getPrice();
        }

        //setter 
        void setTotalPrice(int totalPrice){
            this->totalPrice = totalPrice;
        }

        void setProcObj(Processor procObj){
            this->procObj = procObj;
        }
        
        void setDiskObj(Disk diskObj){
            this->diskObj = diskObj;
        }

        void setRamObj(Ram ramObj){
            this->ramObj = ramObj;
        }

        //getter
        int getTotalPrice(){
            return this->totalPrice;
        }

        Processor getProcObj(){
            return this->procObj;
        }

        Disk getDiskObj(){
            return this->diskObj;
        }

        Ram getRamObj(){
            return this->ramObj;
        }

        //method
        void printPc(){
            cout << "--------------------------------" << endl;
            cout << "PC Salsa " << endl;
            cout << "Total Price : Rp " << this->totalPrice << endl;
            cout << endl;
            this->procObj.printProcessor(); 
            cout << endl;
            this->diskObj.printDisk(); 
            cout << endl;
            this->ramObj.printRam();

        }

        //destruktor
        ~Pc(){
        }
};