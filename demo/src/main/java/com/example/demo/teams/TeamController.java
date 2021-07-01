package com.example.demo.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/team")
@CrossOrigin("*")
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<Team> getTeams(){
        return teamService.getTeams();

    }
    @PostMapping
    public void registerNewTeam(@RequestBody Team team){
        teamService.addNewTeam(team);
    }




}
