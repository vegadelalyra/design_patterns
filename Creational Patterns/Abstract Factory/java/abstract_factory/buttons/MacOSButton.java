package abstract_factory.buttons;

/**
 * All products families have the same varieties (Mac_OS/Windows).

 * This is a Mac_OS variant of a button.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
