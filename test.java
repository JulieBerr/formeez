import com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class test {
    @Test
    public void test {
	    Bundle bundle=null;
        assertThat(Accueil.onCreate(bundle)).isTrue();
	    ListView parent=null;
	    View v=null;
	    int position=0;
	    long id=0;
	assertThat(Accueil.onListItemClick(parent, v, int position, long id).isTrue());
	assertThat(CarreCercleTriangle.forme().isTrue());
	    Context context = null;
	assertThat(CarreCercleTriangle.DessinerRectangle(context).isTrue());
	assertThat(CarreCercleTriangle.DessinerOval(context).isTrue());	  
	assertThat(CarreCercleTriangle.DessinerTriangle(context).isTrue()); 
	assertThat(CarreCercleTriangle.onDraw(canvas).isTrue());
	assertThat(Dessin.onCreate(bundle).isTrue());
	assertThat(son.onCreate(bundle).isTrue());
	assertThat(suite.onCreate(bundle).isTrue());
	//QUIZZ
	assertThat(quizz.Main.isTrue());
	assertThat(Quizz.q.isTrue());
	int id=0;
	DialogInterface dialog = null;
	assertThat(Quizz.OnClick(dialog, id).isTrue());
	assertThat(Quizz.N().isTrue());
    }
	
	
}
