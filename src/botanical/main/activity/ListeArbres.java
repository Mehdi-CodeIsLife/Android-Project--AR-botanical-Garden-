package botanical.main.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gp1androidproject.R;


public class ListeArbres extends Activity
{
	
	public static final String[] titles = new String[] { 
		   "Charme",
           "Erable peau serpent", 
           "H�tre Corse",
           "Platane d'Orient",
           "Rosier ch�taigne"
           
           /*
           "Peuplier noir", 
           "Pin deFau Fayard",
           "Mahonia de Beal", 
           "Forsythia blanc",
           "Bois de fer",
           "Podocarpe des Andes", 
           "H�tre Rouge", 
           "Gincko",
           "Petit Houx / Fragon",
           "Saule Pleureur Piquont", 
           "Arbre aux mouchoirs", 
           "Paulownia / Cypr�s",
           "Kolwitzia "
           */
	
	};

    public static final String[] descriptions = new String[] {
           "Les charmes constituent un genre d'arbres et d'arbustes de la famille des B�tulac�es (sous-famille des Corylo�d�es) des r�gions temp�r�es de l'h�misph�re nord, d'Asie mineure et d'Europe. Ce genre (Carpinus) compte une trentaine d'esp�ces. Une for�t constitu�e principalement de charmes est appel�e une charmaie ou une charmeraie. ",
           "Le nom �rable � peau de serpent est un nom g�n�rique donn� � diff�rentes esp�ces d'�rable en raison de leur �corce stri�e. Certaines de ces esp�ces sont aussi appel�es '�rable jasp�' (car leur �corce ressemble �galement au jaspe). Ces �rables appartiennent � la section Macrantha de la classification des �rables et sont tous originaires d'Asie � l'exception de Acer", 
           "Le H�tre commun (Fagus sylvatica), couramment d�sign� simplement comme le H�tre et parfois appel� fayard est une esp�ced'arbre � feuilles caduques, indig�ne d'Europe, appartenant � la famille des Fagaceae, tout comme le ch�ne et le ch�taignier",
           "Le platane d'Orient est une esp�ce d'arbre de la famille des Platanac�es utilis�e comme arbre d'ornement. Cette esp�ce anciennement introduite en Europe occidentale a �t� supplant�e par le platane commun",
           "Le rosier ch�taigne (Rosa roxburghii) est une esp�ce de rosier, class� dans le sous-genre Platyrhodon, originaire de Chine"
           
           /*
           "Le Peuplier noir est un grand arbre pouvant atteindre 30 � 35 m de hauteur1 et dont la long�vit� est importante (200 ans, voire jusqu'� environ 400 ans pour les sp�cimens les plus �g�s. Les formes varient beaucoup selon le contexte, en particulier selon que l'arbre ait pouss� seul et isol�.",
           "D�coratif par son feuillage persistant et par sa superbe floraison en grappes compactes, il illumine les endroits peu ensoleill�s et s�utilise en massif, groupe, isol�, haie basse, rocaille, bordure ou peut �tre cultiv� en bac dans lequel il se comportera tr�s bien.",
           "Cet arbrisseau atteint 1 � 2 m�tres de haut. Les feuilles sont oppos�es, simples, longues de 6 � 10 cm pour 4 � 4,5 cm de large et pubescentes sur les deux faces. Les fleurs blanches apparaissent au d�but du printemps avant l'apparition des nouvelles feuilles. Elles ont un p�tale compos� de quatre lobes et font environ 1 cm de long. Les fruits sont ronds, ail�s et ont un diam�tre de 2 �3 cm.",
           "Bois de fer est le nom ou le surnom donn� localement � diverses esp�ces d'arbres � travers le monde ou au bois que ces arbres produisent le ga�ac, bois produit par des arbres du genre Guaiacum : Guaiacum officinale ou Guaiacum sanctum ",
           "Les Podocarpaceae ('Podocarpac�es') sont une famille de conif�res qui compte 185 esp�ces r�parties en 18 genres ",
           "Le h�tre � grandes feuilles est un arbre de taille moyenne pouvant atteindre 25 m de hauteur. Son tronc est droit et sa cime est large. Ses racines sont tr�s �tal�es.L'�corce est mince et lisse, de couleur gris bleu p�le. Il reste lisse avec l'�ge mais devient plus fonc�1. Les feuilles sont ovales et mesurent de 6 � 14 cm. Elles sont simples, alternes et dent�es grossi�rement. Elles sont cireuses et rigides au toucher. Elles sont divis�es par 9 � 14 nervures rectilignes et parall�les de chaque c�t�. Le dessus est de couleur vert satin� et le dessous plus p�le. Les feuilles des petits arbres et des branches inf�rieures des arbres forestiers matures s'ass�chent � l'automne et restent sur l'arbre tout l'hiver", 
           "Le Ginkgo biloba ou � arbre aux quarante �cus � ou � arbre aux mille �cus � est la seule esp�ce actuelle de la famille des Ginkgoaceae. Il est la seule esp�ce actuelle de la division des ginkgophyta. On en conna�t sept autres esp�ces maintenant fossiles et le ginkgo est consid�r� comme une forme panchronique (dite aussi, en termes plus communs, fossile vivant). C'est la plus ancienne famille d'arbres connue, puisqu'elle serait apparue il y a plus de 270 millions d'ann�es. Elle existait d�j� une quarantaine de millions d'ann�es avant l'apparition des dinosaures.",
           "Le fragon faux houx ou petit-houx (Ruscus aculeatus) est un arbuste dio�que de la famille des Asparagaceae (ou des Liliaceae, selon la classification classique) poussant dans l'aire m�diterran�enne-atlantique",
           "Le saule (Salix) est un genre d'arbres, d'arbustes, d'arbrisseaux de la famille des Salicac�es (Salicaceae). Il comprend 360esp�ces environ, r�parties � travers le monde, principalement dans les zones fra�ches et humides des r�gions temp�r�es et froides de l'h�misph�re nord",
           "Davidia involucrata, aussi appel� arbre aux mouchoirs, � cause de ses larges bract�es blanches, est un arbre de la famille desNyssaceae originaire de Chine. La plante a �t� d�couverte en 1869 par le missionnaire botaniste fran�ais Jean-Pierre Armand David(1826-1900). Sa premi�re introduction en France a �t� effectu�e en 1897",
           "Le kamon , est un insigne h�raldique initialement utilis� par les clans de samoura�s pour se reconna�tre plus facilement sur les champs de bataille. Ils sont g�n�ralement sous forme de dessins stylis�s � l'int�rieur d'une forme g�om�trique. Leur utilisation remonte � l'�poque Kamakura. Durant l'�poque d'Edo, seuls les daimyos avaient le droit d'en poss�der deux � la fois. D�s le d�but de l'�re Meiji, leur utilisation se r�pandit parmi le peuple",
           "Kolkwitzia amabilis est un arbuste de la famille des Caprifoliaceae selon la classification classique, ou des Linnaeaceae selon laclassification phylog�n�tique. C'est la seule esp�ce accept�e � l'heure actuelle du genre Kolkwitzia"
           */
    };


