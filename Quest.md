# Main Quest


# Sub Quest


6. "Blood of the Battlefield"
Quest Type: Collect  
Description: The legendary general Sun Tzu asks you to retrieve the bloodied blade of his fallen warrior to prove that wisdom can outlast war.  
Rewards:  
- A small clay figure that looks like a miniature version of a soldier from the Terracotta Army  
- A bag of Jade Tea leaves  
```mermaid
flowchart TD
0[Quest Type: Collect]
1st[Quest Start] --> 2nd["'Sun Tzu:
"War claims many lives, but wisdom endures beyond the battlefield. A warrior of mine fell here long ago, his blade lost to the ages. Retrieve it, and you will understand the true cost of war.'"]
2nd --> 3rd["Accept"] --> 4th["'I will find this blade and bring it back to you.'"]
2nd --> 11th["Question"] --> 12th["'Why is this blade so important?'"]
2nd --> 16th["Decline"] --> 6th["' I am not interested in relics of war.'"] 
16th --> 17th[Ends the conversation] 

4th --> 5th["Sun tzu: 'Seek the battlefield to the east, where the earth drank the blood of the fallen. The blade is buried among the ruins of war. Return it to me, and you will understand the lesson I teach.'"]

%%{init: {"flowchart": {"htmlLabels": false}} }%%
5th -->6th["`**Quest Objective:**
Travel to the ancient battlefield.
Search through remnants of fallen soldiers.
Find the **Bloodied Blade** and return it to Sun Tzu.`"]
6th --> 7th([Upon returning with the blade]) --> 8th["Sun Tzu: '"You have done well. This blade is heavy, not just with steel, but with the weight of those who carried it. War ends, but wisdom lingers.'"]
8th --> 9th["'Accept Rewards'"] --> ["**Rewards Acquired:** _'A small clay figure that looks like a miniature version of a soldier from the Terracotta Army'_ and _'A bag of Jade Tea leaves'_"]
9th --> 10th[QUEST COMPLETED]

12th --> 13th["Sun Tzu: '"This is no ordinary blade. It belonged to one of my finest warriors, a man who believed in strategy over slaughter. His blade was stained in battle, but he wielded it with restraint, only striking when wisdom demanded it.'"]

13th --> 14th["'I see. I will find the blade for you.'"] --> 5th
13th --> 15th["'This seems like a lost cause. I'll pass.'"] --> 17th



```



# Sub Quest

