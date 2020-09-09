<?php
  class Teacher {
    private $opt = "exit";


    public function getOpt(){
      return $this->opt;
    }

    public function setOpt( $opt ){
      $this->opt = $opt;
      return $this->opt;
    }
  }
?>