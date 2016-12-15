package main.java;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Suli on 2016.12.15..
 */
public class DrawPanel extends JPanel {

    public DrawPanel(){
        loadImage();
    }

    private BufferedImage pict;

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        System.out.println("paint");
        doDrawing(g);
    }

    private void loadImage() {

        try {
           pict = ImageIO.read(new File("mario.jpg"));

        } catch (IOException ex) {
            System.out.println("Beolvasási hiba!");
        }
    }

    private void doDrawing(Graphics g){
        Graphics2D g2d = (Graphics2D) g;


        Dimension dim = getSize();
        Insets insets = getInsets();

        int w = (int) dim.getWidth() - insets.left - insets.right;
        int h = (int) dim.getHeight() - insets.top - insets.bottom;

        Random r = new Random();

        /* sok pont
        for (int i = 0; i <= 1000; i++) {

            int x = Math.abs(r.nextInt()) % w;
            int y = Math.abs(r.nextInt()) % h;
            g2d.drawLine(x, y, x, y);
        }
        g2d.drawLine(20, 20, 100, 100);
        */

        float[] dash = {2f, 2f, 1f};
        float[] dash2 = {2f, 2f, 2f};

        BasicStroke bs = new BasicStroke(10, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 1.0f ,dash, 2f);
        BasicStroke bs2 = new BasicStroke(10, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 1.0f ,dash2, 2f);

        g2d.setColor(Color.blue);
        g2d.setStroke(bs);
        g2d.drawLine(20, 50, 200, 50);
        g2d.setStroke(bs2);
        g2d.drawLine(20, 100, 200, 100);

        g2d.setColor(Color.red);

        g2d.drawOval(20,150,180,40);

        TexturePaint pictTexture = new TexturePaint(pict, new Rectangle(0, 0, 40, 40));

        //g2d.setPaint(pictTexture);
        g2d.fillRect(20,210,180,40);

        g2d.setColor(Color.green);

        int xPoly[] = {150,250,325,375,450,275,100};
        int yPoly[] = {150,100,125,225,250,375,300};

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2d.drawPolygon(poly);

        g2d.dispose();
    }
}
