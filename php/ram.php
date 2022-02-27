<?php 
 
 class Ram{

    //atribut
    private $capacity;
	private $price;
		
	public function __construct(){
	}
		
	//setter getter 
    public function setCapacity($capacity){
		$this->capacity = $capacity;
	}

    public function getCapacity(){
		return $this->capacity;
	}
		
	public function setPrice($price){
		$this->price = $price;
	}
		
	public function getPrice(){
		return $this->price;
	}
	public function	printRam(){
        echo "Ram~ <br>";
        echo "Capacity  : ".$this->capacity."<br>";
        echo "Price     : Rp ".$this->price. "<br>";
    }
	function __destruct(){
	}
}
?>

		
		