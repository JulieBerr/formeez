public class Accueil extends ListActivity{

	TextView selection;
	String[] items={"Dessiner avec les formes!", "piano", "suite", "Carre Cercle Triangle", "Quizz"};

	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.main);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, items));
		selection=(TextView)findViewById(R.id.selection);}
	
	public void onListItemClick(ListView parent, View v, int position, long id){
		selection.setText(items[position]);
	} 

}
