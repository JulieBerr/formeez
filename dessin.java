package CarreTriangleRond;
public class MainActivity extends Activity {
	
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		public String forme="";
		
		final ImageButton blanc = findViewById(R.id.blanc);
		blanc.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				switch (forme) {
					case "carre":
						draw(R.carre);
						break;
					case "cercle":
						draw(R.cercle);
						break;
					case "triangle":
						draw(R.triangle);
						break;
				}
				
			}		
		
		final ImageButton carre = findViewById(R.id.carre);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				forme="carre";
			}
			
		final ImageButton cercle = findViewById(R.id.cercle);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				forme="cercle";
			}
			
		final ImageButton triangle = findViewById(R.id.triangle);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				forme="triangle";
			}
		}
	}
	
	protected void onStop(){
		super.onStop();
	}
	
	protected void onDestroy(){
		super.onDestroy();
	}
}


