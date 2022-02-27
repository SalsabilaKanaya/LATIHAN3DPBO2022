<?php 
 
 class Processor{

    //atribut
	private $name;
	private $price;
		
	public function __construct(){
	}
		
		
	public function setName($name){
		$this->name = $name;
	}
		
	public function getName(){
		return $this->name;
	}
		
	public function setPrice($price){
		$this->price = $price;
	}
		
	public function getPrice(){
		return $this->price;
	}
	public function	printProcessor(){
        echo "Processor~ <br>";
        echo "Name  : ".$this->name. "<br>";
        echo "Price : Rp ".$this->price. "<br>";
    }
	function __destruct(){
	}
}
?>

		
		