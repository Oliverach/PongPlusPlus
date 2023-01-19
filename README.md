# PongPlusPlus

PongPlusPlus (Pong++) handelt sich um ein Player VS PC Pong spiel mit Fähigkeiten. Das Ziel des Spiels ist, den Ball out-of-Bounds zu setzen, indem man den Ball vom eigenen Balken weg prallen lässt, sodass der gegnerischen Balken den Ball nicht stoppen kann. Das Spielfenster wird durch einen Balken getrennt. Den eigenen Punktstand sieht man immer im eigen Spielfeld-hälfte. Ausser den gewöhnlichen Regeln gibt es noch Fähigkeiten. Man kann mit der Fähigkeit die Ball Geschwindigkeit im gegnerischen Spielfeld beschleunigen und im eigenen verlangsamen für 10 Sekunden. Ein Sieg gilt, wen ein Spieler 10 Punkte erreicht hat.


## GUI:

### Originales Mockup:
![PongPlusPlus Mockup](GUI%20Screenshots/pongplusplus_design.png?raw=true)


### Info:
![PongPlusPlus Info Scene](GUI%20Screenshots/InfoScene.png?raw=true)

### GamemodeSelection:
![PongPlusPlus GamemodeSelection Scene](GUI%20Screenshots/gamemodeselection.png?raw=true)

### DifficultySelection:
![PongPlusPlus DifficultySelectionnfo Scene](GUI%20Screenshots/difficulty_selection.png?raw=true)

### Ingame:
![PongPlusPlus Ingame Scene](GUI%20Screenshots/Ingame.png?raw=true)

### Gameover:
![PongPlusPlus Gameover Scene](GUI%20Screenshots/gameover.png?raw=true)

## Klassendiagramm earlystage:
![PongPlusPlus UML early stage](GUI%20Screenshots/pongplusplus_classdiagram_earlystage.png?raw=true)

## Klassendiagramm:
![PongPlusPlus UML](GUI%20Screenshots/UML.png?raw=true)

## Usecase diagram:
![Usecase](GUI%20Screenshots/usecase_diagrampongplusplus.png?raw=true)

## Sequence diagram:
![Sequence diagram](GUI%20Screenshots/pongplusplus_sequencediagram.png?raw=true)

- Gameobject: Alle auf dem Screen zusehende Objekt erbben von dieser Klasse. Enthalteten(X/Y) Variablen, abstrakte update Methoden etc.
- Ball: Enthaltet die Logik vom Ball und erbt von Gameobject.
- PlateObject: Eine Erweiterung der Klasse Gameobject, enthält spezielle Methoden.
- BaseScene: Alle Szenen erben von dieser Klasse, enthält die Gemeinsamkeit aller Szenen.
- GodLikeAnimationTimer: Enthält den Timer welchen wir im Spiel brauchen.
- BallSppedManipulator: Enthält die Fähigkeit, die Ball Geschwindigkeit manipuliert.
- PongPlusPlusApp: In dieser Klasse werden alle Szenen registriert.
- Board: Zeichnet alle In-game Elemente und Enthält alle in-game Logik.
- GameSetting: Enthält alle Game Einstellungen
 

## Authors

[yrikhn](https://github.com/yrikhn), [oliverach](https://github.com/Oliverach)
