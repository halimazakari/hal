
import employe.Personnel;
import employe.manutention_speciale;
import employe.manutention;


public class Salary {
    public static void main(String[] args){  
        
         
 Personnel per = new Personnel();
per.ajouterEmploye(new manutention_speciale("HALIMA","SADIA","15a412fs",12,2017,5200));
per.ajouterEmploye(new manutention("ZEYNAD","MAHAMAT","11B412FS",52,2010,25050));
per.ajouterEmploye(new production("AHMADOU","TIDJANI","15a412fs",12,2003,51000));
per.ajouterEmploye(new production_speciale("MAMOUDOU","ZAKARI","11D412fs",45,2011,400));
per.ajouterEmploye(new manutention_speciale("MAHAMAT","NOUR","15D412fs",124,2012,5800));
per.ajouterEmploye(new manutention("ALI","NASSOUROU","11E412fs",32,2015,1400));
per.ajouterEmploye(new production("OUMAROU","RAZIL","15a412fs",32,2017,5220));
per.ajouterEmploye(new production_speciale("PARE","KADER","11a412fs",40,2101,2540));


per.afficherSalaire();
System.out.println("Les salaire moyen de cette Entreprise est :" + per.Salaire_moyen());
}   


}

