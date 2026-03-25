``` mermaid
---
title: merged_thread-1.jsonl State Diagram
---
stateDiagram-v2
[*] --> App#main([Ljava/lang/String;)V
App#main([Ljava/lang/String;)V --> App#<init>()V : 1
App#<init>()V --> App#main([Ljava/lang/String;)V : 2
App#main([Ljava/lang/String;)V --> App#init()Lorg/example/controller/MyController; : 3
App#init()Lorg/example/controller/MyController; --> Golem#<init>()V : 4
Golem#<init>()V --> Monster#<init>(Ljava/lang/String;I)V : 5
Monster#<init>(Ljava/lang/String;I)V --> Character#<init>(Ljava/lang/String;I)V : 6
Character#<init>(Ljava/lang/String;I)V --> Monster#<init>(Ljava/lang/String;I)V : 7
Monster#<init>(Ljava/lang/String;I)V --> Golem#<init>()V : 8
Golem#<init>()V --> App#init()Lorg/example/controller/MyController; : 9
App#init()Lorg/example/controller/MyController; --> MyController#<init>(Lorg/example/Model/character/Golem;)V : 10
MyController#<init>(Lorg/example/Model/character/Golem;)V --> App#init()Lorg/example/controller/MyController; : 11
App#init()Lorg/example/controller/MyController; --> App#main([Ljava/lang/String;)V : 12
App#main([Ljava/lang/String;)V --> App#sendMessage(Ljava/lang/String;)V : 13
App#sendMessage(Ljava/lang/String;)V --> App#main([Ljava/lang/String;)V : 14
App#main([Ljava/lang/String;)V --> MyController#setHero()V : 15
MyController#setHero()V --> MyController#newHero()Lorg/example/Model/character/Hero; : 16
MyController#newHero()Lorg/example/Model/character/Hero; --> Hero#<init>(Ljava/lang/String;ILjava/lang/String;)V : 17
Hero#<init>(Ljava/lang/String;ILjava/lang/String;)V --> Character#<init>(Ljava/lang/String;I)V : 18
Character#<init>(Ljava/lang/String;I)V --> Hero#<init>(Ljava/lang/String;ILjava/lang/String;)V : 19
Hero#<init>(Ljava/lang/String;ILjava/lang/String;)V --> MyController#newHero()Lorg/example/Model/character/Hero; : 20
MyController#newHero()Lorg/example/Model/character/Hero; --> MyController#setHero()V : 21
MyController#setHero()V --> App#main([Ljava/lang/String;)V : 22
App#main([Ljava/lang/String;)V --> App#sendMessage(Ljava/lang/String;)V : 23
App#sendMessage(Ljava/lang/String;)V --> App#main([Ljava/lang/String;)V : 24
App#main([Ljava/lang/String;)V --> MyController#theHeroEquipsSword()V : 25
MyController#theHeroEquipsSword()V --> Weapon#<init>(Ljava/lang/String;I)V : 26
Weapon#<init>(Ljava/lang/String;I)V --> MyController#theHeroEquipsSword()V : 27
MyController#theHeroEquipsSword()V --> Hero#equipWeapon(Lorg/example/Model/weapon/Weapon;)V : 28
Hero#equipWeapon(Lorg/example/Model/weapon/Weapon;)V --> MyController#theHeroEquipsSword()V : 29
MyController#theHeroEquipsSword()V --> App#main([Ljava/lang/String;)V : 30
App#main([Ljava/lang/String;)V --> App#sendMessage(Ljava/lang/String;)V : 31
App#sendMessage(Ljava/lang/String;)V --> App#main([Ljava/lang/String;)V : 32
App#main([Ljava/lang/String;)V --> MyController#theHeroAttacks()V : 33
MyController#theHeroAttacks()V --> Golem#getName()Ljava/lang/String; : 34
Golem#getName()Ljava/lang/String; --> MyController#theHeroAttacks()V : 35
MyController#theHeroAttacks()V --> Monster#takeDamage(I)V : 36
Monster#takeDamage(I)V --> MyController#theHeroAttacks()V : 37
MyController#theHeroAttacks()V --> Golem#takeDamage()V : 38
Golem#takeDamage()V --> MyController#theHeroAttacks()V : 39
MyController#theHeroAttacks()V --> Character#getHealth()I : 40
Character#getHealth()I --> MyController#theHeroAttacks()V : 41
MyController#theHeroAttacks()V --> App#main([Ljava/lang/String;)V : 42
App#main([Ljava/lang/String;)V --> App#sendMessage(Ljava/lang/String;)V : 43
App#sendMessage(Ljava/lang/String;)V --> App#main([Ljava/lang/String;)V : 44
App#main([Ljava/lang/String;)V --> MyController#getHeroName()Ljava/lang/String; : 45
MyController#getHeroName()Ljava/lang/String; --> Hero#getName()Ljava/lang/String; : 46
Hero#getName()Ljava/lang/String; --> Character#getName()Ljava/lang/String; : 47
Character#getName()Ljava/lang/String; --> Hero#getName()Ljava/lang/String; : 48
Hero#getName()Ljava/lang/String; --> MyController#getHeroName()Ljava/lang/String; : 49
MyController#getHeroName()Ljava/lang/String; --> App#main([Ljava/lang/String;)V : 50
App#main([Ljava/lang/String;)V --> App#sendMessage(Ljava/lang/String;)V : 51
App#sendMessage(Ljava/lang/String;)V --> App#main([Ljava/lang/String;)V : 52
App#main([Ljava/lang/String;)V --> [*]
```
``` mermaid
---
title: merged_thread-1.jsonl Sequence Diagram
---
sequenceDiagram
Start ->> App#main(): enter
App#main() ->> App#(): enter
App#() ->> App#main(): exit
App#main() ->> App#init(): enter
App#init() ->> Golem#(): enter
Golem#() ->> Monster#(): enter
Monster#() ->> Character#(): enter
Character#() ->> Monster#(): exit
Monster#() ->> Golem#(): exit
Golem#() ->> App#init(): exit
App#init() ->> MyController#(): enter
MyController#() ->> App#init(): exit
App#init() ->> App#main(): exit
App#main() ->> App#sendMessage(): enter
App#sendMessage() ->> App#main(): exit
App#main() ->> MyController#setHero(): enter
MyController#setHero() ->> MyController#newHero(): enter
MyController#newHero() ->> Hero#(): enter
Hero#() ->> Character#(): enter
Character#() ->> Hero#(): exit
Hero#() ->> MyController#newHero(): exit
MyController#newHero() ->> MyController#setHero(): exit
MyController#setHero() ->> App#main(): exit
App#main() ->> App#sendMessage(): enter
App#sendMessage() ->> App#main(): exit
App#main() ->> MyController#theHeroEquipsSword(): enter
MyController#theHeroEquipsSword() ->> Weapon#(): enter
Weapon#() ->> MyController#theHeroEquipsSword(): exit
MyController#theHeroEquipsSword() ->> Hero#equipWeapon(): enter
Hero#equipWeapon() ->> MyController#theHeroEquipsSword(): exit
MyController#theHeroEquipsSword() ->> App#main(): exit
App#main() ->> App#sendMessage(): enter
App#sendMessage() ->> App#main(): exit
App#main() ->> MyController#theHeroAttacks(): enter
MyController#theHeroAttacks() ->> Golem#getName(): enter
Golem#getName() ->> MyController#theHeroAttacks(): exit
MyController#theHeroAttacks() ->> Monster#takeDamage(): enter
Monster#takeDamage() ->> MyController#theHeroAttacks(): exit
MyController#theHeroAttacks() ->> Golem#takeDamage(): enter
Golem#takeDamage() ->> MyController#theHeroAttacks(): exit
MyController#theHeroAttacks() ->> Character#getHealth(): enter
Character#getHealth() ->> MyController#theHeroAttacks(): exit
MyController#theHeroAttacks() ->> App#main(): exit
App#main() ->> App#sendMessage(): enter
App#sendMessage() ->> App#main(): exit
App#main() ->> MyController#getHeroName(): enter
MyController#getHeroName() ->> Hero#getName(): enter
Hero#getName() ->> Character#getName(): enter
Character#getName() ->> Hero#getName(): exit
Hero#getName() ->> MyController#getHeroName(): exit
MyController#getHeroName() ->> App#main(): exit
App#main() ->> App#sendMessage(): enter
App#sendMessage() ->> App#main(): exit
App#main() ->> Start: exit
```
