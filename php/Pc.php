<?php 
 
 class Pc{

    //atribut
	private $totalPrice;
    private Processor() = procObj;

		
	public function __construct(){
	}
	
    //setter getter
	public function setTotalPrice($totalPrice){
		$this->totalPrice = $totalPrice;
	}
		
	public function getTotalPrice(){
		return $this->totalPrice;
	}
	public function	printPc(){
        echo "--------------------------------<br>";
        echo "PC Salsa <br>";
        echo "Total Price   : Rp ".$this->totalPrice. "<br>";

    }
	function __destruct(){
	}
}
?>

		
		