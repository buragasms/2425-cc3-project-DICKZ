classDiagram
    class CombatManager {
        -Player player
        -List~Enemy~ enemies
        -CombatState currentState

        +CombatManager(Player player, List~Enemy~ enemies)
        +void startCombat()
        +void endCombat()
        +void processTurn(Ability ability)
        -void applyAbilityToEnemies(Ability ability)
        -void applyEnemyAttacks()
        -boolean checkCombatEnd()
    }

    class Player {
        <<Assumed to exist>>
        +String getName()
        +void takeDamage(int damage)
        +boolean isAlive()
    }

    class Enemy {
        <<Assumed to exist>>
        +void takeDamage(int damage)
        +int getAttackPower()
        +boolean isAlive()
    }

    class Ability {
        <<Assumed to exist>>
        +String getName()
        +int getDamage()
    }

    CombatManager "1" --> "1" Player : manages
    CombatManager "1" --> "many" Enemy : manages
    CombatManager "1" --> "1" Ability : uses