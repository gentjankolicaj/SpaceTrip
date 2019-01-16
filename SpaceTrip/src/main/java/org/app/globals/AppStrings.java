package org.app.globals;

import java.util.HashMap;
import java.util.Map;

import org.app.entities.general.LanguageType;
import org.app.entities.general.StringLabel;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class AppStrings {

	/**
	 * 
	 * General app label
	 * 
	 * 
	 */
	public static Map<LanguageType, StringLabel> welcomeMessage = new HashMap<>();
	public static String applicationVersion = "MyManager-v.0.1";
	public static String developer = "Author : Gentjan Kolicaj";
	public static String githubAccount = "Github : https://github.com/gentjankolicaj";
	public static String email = "Email : gentjankolicaj@yahoo.com";

	public static Map<LanguageType, StringLabel> start = new HashMap();
	public static Map<LanguageType, StringLabel> pause = new HashMap();
	public static Map<LanguageType, StringLabel> close = new HashMap();
	public static Map<LanguageType, StringLabel> user = new HashMap();

	public static Map<LanguageType, StringLabel> save =new HashMap();
	public static Map<LanguageType, StringLabel> continueStr =new HashMap();
	public static Map<LanguageType, StringLabel> newGame = new HashMap();

	public static Map<LanguageType, StringLabel> success = new HashMap();
	public static Map<LanguageType, StringLabel> warning = new HashMap();
	public static Map<LanguageType, StringLabel> info = new HashMap();
	public static Map<LanguageType, StringLabel> error = new HashMap();
	public static Map<LanguageType, StringLabel> question = new HashMap();
	
	public static Map<LanguageType,StringLabel> bonus=new HashMap();
	public static Map<LanguageType,StringLabel> bonusAnswerCorrect=new HashMap();

	static {
		
		//welcomeMessage initialization of values
		welcomeMessage.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Hi,Welcome to SpaceTrip."));
		welcomeMessage.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Pershendetje, Mirësevini në SpaceTrip."));
		welcomeMessage.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Ciao, benvenuto su SpaceTrip."));
		welcomeMessage.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Hallo, Willkommen bei SpaceTrip."));
		welcomeMessage.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Bonjour, bienvenue sur SpaceTrip."));

		
    	//======================================================================================
		
		start.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Start"));
		start.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Début"));
		start.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Start"));
		start.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Inizio"));
		start.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Fillo"));
			
		pause.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"pause"));
		pause.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"pusho"));
		pause.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"pausa"));
		pause.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"pause"));
		pause.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"arrêt"));
		
		close.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Close"));
		close.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Cbyll"));
		close.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Chiusi"));
		close.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Schließen"));
		close.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Fermer"));
		
		
	
		user.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"user"));
		user.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"perdorues"));
		user.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"utente"));
		user.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"der benutzer"));
		user.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"l' usager"));
		
	
	 	//======================================================================================
		
		save.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"save"));
		save.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"ruaj"));
		save.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"salvare"));
		save.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"sparen"));
		save.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"enregistrer"));
		
		continueStr.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"continue"));
		continueStr.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"vazhdo"));
		continueStr.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"continua"));
		continueStr.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"fortsetzen"));
		continueStr.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"continuer"));
		
		newGame.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"new game"));
		newGame.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"loje e re"));
		newGame.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"nuovo gioco"));
		newGame.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"neues Spiel"));
		newGame.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"nouveau jeu"));
		
		
		//======================================================================================
		
		success.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Success"));
		success.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Sukses"));
		success.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Successo"));
		success.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Erfolg"));
		success.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Succès"));
		
		warning.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Warning"));
		warning.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Paralajmerim"));
		warning.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Avvertimento"));
		warning.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Warnung"));
		warning.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Attention"));
		
		info.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Information"));
		info.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Informacion"));
		info.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Informazione"));
		info.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"die Informationen"));
		info.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Information"));
		
		error.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Error"));
		error.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Gabim"));
		error.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Errore"));
		error.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Fehler"));
		error.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Erreur"));
		
		
		question.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Question"));
		question.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Pyetje"));
		question.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Domanda"));
		question.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Frage"));
		question.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"La question"));
		
		
	    //======================================================================================
		
		bonus.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Bonus"));
		bonus.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Bonus"));
		bonus.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Indennità"));
		bonus.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Bonus"));
		bonus.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Prime"));
		
		bonusAnswerCorrect.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Correct answer"));
		bonusAnswerCorrect.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Pergjigje e sakte"));
		bonusAnswerCorrect.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Risposta corretta"));
		bonusAnswerCorrect.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Korrekte Antwort"));
		bonusAnswerCorrect.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Bonne réponse"));
		
		
	
	
	
	
	}

}
