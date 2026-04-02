class Match {
    String team1, team2;
    int overs;

    Match(String t1, String t2, int o) {
        team1 = t1;
        team2 = t2;
        overs = o;
    }

    void display() {
        System.out.println("Match: " + team1 + " vs " + team2 + ", Overs: " + overs);
    }
}

class CricketMatch extends Match {
    int score1, score2;

    CricketMatch(String t1, String t2, int o, int s1, int s2) {
        super(t1, t2, o);
        score1 = s1;
        score2 = s2;
    }

    void result() {
        display();
        if (score1 > score2) System.out.println(team1 + " wins!");
        else if (score2 > score1) System.out.println(team2 + " wins!");
        else System.out.println("Match Tied!");
    }

    public static void main(String[] args) {
        String t1 = args.length > 0 ? args[0] : "India";
        String t2 = args.length > 1 ? args[1] : "Australia";
        int ov = args.length > 2 ? Integer.parseInt(args[2]) : 20;
        int s1 = args.length > 3 ? Integer.parseInt(args[3]) : 185;
        int s2 = args.length > 4 ? Integer.parseInt(args[4]) : 172;
        new CricketMatch(t1, t2, ov, s1, s2).result();
    }
}
