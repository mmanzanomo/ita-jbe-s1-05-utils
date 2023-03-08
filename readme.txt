

Les següents comandes es poden executar des de l'arxiu arrel on es troba el projecte:
C:\Users\nom_usuari\ITAcademy\s1t5Utils>


n1Exercici 1
Llegeix el contingut d'un fitxer rebut com a argument. Si no s'especifica cap ruta, agafarà el path actual per defecte.

java -cp .\bin n1Exercice1.Main  
java -cp .\bin n1Exercice1.Main ../


n1Exercici 2 
Afegeix la funcionalitat de recorrer totes les subcarpetes de la ruta pasada com primer argument

java -cp .\bin n1Exercice2.Main .\ -all


n1Exercici 3
Emmagatzema el contingut d'una ruta pasada com a primer argument en un arxiu de text a la carpeta files del projecte.
Es pot passar un segon argument per indicar una ruta de destí.

java -cp .\bin n1Exercice3.Main .\
java -cp .\bin n1Exercice3.Main .\ C:\Users\mznmi\Desktop\sortida2.txt


n1Exercici 4
Llegeix el contingut d'un fitxer. Si no s'indica cap ruta llegeix el path actual.

java -cp .\bin n1Exercice4.Main
java -cp .\bin n1Exercice4.Main C:\Users\mznmi\Desktop\sortida2.txt


n1Exercici 5
Serialitza i deserialitza un objecte i mostra el resultat per pantalla.

java -cp .\bin n1Exercice5.Main


n2Exercici1
Executa la comanda de n1Exercici3 agafant la ruta a llegir i la ruta resultant des de un arxiu de configuració.
L'arxiu de configuració es troba a "config\config.properties" dins la carpeta del projecte.

java -cp .\bin n2Exercice1.Main