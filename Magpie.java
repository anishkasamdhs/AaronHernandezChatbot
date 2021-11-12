public class Magpie {
	public String getGreeting() {
		return "Hello I am the Aaron Hernandez chatbot, let's hang out.";
	}
	
	public String getResponse(String statement) {
		String response = "";
		if (statement.length() == 0) {
			response = "Say something, please.";
		}
    else if (findKeyword(statement, "hi") >= 0 || findKeyword(statement, "hey") >= 0 || findKeyword(statement, "hello") >= 0 || findKeyword(statement, "greetings") >= 0 || findKeyword(statement, "whats up") >= 0 || findKeyword(statement, "salutations") >= 0 || findKeyword(statement, "good morning") >= 0 || findKeyword(statement, "good evening") >= 0 || findKeyword(statement, "good afternoon") >= 0) {
      response = "Hey man, how's it going, what's your favorite sport?";
    }
    else if (findKeyword(statement, "basketball") >= 0 || findKeyword(statement, "soccer") >= 0 || findKeyword(statement, "golf") >= 0 || findKeyword(statement, "volleyball") >= 0 || findKeyword(statement, "track") >= 0 || findKeyword(statement, "cross country") >= 0 || findKeyword(statement, "lacrosse") >= 0 || findKeyword(statement, "swimming") >= 0 || findKeyword(statement, "cricket") >= 0 || findKeyword(statement, "chess") >= 0) {
      response = "Those sports are all boring :(. You should watch football. Next time when I ask you what your favorite sport is, say football! \nWhat's your favorite sport?";
    }
    else if (findKeyword(statement, "football") >= 0) {
      response = "What's your favorite NFL team?";
    }
    else if (findKeyword(statement, "jags") >= 0 || findKeyword(statement, "jacksonville") >= 0 || findKeyword(statement, "jaguars") >= 0 || findKeyword(statement, "jacksonville jaguars") >= 0) {
      response = "The Jaguars! Urban Meyer should be fired!";
    }
    else if (findKeyword(statement, "steelers" ) >= 0  || findKeyword(statement, "pittsburgh") >= 0 || findKeyword(statement, "pittsburgh steelers") >= 0) {
      response = "Big Ben needs to retire";
    }
    else if (findKeyword(statement, "ravens") >= 0  || findKeyword(statement, "baltimore") >= 0 || findKeyword(statement, "baltimore ravens") >= 0) {
      response = "You have a running back at QB!";
    }
    else if (findKeyword(statement, "colts") >= 0  || findKeyword(statement, "indianapolis") >= 0 || findKeyword(statement, "indianapolis colts") >= 0) {
      response = "Jonathan Taylor is really good!";
    }
    else if (findKeyword(statement, "texans") >= 0  || findKeyword(statement, "houston") >= 0 || findKeyword(statement, "houston texans") >= 0) {
      response = "I'm sorry";
    }
    else if (findKeyword(statement, "titans") >= 0  || findKeyword(statement, "tennessee") >= 0 || findKeyword(statement, "tennessee titans") >= 0) {
       response = "First in the division!";
    }
    else if (findKeyword(statement, "patriots") >= 0  || findKeyword(statement, "new england") >= 0 || findKeyword(statement, "pats") >= 0 || findKeyword(statement, "new england pats") >= 0 || findKeyword(statement, "new england patriots") >= 0) {
        response = "I would kill to play for them again!";
    }
    else if (findKeyword(statement, "bills") >= 0  || findKeyword(statement, "buffalo") >= 0 || findKeyword(statement, "buffalo bills") >= 0) {
       response = "Bills mafia!";
    }
    else if (findKeyword(statement, "jets") >= 0  || findKeyword(statement, "new york") >= 0 || findKeyword(statement, "new york jets") >= 0) {
      response = "Excuse me? Did I hear that correctly? Let me ask the question again? \nWhat's your favorite football team?";
    }
    else if (findKeyword(statement, "dolphins") >= 0  || findKeyword(statement, "miami") >= 0 || findKeyword(statement, "miami dolphins") >= 0) {
       response = "You guys have a great defense!";
    }
    else if (findKeyword(statement, "broncos") >= 0  || findKeyword(statement, "denver") >= 0 || findKeyword(statement, "denver broncos") >= 0) {
      response = "Everything went downhill after Peyton retired.";
    }
    else if (findKeyword(statement, "chiefs") >= 0  || findKeyword(statement, "kansas city") >= 0 || findKeyword(statement, "kansas city chiefs") >= 0) {
      response = "Your team needs a new defense." ;
    }
    else if (findKeyword(statement, "chargers") >= 0  || findKeyword(statement, "los angeles chargers") >= 0 || findKeyword(statement, "la chargers") >= 0) {
      response = "Egghead Ekeler";
    }
    else if (findKeyword(statement, "bengals") >= 0  || findKeyword(statement, "cincinnati") >= 0 || findKeyword(statement, "cincinnati bengals") >= 0) {
       response = "Jamarr Chase ROTY!";
    }
    else if (findKeyword(statement, "raiders") >= 0  || findKeyword(statement, "las vegas") >= 0 || findKeyword(statement, "las vegas raiders") >= 0) {
       response = "Carl Nassib is an inspiration";
    }
    else if (findKeyword(statement, "seahawks") >= 0 || findKeyword(statement, "seattle") >= 0 || findKeyword(statement, "seattle seahawks") >= 0) {
      response = "Wow a seahawks fan in the Bay Area, that's rare. It was very unfortunate that Russell Wilson hurt his hand.";
    }
    else if (findKeyword(statement, "niners") >= 0 || findKeyword(statement, "san francisco") >= 0 || findKeyword(statement, "49ers") >= 0) {
      response = "Great choice we love the niners";
    }
    else if (findKeyword(statement, "rams") >= 0 || findKeyword(statement, "la rams") >= 0 || findKeyword(statement, "los angeles rams") >= 0) {
      response = "I could not believe it when I saw Odell Beckham Jr. signed with the Rams!";
    }
    else if (findKeyword(statement, "cardinals") >= 0 || findKeyword(statement, "arizona") >= 0 || findKeyword(statement, "arizona cardinals") >= 0) {
      response = "Kyler Murray is a midget!";
    }
    else if (findKeyword(statement, "packers") >= 0 || findKeyword(statement, "green bay") >= 0 || findKeyword(statement, "green bay packers") >= 0) {
      response = "Did you know that Aaron Rodgers did not get the vaccine and got COVID-19?";
    }
    else if (findKeyword(statement, "bears") >= 0 || findKeyword(statement, "chicago") >= 0 || findKeyword(statement, "chicago bears") >= 0) {
      response = "#FreeArob Justin Fields is a bust. :(";
    }
    else if (findKeyword(statement, "vikings") >= 0  || findKeyword(statement, "minnesota") >= 0 || findKeyword(statement, "minnesota vikings") >= 0) {
      response = "Justin Jefferson should've won rookie of the year over Justin Herbert!";
    }
    else if (findKeyword(statement, "lions") >= 0  || findKeyword(statement, "detroit") >= 0 || findKeyword(statement, "detroit lions") >= 0) {
      response = "Dan Campbell is a great coach!";
    }
    else if (findKeyword(statement, "giants") >= 0  || findKeyword(statement, "new york") >= 0 || findKeyword(statement, "new york giants") >= 0) {
      response = "Saquon has really nice quads doesn't he? ;)";
    }
    else if (findKeyword(statement, "eagles") >= 0  || findKeyword(statement, "philadelphia") >= 0 || findKeyword(statement, "philadelphia eagles") >= 0) {
      response = "Imagine passing up on DK Metcalf for JJ Arcega-Whiteside.";
    }
    else if (findKeyword(statement, "cowboys") >= 0  || findKeyword(statement, "dallas") >= 0 || findKeyword(statement, "dallas cowboys") >= 0) {
      response = "The Cowboys really stepped it up this year! Dak Prescott and Ceedee Lamb are a deadly connection!";
    }
    else if (findKeyword(statement, "washington football team") >= 0  || findKeyword(statement, "wft") >= 0 || findKeyword(statement, "washington") >= 0) {
      response = "Imagine not having a mascot";
    }
    else if (findKeyword(statement, "saints") >= 0  || findKeyword(statement, "new orleans") >= 0 || findKeyword(statement, "new orleans saints") >= 0) {
      response = "Michael Thomas is out for the season. :(";
    }
    else if (findKeyword(statement, "panthers") >= 0  || findKeyword(statement, "carolina") >= 0 || findKeyword(statement, "carolina panthers") >= 0) {
      response = "Cam Newton is back!! *dabs*";
    }
    else if (findKeyword(statement, "falcons") >= 0  || findKeyword(statement, "atlanta") >= 0 || findKeyword(statement, "atlanta falcons") >= 0) {
      response = "Cordarelle Patterson is the best player on the Falcons.";
    }
    else if (findKeyword(statement, "bucs") >= 0  || findKeyword(statement, "tampa") >= 0 || findKeyword(statement, "tampa bay") >= 0  || findKeyword(statement, "buccaneers") >= 0 || findKeyword(statement, "tampa bay buccaneers") >= 0) {
      response = "Brady kisses his children, what are your thoughts on that?";
    }
		else if (findKeyword(statement, "no") >= 0) {
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "I want to", 0) >= 0) {
			response = transformIWantToStatement(statement);
		}
		else {
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0) {
				response = transformYouMeStatement(statement);
			}
			else {
				response = getRandomResponse(statement);
			}
		}
		return response;
	}
	
	private String transformIWantToStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
	}

	private String transformYouMeStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement
					.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}
	
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		while (psn >= 0) {
			String before = " ", after = " "; 
			if (psn > 0) {
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0)) && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0))) {
				return psn;
			}
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);	
		}
		return -1;
	}
	
	private int findKeyword(String statement, String goal) {
		return findKeyword (statement, goal, 0);
	}
	
	private String getRandomResponse(String statement) {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0) {
			response = "Huh? What does this mean?";
		}
		else if (whichResponse == 1) {
			response = "What does: "  + statement + " mean?";
		}
		else if (whichResponse == 2) {
			response = "I am confused :(";
		}
		else if (whichResponse == 3) {
			response = "?????";
		}
		return response;
	}
}
