
How to view sequencediagram.ecore?
==================================

1. Clone the SEQUENCEDIAGRAM folder
2. In Eclipse, choose "File">"Import..." and select the SEQUENCEDIAGRAM folder
3. Project opens
4. View sequencediagram.ecore by right-clicking the model/efsm.ecore in
   the project panel and selecting "Initialize Ecore Diagram...". 

How to view efsm.ecore?
=======================

1. Clone the EFSM folder
2. In Eclipse, choose "File">"Import..." and select the EFSM folder
3. Project opens
4. View efsm.ecore by right-clicking the model/efsm.ecore in
   the project panel and selecting "Initialize Ecore Diagram...".

How to create a sequence diagram model?
=======================================

1. Clone the sequencediagram.editor folder
2. In Eclipse, choose "File">"Import..." and select the sequencediagram.editor folder
3. Project opens
4. Run the sequencediagram.editor by right-clicking the sequencediagram.editor in
   the project panel and selecting "Run As Eclipse Application".

STEP (a) - How to generate Efsm?
================================

1. Clone the SD2EFSM folder
2. In Eclipse, choose "File">"Import..." and select the SD2EFSM folder
3. Project opens
4. Run the sequencediagram.editor by right-clicking the SequenceDiagram2EFSM.atl in
   the project panel and selecting "Run As ATL transformation".


STEP (b) - How to generate Stubs?
=================================

1. Clone the Sd2Stubs folder
2. In Eclipse, choose "File">"Import..." and select the Sd2Stubs folder
3. Project opens
4. Run the generateStubs.mtl by right-clicking Sd2Stubs/src/Sd2Stubs.main/generateStubs.mtl in
   the project panel and selecting "Run As Launch Acceleo Application".
   
   
STEP (c) - How to generate model class, adapter class, test classe and tests implementaion in JUnit?
====================================================================================================

1. Clone the Efsm2ModelJUnit folder
2. In Eclipse, choose "File">"Import..." and select the Efsm2ModelJUnit folder
3. Project opens
4. Run the generate.mtl by right-clicking the src/Efsm2ModelJUnit.main/generate.mtl in
   the project panel and selecting "Run As Launch Acceleo Application".

STEP (d1) - How to run tests on ModelJUnit and JUnit?
=====================================================

1. Clone the MODELJUNIT folder
2. In Eclipse, choose "File">"Import..." and select the MODELJUNIT folder
3. Project opens
4. Run the ProfessorOnlineTest by right-clicking the src/test/java/ProfessorOnlineTest in
   the project panel and selecting "Run As JUnit Test".
5. Run the ProfessorOnlineJUnit by right-clicking the src/test/java/ProfessorOnlineJUnit in
   the project panel and selecting "Run As JUnit Test".

STEP (d2) - How to run tests on JUnit in implementation?
========================================================
1. Download XAMPP
2. Clone the MODELJUNIT folder
3. Copy MODELJUNIT/src/implementation/profonline folder into xampp/htdocs folder
4. Access localhost in the browser
5. In Eclipse, choose "File">"Import..." and select the MODELJUNIT folder
6. Project opens
7. Run the ProfessorOnlineJUnit by right-clicking the src/implementation/java/test/ProfessorOnlineJUnit in
   the project panel and selecting "Run As JUnit Test".
