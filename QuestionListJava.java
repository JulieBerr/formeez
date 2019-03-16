package CarreTriangleRond;
public class Reponse extends Activity implements View.OnClickListener {

	Button ok;
	Button no;
	TextView question;
	H h = new H(1, 8, 1);
	int [] n = h.hasard();

	String[] AirCercle={ " pi*r*r ", " pi*r ", " 2*pi*r " };
	String[] AirCarre={ " cote*cote ", " cote ", "cote*cote*cote" };
	String[] AirTriangle={" cote * cote / 2 ", " cote * cote ", " cote "};
	String[] RayonCercle={" r ", " 2*r ", " 3*r "};
	String[] Thales = {" division ", " multiplication ", " addition " };
	String[] Pythagore = { " AB*AB=AC*AC + BC*BC ", " AB ", " AC " };
	String[] nCotesT={"3", "2", "4"};
	String[] nCotesR={"4","5","2"};

	@Override
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.main);		

		switch (n[0]) {
		
			case 1: 
				setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, AirCercle));
				question = (TextView)findViewById(R.id.AirCe);
				break;
			case 2: 
				setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, AirCarre));
				question = (TextView)findViewById(R.id.AirCa);
				break;	

			case 3: 
				setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, AirTriangle));
				question = (TextView)findViewById(R.id.AirT);
				break;

			case 4: 
				setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, RayonCercle));
				question = (TextView)findViewById(R.id.Rayon);
				break;
			case 5: 
				setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, Thales));
				question = (TextView)findViewById(R.id.Thales);
				break;
			case 6:
				setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, Pythagore)); 
				question = (TextView)findViewById(R.id.Pythagore);
				break;
			case 7: 
				setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, nCotesT)); 
				question = (TextView)findViewById(R.id.nCoteT);
				break;
			case 8: 
				setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, nCotesR)); 
				question = (TextView)findViewById(R.id.nCotesR);
				break;

		ok=(Button)findViewById(R.id.ok);
		ok.setOnClickListener(this);

		no=(Button)findViewById(R.id.no);
		no.setOnClickListener(this);
						}

	public void onClick(View view){
		if (view=ok && reponse==" pi*r*r " || " cote*cote " || " cote * cote / 2 "  || " r " || " division " || " AB*AB=AC*AC + BC*BC " || " 3 " || " 4 "  ){
			new AlertDialog.Builder(this)
				.setTitle("Juste")
				.setMessage("Ok")
				.setNeutralButton("Fermeture", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dlg, int sumthin){}
				.show();
				}

		if (view=ok && reponse!= " pi*r*r " || " cote*cote " || " cote * cote / 2 "  || " r " || " division " || " AB*AB=AC*AC + BC*BC " || " 3 " || " 4 " ){
			new AlertDialog.Builder(this)
				.setTitle("Faux")
				.setMessage("perdu!")
				.setNeutralButton("Fermeture", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dlg, int sumthin){}
				.show();
				}
		if (view=no && reponse==" pi*r*r " || " cote*cote " || " cote * cote / 2 "  || " r " || " division " || " AB*AB=AC*AC + BC*BC " || " 3 " || " 4 " ){
			new AlertDialog.Builder(this)
				.setTitle("Faux")
				.setMessage("Perdu!")
				.setNeutralButton("Fermeture", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dlg, int sumthin){}
				.show();
				}
		if (view=no && reponse!=" pi*r*r " || " cote*cote " || " cote * cote / 2 "  || " r " || " division " || " AB*AB=AC*AC + BC*BC " || " 3 " || " 4 " ){
			new AlertDialog.Builder(this)
				.setTitle("Juste")
				.setMessage("Ok")
				.setNeutralButton("Fermeture", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dlg, int sumthin){}
				.show();
				}		
					}

}
