package Model.player_character;

import Model.Entity;

public abstract class PlayerCharacter extends Entity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
