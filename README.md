# CORSO INGEGNERIA/PROGETTAZIONE DEL SOFTWARE

## LABORATORIO 1


###Istruzioni 

0. Guardare anche i lucidi disponibili sul sito del laboratorio
1. A inizio laboratorio lanciare il comando  `source <( curl -s https://homes.di.unimi.it/bellettini/init_lab )` oppure  `source <( wget -qO- https://homes.di.unimi.it/bellettini/init_lab )` 
2. Ad ogni passo TDD lanciare il comando `salva` passandogli una stringa del tipo:
    - `"ROSSO: aggiunto testx"` dopo avere scommentato un nuovo test e **resa possibile la compilazione senza errori** (se il test passasse direttamente scrivere VERDE invece di ROSSO)
    - `"VERDE: passa il testx"` dopo avere implementato semplicemente il codice per far passare il test
    - `"REFACTORING"` dopo avere migliorato una soluzione funzionante
3. per consegnare, dare una ultima volta il comando `salva` passandogli la stringa "Consegna"