class Ram{
    private:
        //atribut
        string capacity;
        int price;

    public:
        //konstruktor
        Ram(){
        }
        
        Ram(string capacity, int price){
            this->capacity = capacity;
            this->price = price;
        }

        //setter

        void setCapacity(string capacity){
            this->capacity = capacity;
        }

        void setPrice(int price){
            this->price = price;
        }

        //getter
        string getCapacity(){
            return this->capacity;
        }

        int getPrice(){
            return this->price;
        }

        void printRam(){
            cout << "Ram~ " << endl;
            cout << "Capacity  : "<< this->capacity << endl;
            cout << "Price     : "<< this->price << endl;
        }

        //destruktor
        ~Ram(){
        }

};