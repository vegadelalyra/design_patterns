package factory.dialogs_creators_rol;

import factory.buttons_products_rol.Button;
import factory.buttons_products_rol.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
