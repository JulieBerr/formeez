public class MainActivity extends Activity {
	
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ImageButton carre = findViewById(R.id.carre);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				draw(R.carre);
			}
			
		final ImageButton cercle = findViewById(R.id.cercle);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				draw(R.cercle);
			}
			
		final ImageButton triangle = findViewById(R.id.triangle);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				playSound(R.triangle);
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


