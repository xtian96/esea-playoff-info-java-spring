package com.example.demo.teams;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table
public class Team {

    @Id
    @SequenceGenerator(
            name = "team_sequence",
            sequenceName = "team_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "team_sequence"
    )
    private long id;
    @Column(nullable = true)
    private int wins;
    @Column(nullable = true)
    private int losses;
    @Column(nullable = true)
    private int roundWins;
    @Column(nullable = true)
    private int roundLosses;
    private String division;
    private String teamName;

    public Team() {
    }

    public Team(long id, int wins, int losses, int roundWins, int roundLosses, String division, String teamName) {
        this.id = id;
        this.wins = wins;
        this.losses = losses;
        this.roundWins = roundWins;
        this.roundLosses = roundLosses;
        this.division = division;
        this.teamName = teamName;
    }

    public Team(int wins, int losses, int roundWins, int roundLosses, String division, String teamName) {
        this.wins = wins;
        this.losses = losses;
        this.roundWins = roundWins;
        this.roundLosses = roundLosses;
        this.division = division;
        this.teamName = teamName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getRoundWins() {
        return roundWins;
    }

    public void setRoundWins(int roundWins) {
        this.roundWins = roundWins;
    }

    public int getRoundLosses() {
        return roundLosses;
    }

    public void setRoundLosses(int roundLosses) {
        this.roundLosses = roundLosses;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", wins=" + wins +
                ", losses=" + losses +
                ", roundWins=" + roundWins +
                ", roundLosses=" + roundLosses +
                ", division='" + division + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
