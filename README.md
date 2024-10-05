# Cinema Management System Design Patterns

This project demonstrates the use of various **Design Patterns** to create a cinema management system. The system covers different functionalities such as global cinema configuration, movie creation, user interface generation, ticket booking, and movie schedule management. Below is a summary of each implemented pattern:

## 1. **Singleton Pattern: Cinema Configuration**
The **Singleton Pattern** is used to implement the `CinemaConfig` class that manages global settings such as the cinema name, number of screens, and operating hours. This ensures that only one instance of the configuration exists throughout the application.

### Features:
- **Singleton Instance**: Ensures a single global instance of `CinemaConfig`.
- **Global Configuration Settings**: Allows centralized management of cinema-related settings.

### Usage:
```java
public class Main {
    public static void main(String[] args) {
        CinemaConfig config = CinemaConfig.getInstance();

        config.setCinemaName("Chaplin Cinema");
        config.setNumberOfScreens(10);
        config.setOperatingHours("8:00 AM - 12:00 PM");

        System.out.println(config);

        CinemaConfig anotherConfigReference = CinemaConfig.getInstance();
        System.out.println(anotherConfigReference); 
    }
}
```

---

## 2. **Factory Method Pattern: Movie Creation**
The **Factory Method Pattern** is used to design a movie management system that allows for the creation of different types of movies (e.g., `RegularMovie`, `3DMovie`, `IMAXMovie`). This pattern enables flexibility in creating new types of movies without changing the core code structure.

### Features:
- **Movie Factory**: Abstract factory method for creating different movie types.
- **Movie Types**: `RegularMovie`, `3DMovie`, `IMAXMovie`.

### Usage:
```java
public class Main {
    public static void main(String[] args) {
        MovieFactory regularFactory = new RegularMovieFactory();
        Movie regularMovie = regularFactory.createMovie("Inception", 148);
        regularMovie.displayInfo();

        MovieFactory threeDFactory = new ThreeDMovieFactory();
        Movie threeDMovie = threeDFactory.createMovie("Avatar", 162);
        threeDMovie.displayInfo();

        MovieFactory imaxFactory = new IMAXMovieFactory();
        Movie imaxMovie = imaxFactory.createMovie("Interstellar", 169);
        imaxMovie.displayInfo();
    }
}

```

---

## 3. **Abstract Factory Pattern: User Interface Generation**
The **Abstract Factory Pattern** is used to create a flexible UI generation system. This system allows the generation of different UI themes (e.g., `DarkTheme`, `LightTheme`) for the cinema's booking system. Each theme has its own set of UI components such as buttons, text fields, and checkboxes.

### Features:
- **Theme Factories**: Different factories for `DarkTheme` and `LightTheme`.
- **UI Components**: Button, TextField, and Checkbox for each theme.

### Usage:
```java
class CinemaBookingUI {

    private Button button;
    private TextField textField;
    private Checkbox checkbox;

    // Constructor to initialize UI components based on the theme factory
    public CinemaBookingUI(UIFactory factory) {
        this.button = factory.createButton();
        this.textField = factory.createTextField();
        this.checkbox = factory.createCheckbox();
    }

    // Render the UI
    public void render() {
        button.render();
        textField.render();
        checkbox.render();
    }
}

public class Main {
    public static void main(String[] args) { 
        UIFactory darkThemeFactory = new DarkThemeFactory();
        CinemaBookingUI darkThemeUI = new CinemaBookingUI(darkThemeFactory);
        darkThemeUI.render();

        System.out.println();
 
        UIFactory lightThemeFactory = new LightThemeFactory();
        CinemaBookingUI lightThemeUI = new CinemaBookingUI(lightThemeFactory);
        lightThemeUI.render();
    }
}

```

---

## 4. **Builder Pattern: Ticket Booking**
The **Builder Pattern** is used to implement the complex ticket booking system, allowing options such as seat selection, snack combos, and special screenings. This pattern provides an easy way to construct a `TicketBooking` object step by step.

### Features:
- **Flexible Booking**: Allows customization of seat selection, snack combos, and screening options.
- **Builder Pattern**: Simplifies the construction of complex booking objects.

### Usage:
```java
public class Main {
    public static void main(String[] args) { 
        TicketBooking basicBooking = new TicketBooking.TicketBookingBuilder("Inception", "B12")
                                            .build();
        System.out.println(basicBooking);
 
        TicketBooking snackBooking = new TicketBooking.TicketBookingBuilder("Avatar", "A15")
                                            .setSnackCombo("Popcorn and Soda")
                                            .build();
        System.out.println(snackBooking);
 
        TicketBooking fullBooking = new TicketBooking.TicketBookingBuilder("Interstellar", "C5")
                                            .setSnackCombo("Nachos and Soda")
                                            .setSpecialScreening("IMAX")
                                            .build();
        System.out.println(fullBooking);
    }
}

```

---

## 5. **Prototype Pattern: Movie Schedule Management**
The **Prototype Pattern** is used for managing movie schedules. This allows the cloning of an existing `MovieSchedule` object and making modifications to screening times and dates without recreating the entire object from scratch.

### Features:
- **Cloning**: Easily clone movie schedules and modify details.
- **Prototype Pattern**: Facilitates object duplication for managing multiple schedules.

### Usage:
```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception { 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        MovieSchedule originalSchedule = new MovieSchedule("Inception", dateFormat.parse("10-10-2024"), "18:00");
 
        System.out.println("Original Schedule: " + originalSchedule);
 
        MovieSchedule clonedSchedule1 = originalSchedule.clone();
        clonedSchedule1.setScreeningTime("20:00");
        System.out.println("Cloned Schedule with modified time: " + clonedSchedule1);
 
        MovieSchedule clonedSchedule2 = originalSchedule.clone();
        clonedSchedule2.setScreeningDate(dateFormat.parse("12-10-2024"));
        System.out.println("Cloned Schedule with modified date: " + clonedSchedule2);
 
        System.out.println("Original Schedule remains unchanged: " + originalSchedule);
    }
}

```

---

## How to Run

1. Clone the repository.
2. Open the project in any Java IDE (such as IntelliJ IDEA or Eclipse).
3. Compile and run each class as per the examples above.

Each design pattern implementation has its corresponding `Main` class for testing purposes. You can run these `Main` classes to see how each pattern works in the cinema management system.

---

## Prerequisites
- Java 8 or higher.
- Any IDE with support for Java projects.

## Author
This project was developed to demonstrate the implementation of various **Design Patterns** in Java for a cinema management system.
Created by Biloshchytskyi Yevhenii
