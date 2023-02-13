package behavioral.mediator;

import javax.swing.*;

public class Dialog implements Mediator {

    private final JTextField userTextBox = new JTextField();
    private final JTextField passTextBox = new JTextField();
    private LoginButton loginButton;
    private ForgotPasswordButton forgotPasswordButton;

    public Dialog() {
        loginButton.setMediator(this);
        forgotPasswordButton.setMediator(this);
    }

    @Override
    public void login() {
        System.out.println("Logging in...");
        String username = userTextBox.getText();
        String password = passTextBox.getText();
        // validate
        // login or throw error
    }

    @Override
    public void forgotPass() {
        System.out.println("Generating new Password...");
        String username = userTextBox.getText();
    }
}