   public static final Integer[] images = 
	   { 
	   
	   R.drawable.charme,
	   R.drawable.erablepeauserpent,
	   R.drawable.hetrecorse,
	   R.drawable.plataneorient,
	   R.drawable.rosierchataignier
	   
	   /*
	    * 	   R.drawable.pinfaufayard,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient,
	   R.drawable.plataneorient�
	   
	   */
	   };

   ListView listView;
   List<RowItem> rowItems;

	
	//----------------------------------------------------------------------
	//Tarik 02/05/2013:onCreate [Lancement ListeArbres]
	//----------------------------------------------------------------------
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listearbres);
		
		
		rowItems = new ArrayList<RowItem>();
	       for (int i = 0; i < titles.length; i++) {
	           RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
	           rowItems.add(item);
	       }

	       listView = (ListView) findViewById(R.id.treesList);
	       CustomListViewAdapter adapter = new CustomListViewAdapter(this,
	               R.layout.activity_listitem, rowItems);
	       listView.setAdapter(adapter);
	       listView.setOnItemClickListener(new OnItemClickListener() {
	    	    public void onItemClick(AdapterView<?> parent, View view,int position, long id) 
	    	    {
	    	          Toast.makeText(getApplicationContext(), ((TextView) view).getText(),Toast.LENGTH_SHORT).show();
	            }
	        });	
		
	}
}
