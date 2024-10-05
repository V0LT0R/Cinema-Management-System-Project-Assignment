class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a dark-themed button.");
    }
}

class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a light-themed button.");
    }
}

class DarkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering a dark-themed text field.");
    }
}

class LightTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering a light-themed text field.");
    }
}

class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a dark-themed checkbox.");
    }
}

class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a light-themed checkbox.");
    }
}
