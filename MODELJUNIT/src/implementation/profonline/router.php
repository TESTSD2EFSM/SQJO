<?php

require './models/user.php';
require './models/plan.php';
require './models/classRecord.php';
require './models/classes.php';
require './models/teacher.php';
require './models/professorOnline.php';

  class Router {
    //get list of entitys
    private $entitys = [ 'user' => 'User', 'plan' => 'Plan', 'classRecord' => 'ClassRecord' ];

    public function requestRouter( $requestData ) {
      if( $requestData['REQUEST_METHOD'] == 'GET' ){
        $params = $requestData['REQUEST_PARAMS'];

        if( array_key_exists( 'entity', $params ) ){
          //check is entity is permited...
          $this->routerByClass( $params['entity'], $params );
        }else{
          echo '{"access":true, "method":"GET", "error": "Entity param is empty." }';die;
        }

      }
        //var_dump($_GET);die;
        //echo '{"access":true, "method":"GET", "params":' .$params. '}';die;
    }

    //routers by Class
    private function routerByClass( $entity, $params ){
      if( array_key_exists( 'action', $params ) ){
        switch( $entity ){
          case 'user':
            $user = New User();
            if( $params['action'] == 'login' && array_key_exists('mat', $params) && array_key_exists('psw', $params) ){
              $user->login( $params['mat'], $params['psw'] );
            }else {
              echo '{"access":true, "method":"GET", "error": "This action not supported" }';die;
            }
            break;
          case 'plan':
            $plan = new Plan();

            if( $params['action'] == 'getPlan' && array_key_exists('period', $params) && array_key_exists('classId', $params) ){
              $plan->getPlan( $params['period'], $params['classId'] );

            }else if( $params['action'] == 'insertPlan'  && array_key_exists('period', $params) && array_key_exists('classId', $params) && array_key_exists('contentPlan', $params) ){
              $plan->insertPlan( $params['period'], $params['classId'], $params['contentPlan'] );
            }else {
              echo '{"access":true, "method":"GET", "error": "This action not supported" }';die;
            }

            break;
          case 'classRecord':
            $classRecord = new ClassRecord();

            if( $params['action'] == 'insertClassRecord' && array_key_exists('period', $params) && array_key_exists('classId', $params) && array_key_exists('hours', $params) && array_key_exists('contentClass', $params) ){
              $classRecord->insertClassRecord( $params['period'], $params['classId'], $params['hours'], $params['contentClass'] );
            }else if( $params['action'] == 'getHours' && array_key_exists('period', $params) && array_key_exists('classId', $params) ){
              $classRecord->getHours( $params['period'], $params['classId'] );
            }else {
              echo '{"access":true, "method":"GET", "error": "This action not supported" }';die;
            }
            
            break;
          case 'classes':
            $classes = new Classes();

            if( $params['action'] == 'validateChooseClass' && array_key_exists('period', $params) && array_key_exists('classId', $params) ){
              $classes->validateChooseClass( $params['period'], $params['classId'] );
            }else {
              echo '{"access":true, "method":"GET", "error": "This action not supported" }';die;
            }
            
            break;
          case 'professorOnline':
            //$professorOnline = new ProfessorOnline();

            if( $params['action'] == 'enterOption' && array_key_exists('opt', $params) ){
              $teacher->setOpt( $params['opt'] );
              echo $professorOnline->enterOption( $params['opt'] );
            }else {
              echo '{"access":true, "method":"GET", "error": "This action not supported" }';die;
            }
            
            break;
          case 'teacher':
            //$teacher = new Teacher();

            if( $params['action'] == 'getOpt' && array_key_exists('opt', $params) ){
              echo $teacher->getOpt( $params['opt'] );
            }else if( $params['action'] == 'setOpt' ){
              echo $teacher->setOpt( $params['opt'] );
            }else {
              echo '{"access":true, "method":"GET", "error": "This action not supported" }';die;
            }
              
            break;

          default:
            echo '{"access":true, "method":"GET", "error": "This entity not permited" }';die;
            break;
        }
      }else{
        echo '{"access":true, "method":"GET", "error": "Param ACTION not found." }';die;
      }
    }

  }

?>