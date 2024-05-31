package abstract_factory.checkboxes;

/**
 * All products families have the same varieties (Mac_OS/Windows).

 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements  Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
