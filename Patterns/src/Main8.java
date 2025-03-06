class Coach {
   public void train() {
        System.out.println("General training session starts");
    }
    public void giveAdvice() {
        System.out.println("General sports advice given");
    }
}

class FootballCoach extends Coach {
   public void train() {
    System.out.println("Football training session starts");
    }
   public void setFormation() {
        System.out.println("Setting up the football team formation");
    }
}

class TennisCoach extends Coach {
    public void train() {
    System.out.println("Tennis training session starts");
    }
    public void coachServeTechnique() {
        System.out.println("Coaching tennis serve technique");
    }
}

public class Main8 {
    public static void main(String[] args) {
       
        Coach coachFootball = new FootballCoach();
        Coach coachTennis = new TennisCoach();
        
        coachFootball.train();
        coachTennis.train();

if (coachFootball instanceof FootballCoach) {
    ((FootballCoach) coachFootball).setFormation();
}
if (coachTennis instanceof TennisCoach) {
    ((TennisCoach) coachTennis).coachServeTechnique();
}
}
}
