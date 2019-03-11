public class MainActivity extends Activity {
	
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		private MediaPlayer mPlayer = null;
				private void playSound(int resId){
					if (mPlayer != null){
						mPlayer.stop();
						mPlayer.release();
					}
					mPlayer=MediaPlayer.create(this, resId);
					mPlayer.start();
				}
		
		final ImageButton carre = findViewById(R.id.carre);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				playSound(R.raw.up);
			}
			
		final ImageButton cercle = findViewById(R.id.cercle);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				playSound(R.raw.up);
			}
			
		final ImageButton triangle = findViewById(R.id.triangle);
		carre.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				playSound(R.raw.up);
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


