package Catan;

public class Tile {
    String resource;
    int number;

    public Tile(String resource, int number){
        if(resource.equals("sheep") || resource.equals("rock") || resource.equals("wood") || resource.equals("brick") || resource.equals("wheat")) {
            this.resource = resource;
        } else {
            System.out.println("Invalid resource type");
        }
        this.number = number;
    }
}
