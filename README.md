# MCR - Laboratoire 1

## Partie a
Définir une application graphique qui permette d'instancier des cercles et des carrés et de les déplacer. Ces objets géométriques devront être initialisées aléatoirement (taille, position, vecteur de déplacement). Si un objet rencontre un bord, il doit rebondir.

Veiller à soigner l'implémentation et effectuer tous les refactorings nécessaires afin que le code produit soit le plus élégant possible selon les standards de programmation POO.

## Partie b

### Introduction
Le modèle de conception du singleton est souvent utilisé pour contrôler l'instanciation unique d'une ressource technique: driver JDBC, codec audio/vidéo, etc. Dans le cadre de ce laboratoire, le singleton sera utilisé pour gérer l'instance unique d'un affichage graphique bidimensionnel.

### Indications
Modifier le laboratoire précédent (permettant de générer aléatoirement des cercles et des carrés et de les déplacer en les faisant rebondir sur les bords de la fenêtre) afin d’utiliser un espace d'affichage graphique commun. La classe représentant l'affichage doit mettre en oeuvre un singleton et implémenter l'interface `Displayer` donnée en annexe.

Pour gérer l’affichage il peut être intéressant d’utiliser les méthodes `createImage` de la classe `JPanel`, `getGraphics` de la classe `Image`, ainsi que la méthodes `fill` et `drawImage` de la classe `Graphics2D`. Veiller à soigner l'implémentation et effectuer tous les refactorings nécessaires afin que le code produit soit le plus élégant possible selon les standards de programmation POO.

### Annexe

```java
public interface Displayer {
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String s);
}
```
