import tornadofx.ChildInterceptor;
import tornadofx.Stylesheet;

module tornadofx {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires javafx.web;
    requires javafx.media;

    requires kotlin.stdlib;
    requires kotlin.reflect;

    requires static httpcore;
    requires static httpclient;
    requires static org.apache.felix.framework;

    requires transitive java.json;
    requires transitive java.prefs;
    requires transitive java.logging;
    requires javafx.base;

    opens tornadofx to javafx.fxml;

    exports tornadofx;

    uses ChildInterceptor;
    uses Stylesheet;
}