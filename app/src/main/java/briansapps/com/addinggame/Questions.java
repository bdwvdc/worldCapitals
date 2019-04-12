package briansapps.com.addinggame;

public class Questions {

    public String mQuestions[] = {

            "Which is the first planet in the Solar System",
            "Which is the second planet in the Solar System",
            "Which is the third planet in the Solar System",
            "Which is the fourth planet in the Solar System",
            "Which is the fifth planet in the Solar System",
            "Which is the sixth planet in the Solar System",
            "Which is the seventh planet in the Solar System",
            "Which is the eighth planet in the Solar System",
            "Which is the ninth planet in the Solar System",

    };

    private String mChoices[][] = {

            {"Mercury", "Mars", "Saturn", "Venus", "Earth"},
            {"Jupiter", "Venus", "Saturn", "Neptune", "Earth"},
            {"Earth", "Jupiter", "Saturn", "Moon", "Uranus"},
            {"Mercury", "Uranus", "Mars", "Venus", "Earth"},
            {"Mercury", "Mars", "Saturn", "Jupiter", "Earth"},
            {"Mercury", "Mars", "Saturn", "Venus", ""},
            {"Mercury", "Mars", "Uranus", "Venus", "Earth"},
            {"Mercury", "Mars", "Neptune", "Venus", "Earth"},
            {"Pluto", "Mars", "Saturn", "Venus", "Earth"},

    };

    private String mCorrectAnswers[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

    public String getQuestions(int a) {

        String question = mQuestions[a];
        return question;

    }

    public String getChoice1(int a) {

        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {

        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {

        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {

        String choice = mChoices[a][3];
        return choice;
    }

    public String getChoice5(int a) {

        String choice = mChoices[a][4];
        return choice;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;

    }

}
