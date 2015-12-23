/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gitproject;

/**
 *
 * @author Alexey
 */
public class Settings {
    
    private Settings() {
    }
    
    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
    
    private static class SettingsHolder {

        private static final Settings INSTANCE = new Settings();
    }
}
