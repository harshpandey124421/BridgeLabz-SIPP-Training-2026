class GameCharacter {
    String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println(characterName + " performs a basic interaction.");
    }
}

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " lunges forward and strikes with a heavy sword swing!");
    }
}

class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " channels mana and releases a volatile fireball spell!");
    }
}

class Archer extends GameCharacter {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " takes aim and fires a precise piercing arrow!");
    }
}

public class AdventureGameCharacterSystem {
    public static void startBattle(GameCharacter[] characters) {
        int warriors = 0;
        int mages = 0;
        int archers = 0;
        for (GameCharacter c : characters) {
            c.performAttack();
            if (c instanceof Warrior) {
                warriors++;
            } else if (c instanceof Mage) {
                mages++;
            } else if (c instanceof Archer) {
                archers++;
            }
        }
        System.out.println("\nBattle Roster Evaluation Count:");
        System.out.println("Warriors: " + warriors + " | Mages: " + mages + " | Archers: " + archers);
    }

    public static void main(String[] args) {
        GameCharacter[] party = {
            new Warrior("Arthur"),
            new Mage("Gandalf"),
            new Archer("Robin"),
            new Mage("Merlin")
        };
        startBattle(party);
    }
}