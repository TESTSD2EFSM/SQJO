<?php
  class ClassRecord {
    private $listPlan = [ '0' => ['period' => 20192, 'classId' => 1, 'hours' => 60 ], '1' => ['period' => 20192, 'classId' => 2, 'hours' => 30] ];

    public function getHours( $period, $classId ){
      foreach ($this->listPlan as $key => $value) {
        // $arr[3] será atualizado com cada valor de $arr...
        if( $period == $value['period'] && $classId == $value['classId'] ){
          echo $value['hours'] . "";die;
        }
      }
      echo 0;
    }

    public function insertClassRecord( $period, $classId, $hours, $contentClass ) {

      foreach ($this->listPlan as $key => $value) {
        // $arr[3] será atualizado com cada valor de $arr...
        if( $period == $value['period'] && $classId == $value['classId'] && $contentClass != '' ){
          echo true;die;
        }
      }
      echo false;
      //buscar na lista toda um valor e retornar o hours...
    }
  }
?>