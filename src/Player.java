public class player {
    String name;
    Color color;
    int victoryPoints = 0;
    int roadCount = 0;
    int knightsPlayed = 0;
    int sheep = 0;
    int rock = 0;
    int wood = 0;
    int brick = 0;
    int wheat = 0;


    public void buildASettlement(location){
        victoryPoints++;
    }

    public void drawResourceCard(String resource, int amount){
        if(resource == "sheep"){
            sheep++;
        } else if(resource == "rock"){
            rock++;
        } else if(resource == "wood"){
            wood++;
        } else if(resource == "brick"){
            brick++;
        } else if(resource == "wheat"){
            wheat++;
        }
    }

    public void removeResourceCard(String resource, int amount)
        if(resource == "sheep"){
            sheep--;
        } else if(resource == "rock"){
            rock--;
        } else if(resource == "wood"){
            wood--;
        } else if(resource == "brick"){
            brick--;
        } else if(resource == "wheat"){
            wheat--;
        }
    }

    public boolean rob(Player player, String resource){
        if(player.hasResourceCard){
            drawResourceCard(resource, 1);
            player.removeResourceCard(resource);
            return true;
        } else {
            System.out.println(player.name + " does not have this resource card! Choose again");
            return false;
        }
    }

    public boolean hasResourceCard(String resource){
        if(resource == "sheep"){
            return sheep > 0;
        } else if(resource == "rock"){
            return rock > 0;
        } else if(resource == "wood"){
            return wood > 0;
        } else if(resource == "brick"){
            return brick > 0;
        } else if(resource == "wheat"){
            return wheat > 0;
        }
    }

    
}
