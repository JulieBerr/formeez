public class MainActivity extends Activity {
	
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void logo_bouton (View view){
		startActivity (new Intent (this, page_2.class));
	}
	
	protected void onRestart(){
		super.onRestart();
	}
	
	protected void onStart() {
		super.onStart();
	}
	
	protected void onResume() {
		super.onResume();
	}
	
	protected void onPause(){
		super.onPause();
	}
	
	protected void onStop(){
		super.onStop();
	}
	
	protected void onDestroy(){
		super.onDestroy();
	}
}

public class page_2 extends MainActivity{
	
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_2);}
	
		public void logo_bouton_2 (View view){
		startActivity (new Intent (this, MainActivity.class));
	}
	
}

