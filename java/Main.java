class Main{
    public static void main(String[] args){
        //instansiasi kelas processor
        Processor nameprice;
        nameprice = new Processor();
        nameprice.setName("Intel(R) Pentium(R) CPU 5405U");
        nameprice.setPrice(1500000);

        //instansiasi kelas disk 
        Disk tcp;
        tcp = new Disk();
        tcp.setType("HDD");
        tcp.setCapacity("16GB");
        tcp.setPrice(500000);

        //instansiasi kelas ram 
        Ram caprice;
        caprice = new Ram();
        caprice.setCapacity("4GB");
        caprice.setPrice(2000000);

        //membuat objek kelas Pc dan memasukan objek processors, disk, dan ram ke dalam objek kelas Pc
        Pc komputer = new Pc(nameprice, tcp, caprice);
        
        //keluaran
        komputer.printPc();
    }
}