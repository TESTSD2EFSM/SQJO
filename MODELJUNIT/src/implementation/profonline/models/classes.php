<?php

class Classes {
    private $listPlan = [ '0' => ['period' => 20192, 'classId' => 1, 'closePlanOk' => 'true' ], '1' => ['period' => 20192, 'classId' => 2, 'closePlanOk' => 'false' ] ];

    public function validateChooseClass( $period, $classId ){
        //var_dump($listPlan);die;

        foreach ($this->listPlan as $key => $value) {
            // $arr[3] será atualizado com cada valor de $arr...
            if( $period == $value['period'] && $classId == $value['classId'] ){
                echo $value['closePlanOk'] . "";die;
            }
        }
        echo "Not Found";
    
    }
}

//incluir buscar na lista toda, e retornar o closePlanOk.

?>