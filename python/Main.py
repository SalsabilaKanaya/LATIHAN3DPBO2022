from Processor import Processor
from Disk import Disk
from Ram import Ram
from Pc import Pc

#instansiasi kelas processor 
nameprice = Processor()
nameprice.setName("Intel(R) Pentium(R) CPU 5405U")
nameprice.setPrice(1500000)

#instansiasi kelas disk
tcp = Disk()
tcp.setType("HDD")
tcp.setCapacity("16GB")
tcp.setPrice(500000)

#instansiasi kelas ram 
caprice = Ram()
caprice.setCapacity("4GB")
caprice.setPrice(2000000)

#buat objek kelas pc dan masukan objek kelas processor, disk dan ram 
komputer = Pc(nameprice, tcp, caprice)

komputer.printPc()