# SPRING_IOC_AOP

* IoC : Inversion of Control (Inversion de Contrôle)
* AOP : Aspect-Oriented Programming (Programmation Orientée Aspect)
* Couplage fort: Classe depend d'une autre classe
* Couplage faible: Classe depend d'une interface

## TD_1

```mermaid
classDiagram
    direction LR

    %% Définition des classes et interfaces
    class Presentation {
        -metier: IMetier
        +main(String[]): void
    }

    class IMetier {
        +calcul(): double
    }

    class MetierImpl {
        -dao: IDao
        +calcul(): double
        +setDao(IDao): void
    }

    class IDao {
        +getData(): double
    }

    class DaoImpl {
        +getData(): double
    }

    class DaoImplV2 {
        +getData(): double
    }

    %% Alignement et relations horizontales
    Presentation "1" *--> "1" IMetier : metier
    MetierImpl ..|> IMetier
    MetierImpl "1" *--> "1" IDao : dao
    DaoImpl ..|> IDao
    DaoImplV2 ..|> IDao
```

### 


