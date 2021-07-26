package org.app.globals;

import java.util.HashMap;
import java.util.Map;

import org.app.entities.general.LanguageType;
import org.app.entities.general.StringLabel;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class AppStrings {
	
	public static Map<LanguageType, StringLabel> welcomeMessage = new HashMap<>();
	public static String applicationVersion = "SpaceTrip";
	public static String developer = "Author : Gentjan Kolicaj";
	public static String githubAccount = "Github : https://github.com/gentjankolicaj";
	public static String email = "Email : gentjankolicaj@yahoo.com";
	

	public static String[] quotes = { "Historia eshte perralle e shkruar nga fitimtaret...(N.Bonaparti)",
			"Dutty is the essence of manhood", "War spares not the brave but the cowardly",
			"Get busy living or get busy dying (Stephen King)",
			"Those who dare to fail miserably can achieve greatly.(John F. Kennedy)",
			"It is hard to fail, but it is worse never to have tried to succeed.(Theodore Roosevelt)",
			"Love is a serious mental disease.(Plato)",
			"If you want to live a happy life, tie it to a goal, not to people or things.(Albert Einstein)",
			"Never let the fear of striking out keep you from playing the game.(Babe Ruth)",
			"Success is how high you bounce when you hit bottom.(George S. Patton)"

	};

	public static Map<LanguageType, StringLabel> start = new HashMap();
	public static Map<LanguageType, StringLabel> pause = new HashMap();
	public static Map<LanguageType, StringLabel> close = new HashMap();
	public static Map<LanguageType, StringLabel> user = new HashMap();

	public static Map<LanguageType, StringLabel> save =new HashMap();
	public static Map<LanguageType, StringLabel> continueStr =new HashMap();
	public static Map<LanguageType, StringLabel> newGame = new HashMap();
	public static Map<LanguageType,StringLabel> gameOver=new HashMap();
	public static Map<LanguageType,StringLabel> gameWinner=new HashMap();


	public static Map<LanguageType, StringLabel> success = new HashMap();
	public static Map<LanguageType, StringLabel> warning = new HashMap();
	public static Map<LanguageType, StringLabel> info = new HashMap();
	public static Map<LanguageType, StringLabel> error = new HashMap();
	public static Map<LanguageType, StringLabel> question = new HashMap();
	
	public static Map<LanguageType,StringLabel> bonus=new HashMap();
	public static Map<LanguageType,StringLabel> bonusAnswerCorrect=new HashMap();
	
	
	public static Map<LanguageType, StringLabel> points = new HashMap();
	public static Map<LanguageType,StringLabel> life=new HashMap();
	public static Map<LanguageType,StringLabel> time=new HashMap();
	public static Map<LanguageType,StringLabel> level=new HashMap();
	
	public static Map<LanguageType, StringLabel> alien= new HashMap();
	public static Map<LanguageType,StringLabel> meteor=new HashMap();
	public static Map<LanguageType,StringLabel> planet=new HashMap();
	
	
	
	

	static {
		
		//welcomeMessage initialization of values
		welcomeMessage.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Hi,Welcome to SpaceTrip."));
		welcomeMessage.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Pershendetje, Miresevini ne SpaceTrip."));
		welcomeMessage.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Ciao, benvenuto su SpaceTrip."));
		welcomeMessage.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Hallo, Willkommen bei SpaceTrip."));
		welcomeMessage.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Bonjour, bienvenue sur SpaceTrip."));

		
    	//======================================================================================
		
		start.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Start"));
		start.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Debut"));
		start.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Start"));
		start.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Inizio"));
		start.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Fillo"));
			
		pause.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"pause"));
		pause.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"pusho"));
		pause.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"pausa"));
		pause.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"pause"));
		pause.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"arret"));
		
		close.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Close"));
		close.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Mbyll"));
		close.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Chiusi"));
		close.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Schliessen"));
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
		
		gameWinner.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"You won."));
		gameWinner.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Ti fitove."));
		gameWinner.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Hai vinto."));
		gameWinner.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Du hast gewonnen."));
		gameWinner.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Tu as gagne."));
		
		
		gameOver.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Game over."));
		gameOver.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Loja mbaroi."));
		gameOver.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Gioco finito."));
		gameOver.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Spiel ist aus."));
		gameOver.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Jeu termine."));
		
		
		//======================================================================================
		
		success.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Success"));
		success.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Sukses"));
		success.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Successo"));
		success.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Erfolg"));
		success.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Succes"));
		
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
		bonus.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Indennita"));
		bonus.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Bonus"));
		bonus.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Prime"));
		
		bonusAnswerCorrect.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Correct answer"));
		bonusAnswerCorrect.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Pergjigje e sakte"));
		bonusAnswerCorrect.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Risposta corretta"));
		bonusAnswerCorrect.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Korrekte Antwort"));
		bonusAnswerCorrect.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Bonne reponse"));
		
		
		
	    //==============================INFO PANEL LABELS========================================================
	
		
		points.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Points : "));
		points.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Piket : "));
		points.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Punti : "));
		points.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Punkte : "));
		points.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Les points : "));
		
		life.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Life : "));
		life.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Jetet : "));
		life.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Vita : "));
		life.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Leben : "));
		life.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"L' vie : "));
		
		
		time.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Elapsed time : "));
		time.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Koha e harxhuar : "));
		time.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Tempo trascorso : "));
		time.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"verstrichene Zeit : "));
		time.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Temps �coul� : "));
		
		level.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Level : "));
		level.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Niveli : "));
		level.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Livello : "));
		level.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"das Niveau : "));
		level.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Niveau : "));
			
		
		alien.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Alien :"));
		alien.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Jashtetokesor :"));
		alien.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Alieno :"));
		alien.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Ausl�nder :"));
		alien.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Extraterrestre :"));
		
		meteor.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Meteor :"));
		meteor.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Meteor :"));
		meteor.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Meteora :"));
		meteor.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Meteor :"));
		meteor.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"M�t�ore :"));
		
		
		planet.put(LanguageType.ENGLISH,new StringLabel(LanguageType.ENGLISH,"Planet :"));
		planet.put(LanguageType.ALBANIAN,new StringLabel(LanguageType.ALBANIAN,"Planet :"));
		planet.put(LanguageType.ITALIAN,new StringLabel(LanguageType.ITALIAN,"Pianeta :"));
		planet.put(LanguageType.GERMAN,new StringLabel(LanguageType.GERMAN,"Planet :"));
		planet.put(LanguageType.FRENCH,new StringLabel(LanguageType.FRENCH,"Plan�te :"));
		
		
		  //======================================================================================
		
	
	
	
	}

}
