class CinemaBookingUI {

    private Button button;
    private TextField textField;
    private Checkbox checkbox;

    public CinemaBookingUI(UIFactory factory) {
        this.button = factory.createButton();
        this.textField = factory.createTextField();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        textField.render();
        checkbox.render();
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Dark Theme
        UIFactory darkThemeFactory = new DarkThemeFactory();
        CinemaBookingUI darkThemeUI = new CinemaBookingUI(darkThemeFactory);
        darkThemeUI.render();

        System.out.println();

        // Using Light Theme
        UIFactory lightThemeFactory = new LightThemeFactory();
        CinemaBookingUI lightThemeUI = new CinemaBookingUI(lightThemeFactory);
        lightThemeUI.render();
    }
}
