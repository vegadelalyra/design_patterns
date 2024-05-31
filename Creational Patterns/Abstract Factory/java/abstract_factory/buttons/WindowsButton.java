package abstract_factory.buttons;

/**
 * All products families have the same varieties (Mac_OS/Windows).

 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
