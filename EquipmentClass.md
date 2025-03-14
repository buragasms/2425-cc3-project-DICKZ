classDiagram
    class Equipment {
        -String name
        -int value
        -int damage
        -int levelRequirement
        -List~Item~ equipments

        +Equipment(String name, int value, int damage, int levelRequirement, List~Item~ equipments)
        +void equip()
        +boolean canEquip(int playerLevel)
        +int getDamage()
        +String getName()
        +void setName(String name)
        +int getValue()
        +void setValue(int value)
        +void setDamage(int damage)
        +int getLevelRequirement()
        +void setLevelRequirement(int levelRequirement)
        +List~Item~ getEquipments()
        +void setEquipments(List~Item~ equipments)
    }

    class Item {
        <<This class is assumed to exist>>
    }

    Equipment "1" *-- "many" Item : contains
