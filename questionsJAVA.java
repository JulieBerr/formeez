package CarreTriangleRond;
public class Reponse extends Activity implements View.OnClickListener {

	Button ok;
	Button no;
	TextView question;
	String reponse = {"oui", "oui", "oui", "oui", "non", "oui", "oui", "oui"  };
	H h = new H(1, 8, 1);
	int [] n = h.hasard();

	@Override
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.main);		

		switch (n[0]) {
		
			case 1: 
				question = (TextView)findViewById(R.id.pytha);
				break;
			case 2: 
				question = (TextView)findViewById(R.id.droit);
				break;	

			case 3: 
				question = (TextView)findViewById(R.id.TroisCotes);
				break;

			case 4: 
				question = (TextView)findViewById(R.id.QuattreCotes);
				break;
			case 5: 
				question = (TextView)findViewById(R.id.Cercle);
				break;
			case 6: 
				question = (TextView)findViewById(R.id.Points);
				break;
			case 7: 
				question = (TextView)findViewById(R.id.CotesImpairs);
				break;
			case 8: 
				question = (TextView)findViewById(R.id.rayon);
				break;

		ok=(Button)findViewById(R.id.ok);
		ok.setOnClickListener(this);

		no=(Button)findViewById(R.id.no);
		no.setOnClickListener(this);
						}

	public void onClick(View view){
		if (view=ok && reponse[n[0]]=="oui" ){
			new AlertDialog.Builder(this)
				.setTitle("Juste")
				.setMessage("Ok")
				.setNeutralButton("Fermeture", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dlg, int sumthin){}
				.show();
				}

		if (view=ok && reponse[n[0]]=="non" ){
			new AlertDialog.Builder(this)
				.setTitle("Faux")
				.setMessage("perdu!")
				.setNeutralButton("Fermeture", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dlg, int sumthin){}
				.show();
				}
		if (view=no && reponse[n[0]]=="oui" ){
			new AlertDialog.Builder(this)
				.setTitle("Faux")
				.setMessage("Perdu!")
				.setNeutralButton("Fermeture", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dlg, int sumthin){}
				.show();
				}
		if (view=no && reponse[n[0]]=="non" ){
			new AlertDialog.Builder(this)
				.setTitle("Juste")
				.setMessage("Ok")
				.setNeutralButton("Fermeture", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dlg, int sumthin){}
				.show();
				}		
					}

}
