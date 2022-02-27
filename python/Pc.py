from Processor import Processor
from Disk import Disk
from Ram import Ram

class Pc():
    #private members
    procObj = Processor()
    diskObj = Disk()
    ramObj = Ram()
    __totalPrice = 0

    def __init__(self, procObj = Processor(), diskObj = Disk(), ramObj = Ram()):
        self.procObj = procObj
        self.diskObj = diskObj
        self.ramObj = ramObj
    
    #setter getter
    def setTotalPrice(self, totalPrice):
        self.__totalPrice = totalPrice 
    
    def setProcessor(self, procObj):
        self.procObj = procObj 
    
    def setDisk(self, diskObj):
        self.diskObj = diskObj

    def setRam(self, ramObj):
        self.ramObj = ramObj
    
    def getTotalPrice(self):
        return self.__totalPrice

    def getProcessor(self):
        return self.procObj
    
    def getDisk(self):
        return self.diskObj

    def getRam(self):
        return self.ramObj
    
    def jumlah(self):
        return (self.procObj.getPrice + self.diskObj.getPrice + self.ramObj.getPrice)
    
    def printPc(self):
        print("--------------------------------")
        print("PC Salsa ")
        print("Total Price  : Rp %d" % (self.jumlah()))
        print("\n")
        self.procObj.printProcessor()
        print("\n")
        self.diskObj.printDisk()
        print("\n")
        self.ramObj.printRam()