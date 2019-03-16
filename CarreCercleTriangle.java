public classe CarreCercleTriangle{

	public void forme(){
 
        	H h = new H(0,2,1);

        	int [] n = h.hasard();
 
        	switch (n[0]){

            		case 0:
    
 	           		DessinerOval();

            		case 1:
                
		   		DessinerCercle();

            		case 2:
                
		   		DessinerTriangle();
        }

  
        
     }

	

}
