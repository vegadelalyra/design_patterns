package factory.dialogs_creators_rol;

import factory.buttons_products_rol.Button;
import factory.buttons_products_rol.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
