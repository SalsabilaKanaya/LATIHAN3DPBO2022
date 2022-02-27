<?php 
 
 class Disk{

    //atribut
	private $type;
    private $capacity;
	private $price;
		
	public function __construct(){
	}
		
	//setter getter 
	public function setType($type){
		$this->type = $type;
	}
		
	public function getType(){
		return $this->type;
	}

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
	public function	printDisk(){
        echo "Disk~ <br>";
        echo "Type      : ".$this->type. "<br>";
        echo "Capacity  : ".$this->capacity."<br>";
        echo "Price     : Rp ".$this->price. "<br>";
    }
	function __destruct(){
	}
}
?>

		
		