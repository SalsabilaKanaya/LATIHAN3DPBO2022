class Processor{
    private:
        //atribut
        string name;
        int price;

    public:
        //konstruktor
        Processor(){
        }
        
        Processor(string name, int price){
            this->name = name;
            this->price = price;
        }

        //setter
        void setName(string name){
            this->name = name;
        }

        void setPrice(int price){
            this->price = price;
        }

        //getter
        string getName(){
            return this->name;
        }

        int getPrice(){
            return this->price;
        }

        void printProcessor(){
            cout << "Processor~ " << endl;
            cout << "Name  : "<< this->name << endl;
            cout << "Price : Rp "<< this->price << endl;
        }

        //destruktor
        ~Processor(){
        }

};