package utilities;

import com.sun.webkit.graphics.GraphicsDecoder;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImage extends JPanel {
        private Image img;
        
        @Override
        public void paint(Graphics g){
            img = new ImageIcon(getClass().getResource("/Images/background.PNG")).getImage();
            
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }