package CarreTriangleRond;
public class Dessin extends Activity {
	
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
						DessinerRectangle(context);
						break;
					case "cercle":
						DessinerOval(context);
						break;
					case "triangle":
						DessinerTriangle(context);
						break;
				}
				
			}		
		public void DessinerOval(Context context){
		super(context);

    		int x = 10;
    		int y = 10;
    		int width = 300;
    		int height = 50;

    		drawable = new ShapeDrawable(new OvalShape());
    // If the color isn't set, the shape uses black as the default.
   		drawable.getPaint().setColor(0xff74AC23);
    // If the bounds aren't set, the shape can't be drawn.
    		mDrawable.setBounds(x, y, x + width, y + height);
  
	}
	
	public void DessinerRectangle(Context context){
		 super(context);

   		int x = 10;
   		int y = 10;
    		int width = 300;
    		int height = 50;

    drawable = new ShapeDrawable(new RectShape());
    // If the color isn't set, the shape uses black as the default.
    drawable.getPaint().setColor(0xff74AC23);
    // If the bounds aren't set, the shape can't be drawn.
    mDrawable.setBounds(x, y, x + width, y + height);
  }
	}

	public void DessinerTriangle(Context context){
		Paint p = new Paint();
		p.setStyle(Paint.Style.FILL);

		float[] pts = ((0, 0), (0, 100), (50, 50));

		drawPoints(float[] pts, p);
	}
	
  protected void onDraw(Canvas canvas) {
    mDrawable.draw(canvas);
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


