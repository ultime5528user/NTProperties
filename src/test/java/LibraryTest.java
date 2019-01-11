/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import edu.wpi.first.networktables.EntryListenerFlags;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

import static org.junit.Assert.*;

import com.ultime5528.ntproperties.NTProperties;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        // TODO
    }

    public static void main(String[] args) {

        NetworkTableInstance ntInst = NetworkTableInstance.getDefault();
        ntInst.startClient("127.0.0.1");

        NTProperties properties = new NTProperties(K.class, false);
        
        while(true) {

            properties.performChanges();
            System.out.println(K.Inner.BRIGHTNESS);
            System.out.println(K.Inner.BOOL);
            System.out.println(K.Inner.VAL2);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Stopped
            }
        }
    }
}
