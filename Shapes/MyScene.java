

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class MyScene implements GLEventListener {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Frame frame = new Frame("My Unique Scene");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new MyScene());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }
    
    /**
     * 
     * @param drawable 
     */
    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH);
    }
    
    /**
     * 
     * @param drawable
     * @param x
     * @param y
     * @param width
     * @param height 
     */
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) {
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
    
    /**
     * 
     * @param drawable 
     */
    public void display(GLAutoDrawable drawable) {
        //GL Shapes
        GL shapeOne = drawable.getGL();
        GL shapeTwo = drawable.getGL();
        GL shapeThree = drawable.getGL();
        GL shapeFour = drawable.getGL();
        GL shapeFive = drawable.getGL();
        GL shapeSix = drawable.getGL();
        GL shapeSeven = drawable.getGL();

        //Clear the drawing area
        shapeOne.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        //Reset the current matrix to the "identity"
        shapeOne.glLoadIdentity();
        
        //Shape 1
        //Move the drawing cursor to this position
        shapeOne.glTranslatef(-3.0f, -2.0f, -6.0f);
        //Scale the drawing
        shapeOne.glScalef(1.5f, 1.5f, 1.5f);
        //Draw a Triangle fan
        shapeOne.glBegin(GL.GL_TRIANGLE_STRIP);
        shapeOne.glColor3f(0.4392161f, 0.858824f, 0.576471f);//Color Aquamarine
        shapeOne.glVertex3f(0.0f, 0.0f, -6.0f);
        shapeOne.glVertex3f(1.0f, 0.0f, -6.0f);
        shapeOne.glVertex3f(0.0f, 1.0f, -6.0f);
        shapeOne.glVertex3f(1.0f, 1.0f, -6.0f);
        // The Top side 
        shapeOne.glColor3f(0.85f, 0.85f, 0.95f);//Color Quartz
        shapeOne.glVertex3f(0.0f, 1.0f, -1.0f);
        shapeOne.glVertex3f(1.0f, 1.0f, -1.0f);
        // The back face 
        shapeOne.glColor3f(0.0f, 0.0f, 0.61f);//Color MidnightBlue
        shapeOne.glVertex3f(0.0f, 0.0f, -6.0f);
        shapeOne.glVertex3f(1.0f, 0.0f, -6.0f);
        // The bottom face 
        shapeOne.glColor3f(0.6784311f, 0.917647f, 0.917647f);//Color Turquoise
        shapeOne.glVertex3f(0.0f, 0.0f, -1.0f);
        shapeOne.glVertex3f(-0.52f, -0.53f, -1.0f);
        //Draw the right face 
        shapeOne.glColor3f(0.309804f, 0.184314f, 0.309804f);//Color Violet
        shapeOne.glVertex3f(1.0f, 0.0f, -6.0f);
        shapeOne.glVertex3f(1.0f, 0.0f, -1.0f);
        shapeOne.glVertex3f(+1.0f, +1.0f, 0.0f);
        shapeOne.glVertex3f(+1.0f, +1.0f, -1.0f);
        //Draw the left face */
        shapeOne.glColor3f(0.08f, 0.196078f, 0.6f);//Color VioletRed
        shapeOne.glVertex3f(0.0f, 0.0f, 0.0f);
        shapeOne.glVertex3f(0.0f, 0.0f, -1.0f);
        shapeOne.glVertex3f(0.0f, 1.0f, 0.0f);
        shapeOne.glVertex3f(0.0f, 1.0f, -1.0f);  
        //Done Drawing the triangle strip
        shapeOne.glEnd(); 
        shapeOne.glFlush();
        shapeOne.glEnd();
         // Finished Drawing The Triangle fan
         
        //Draw a pyramid
        shapeTwo.glLoadIdentity();
        //Move the drawing cursor to this position
        shapeTwo.glTranslatef(-2.0f, 1.0f, -6.0f);
        //Scale the drawing
        shapeTwo.glScalef(0.5f, 0.5f, 0.5f);
        //Rotate the drawing
        shapeTwo.glRotatef(50.0f, 1.0f, -1.0f, 1.0f);
        //Draw a second pyramid
        shapeTwo.glBegin(GL.GL_TRIANGLES);
        //Front of the Pyrmaid
        shapeTwo.glColor3f( 1.0f, 0.498039f, 0.0f ); //Color Coral
        shapeTwo.glVertex3f( 1.0f, 2.0f, 0.0f ); //Top 
        shapeTwo.glColor3f( 1.0f, 0.11f, 0.68f ); //Color SpicyPink
        shapeTwo.glVertex3f( -1.0f, -2.0f, 1.0f ); //Left
        shapeTwo.glColor3f( 0.737255f, 0.560784f, 0.560784f ); //Color Pink
        shapeTwo.glVertex3f( 1.0f, -2.0f, 1.0f ); //Right
        // Right
        shapeTwo.glColor3f( 0.52f, 0.39f, 0.39f ); //Color DustyRose
        shapeTwo.glVertex3f( 1.0f, 2.0f, 0.0f ); // Top 
	shapeTwo.glColor3f( 0.55f, 0.09f, 0.09f ); //Color Scarlet
        shapeTwo.glVertex3f( 1.0f, -2.0f, 1.0f ); // Left 
        shapeTwo.glColor3f( 1.0f, 0.43f, 0.78f ); //Color NeonPink
        shapeTwo.glVertex3f( 1.0f, -2.0f, -1.0f ); // Right 
        // Left
        shapeTwo.glColor3f( 1.0f, 0.498039f, 0.0f ); //Color Coral
        shapeTwo.glVertex3f( 1.0f, 2.0f, 0.0f ); // Top 
        shapeTwo.glColor3f( 1.0f, 0.11f, 0.68f ); //Color SpicyPink
        shapeTwo.glVertex3f( 1.0f, -2.0f, -1.0f ); // Left 
        shapeTwo.glColor3f( 0.737255f, 0.560784f, 0.560784f ); //Color Pink
        shapeTwo.glVertex3f( -1.0f, -2.0f, -1.0f ); // Right 
         //left
        shapeTwo.glColor3f(0.52f, 0.39f, 0.39f ); //Color DustyRose
        shapeTwo.glVertex3f( 1.0f, 2.0f, 0.0f ); // Top 
	shapeTwo.glColor3f( 0.55f, 0.09f, 0.09f ); //Color Scarlet
        shapeTwo.glVertex3f( -1.0f, -2.0f, -1.0f ); // Left 
        shapeTwo.glColor3f( 1.0f, 0.43f, 0.78f ); //Color NeonPink
        shapeTwo.glVertex3f( -1.0f, -2.0f, 1.0f ); // Right 
        //Done Drawing 3d pyramid
        shapeTwo.glEnd();
        shapeTwo.glFlush();
        shapeTwo.glEnd();
        // Finished Drawing The pyramid
        
        
         //Draw a second pyramid
         shapeThree.glLoadIdentity();
        //Move the drawing cursor to this position
        shapeThree.glTranslatef(0.0f, 2.0f, -6.0f);
        //Scale the drawing
        shapeThree.glScalef(0.3f, 0.3f, 0.3f);
        //Rotate the drawing
        shapeThree.glRotatef(30.0f, 1.0f, 1.0f, 0.0f);
        //Draw a second pyramid
        shapeThree.glBegin(GL.GL_TRIANGLES);
        //Front of the Pyrmaid
        shapeThree.glColor3f( 1.0f, 1.0f, 0.0f ); //Color Yellow
        shapeThree.glVertex3f( 3.0f, 1.5f, 0.0f ); //Top 
        shapeThree.glColor3f( 0.439216f, 0.576471f, 0.858824f ); //Color DarkTurquoise
        shapeThree.glVertex3f( -3.0f, -1.5f, 1.0f ); //Left
        shapeThree.glColor3f( 0.137255f, 0.556863f, 0.419608f ); //Color SeaGreen
        shapeThree.glVertex3f( 3.0f, -1.5f, 1.0f ); //Right
        // Right
        shapeThree.glColor3f( 1.0f, 1.0f, 0.0f ); //Color Yellow
        shapeThree.glVertex3f( 3.0f, 1.5f, 0.0f ); //Top
	shapeThree.glColor3f( 0.439216f, 0.576471f, 0.858824f ); //Color DarkTurquoise
        shapeThree.glVertex3f( -3.0f, -1.5f, 1.0f ); //Left
        shapeThree.glColor3f(  0.137255f, 0.556863f, 0.419608f ); //Color SeaGreen
        shapeThree.glVertex3f( 2.0f, -1.0f, -1.0f ); // Right 
        // Left
        shapeThree.glColor3f( 1.0f, 1.0f, 0.0f ); //Color Yellow
        shapeThree.glVertex3f( 3.0f, 1.5f, 0.0f ); //Top
        shapeThree.glColor3f( 0.439216f, 0.576471f, 0.858824f ); //Color DarkTurquoise
        shapeThree.glVertex3f( -3.0f, -1.5f, 1.0f ); //Left
        shapeThree.glColor3f(  0.137255f, 0.556863f, 0.419608f ); //Color SeaGreen
        shapeThree.glVertex3f( -2.0f, -1.0f, -1.0f ); // Right 
         //left
        shapeThree.glColor3f(1.0f, 1.0f, 0.0f ); //Color Yellow
        shapeThree.glVertex3f( 3.0f, 1.5f, 0.0f ); //Top
	shapeThree.glColor3f( 0.439216f, 0.576471f, 0.858824f ); //Color DarkTurquoise
        shapeThree.glVertex3f( -3.0f, -1.5f, 1.0f ); //Left 
        shapeThree.glColor3f(  0.137255f, 0.556863f, 0.419608f ); //Color SeaGreen
        shapeThree.glVertex3f( -2.0f, -1.0f, 1.0f ); // Right 
        //Done Drawing 3d pyramid
        shapeThree.glEnd();
        shapeThree.glFlush();
        shapeThree.glEnd();
        // Finished Drawing The pyramid

        //Draw a Quad
        // Move the "drawing cursor" to another position
       
        shapeFour.glTranslatef(4.0f, -7.0f, 0.0f);
        //Rotate the Quad
        shapeFour.glRotatef(90.0f, 1.5f, 0.0f, 1.0f);
        shapeFour.glScalef(3.0f, 3.0f, 3.0f);
        // Draw A Quad
        shapeFour.glBegin(GL.GL_QUADS);
        shapeFour.glColor3f(0.439216f,0.858824f,0.576471f); //Color Aquamarine
        shapeFour.glVertex3f(1.0f, 1.0f, -1.0f); // Top Right Of The Quad (Top)
        shapeFour.glVertex3f( -1.0f, 1.0f, -1.0f); // Top Left Of The Quad (Top)
        shapeFour.glColor3f( 0.85f,0.85f,0.95f); //Color Quartz
        shapeFour.glVertex3f( -1.0f, 1.0f, 1.0f ); // Bottom Left Of The Quad (Top)
        shapeFour.glVertex3f( 1.0f, 1.0f, 1.0f ); // Bottom Right Of The Quad (Top)
        
        shapeFour.glColor3f( 0.439216f,0.858824f,0.576471f); //Color Aquamarine
        shapeFour.glVertex3f( 1.0f, -1.0f, 1.0f ); // Top Right Of The Quad
        shapeFour.glVertex3f( -1.0f, -1.0f, 1.0f ); // Top Left Of The Quad
        shapeFour.glColor3f( 0.258824f,0.258824f,0.435294f); //Color CornflowerBlue
        shapeFour.glVertex3f( -1.0f, -1.0f, -1.0f ); // Bottom Left Of The Quad
        shapeFour.glVertex3f( 1.0f, -1.0f, -1.0f ); // Bottom Right Of The Quad 
        
        shapeFour.glColor3f( 0.439216f,0.858824f,0.576471f); //Color Aquamarine
        shapeFour.glVertex3f( 1.0f, 1.0f, 1.0f ); // Top Right Of The Quad (Front)
        shapeFour.glVertex3f( -1.0f, 1.0f, 1.0f ); // Top Left Of The Quad (Front)
        shapeFour.glColor3f( 0.258824f,0.258824f,0.435294f); //Color CornflowerBlue
        shapeFour.glVertex3f( -1.0f, -1.0f, 1.0f ); // Bottom Left Of The Quad
        shapeFour.glVertex3f( 1.0f, -1.0f, 1.0f ); // Bottom Right Of The Quad 
        
        shapeFour.glColor3f( 0.439216f,0.858824f,0.576471f); //Color Aquamarine
        shapeFour.glVertex3f( 1.0f, -1.0f, -1.0f ); // Bottom Left Of The Quad
        shapeFour.glVertex3f( -1.0f, -1.0f, -1.0f ); // Bottom Right Of The Quad
        shapeFour.glColor3f( 0.258824f,0.258824f,0.435294f); //Color CornflowerBlue
        shapeFour.glVertex3f( -1.0f, 1.0f, -1.0f ); // Top Right Of The Quad (Back)
        shapeFour.glVertex3f( 1.0f, 1.0f, -1.0f ); // Top Left Of The Quad (Back)
        
        shapeFour.glColor3f( 0.439216f,0.858824f,0.576471f); //Color Aquamarine
        shapeFour.glVertex3f( -1.0f, 1.0f, 1.0f ); // Top Right Of The Quad (Left)
        shapeFour.glVertex3f( -1.0f, 1.0f, -1.0f ); // Top Left Of The Quad (Left)
        shapeFive.glColor3f( 0.258824f,0.258824f,0.435294f); //Color CornflowerBlue
        shapeFour.glVertex3f( -1.0f, -1.0f, -1.0f ); // Bottom Left Of The Quad
        shapeFour.glVertex3f( -1.0f, -1.0f, 1.0f ); // Bottom Right Of The Quad 
        
        shapeFour.glColor3f( 0.439216f,0.858824f,0.576471f); //Color Aquamarine
        shapeFour.glVertex3f( 1.0f, 1.0f, -1.0f ); // Top Right Of The Quad (Right)
        shapeFour.glVertex3f( 1.0f, 1.0f, 1.0f ); // Top Left Of The Quad
        shapeFive.glColor3f( 0.258824f,0.258824f,0.435294f); //Color CornflowerBlue
        shapeFour.glVertex3f( 1.0f, -1.0f, 1.0f ); // Bottom Left Of The Quad
        shapeFour.glVertex3f( 1.0f, -1.0f, -1.0f ); // Bottom Right Of The Quad
        shapeFour.glEnd(); // Done Drawing The Quad
        shapeFour.glFlush();

        //Done drawing the Quad
        shapeFour.glEnd();
        
        
        //Draw a second Quad
        // Move the "drawing cursor" to another position
        shapeFive.glTranslatef(2.6f, -4.0f, 0.0f);
        //Rotate the Quad
        shapeFive.glRotatef(90.0f, 1.5f, 0.0f, 1.0f);
        shapeFive.glScalef(0.6f, 0.6f, 0.6f);
        // Draw A Cube
        shapeFive.glBegin(GL.GL_QUADS);
        shapeFive.glColor3f(0.53f, 0.12f, 0.47f);//Color DarkPurple
        shapeFive.glVertex3f(2.0f, 1.0f, -1.0f); // Top Right Of The Quad (Top)
        shapeFive.glVertex3f( -2.0f, 1.0f, -1.0f); // Top Left Of The Quad (Top)
        shapeFive.glColor3f( 0.85f,0.85f,0.95f); //Color Quartz
        shapeFive.glVertex3f( -2.0f, 1.0f, 1.0f ); // Bottom Left Of The Quad (Top)
        shapeFive.glVertex3f( 2.0f, 1.0f, 1.0f ); // Bottom Right Of The Quad (Top
        
        shapeFive.glColor3f(0.53f, 0.12f, 0.47f);//Color DarkPurple
        shapeFive.glVertex3f( 2.0f, -1.0f, 1.0f ); // Top Right Of The Quad
        shapeFive.glVertex3f( -2.0f, -1.0f, 1.0f ); // Top Left Of The Quad
        shapeFive.glColor3f( 0.85f,0.85f,0.95f); //Color Quartz
        shapeFive.glVertex3f( -2.0f, -1.0f, -1.0f ); // Bottom Left Of The Quad
        shapeFive.glVertex3f( 2.0f, -1.0f, -1.0f ); // Bottom Right Of The Quad 
        
        shapeFive.glColor3f( 0.53f, 0.12f, 0.47f);//Color DarkPurple
        shapeFive.glVertex3f( 2.0f, 1.0f, 1.0f ); // Top Right Of The Quad (Front)
        shapeFive.glVertex3f( -2.0f, 1.0f, 1.0f ); // Top Left Of The Quad (Front)
        shapeFive.glColor3f(0.85f,0.85f,0.95f); //Color Quartz
        shapeFive.glVertex3f( -2.0f, -1.0f, 1.0f ); // Bottom Left Of The Quad
        shapeFive.glVertex3f( 2.0f, -1.0f, 1.0f ); // Bottom Right Of The Quad 
        
        shapeFive.glColor3f(0.85f,0.85f,0.95f); //Color Quartz
        shapeFive.glVertex3f( 2.0f, -1.0f, -1.0f ); // Bottom Left Of The Quad
        shapeFive.glVertex3f( -2.0f, -1.0f, -1.0f ); // Bottom Right Of The Quad
        shapeFive.glColor3f( 0.53f, 0.12f, 0.47f);//Color DarkPurple
        shapeFive.glVertex3f( -2.0f, 1.0f, -1.0f ); // Top Right Of The Quad (Back)
        shapeFive.glVertex3f( 2.0f, 1.0f, -1.0f ); // Top Left Of The Quad (Back)
        
        shapeFive.glColor3f( 0.53f, 0.12f, 0.47f);//Color DarkPurple
        shapeFive.glVertex3f( -2.0f, 1.0f, 1.0f ); // Top Right Of The Quad (Left)
        shapeFive.glVertex3f( -2.0f, 1.0f, -1.0f ); // Top Left Of The Quad (Left)
        shapeFive.glColor3f(0.85f,0.85f,0.95f); //Color Quartz
        shapeFive.glVertex3f( -2.0f, -1.0f, -1.0f ); // Bottom Left Of The Quad
        shapeFive.glVertex3f( -2.0f, -1.0f, 1.0f ); // Bottom Right Of The Quad 
        
        shapeFive.glColor3f( 0.53f, 0.12f, 0.47f);//Color DarkPurple
        shapeFive.glVertex3f( 2.0f, 1.0f, -1.0f ); // Top Right Of The Quad (Right)
        shapeFive.glVertex3f( 2.0f, 1.0f, 1.0f ); // Top Left Of The Quad
        shapeFive.glColor3f(0.85f,0.85f,0.95f); //Color Quartz
        shapeFive.glVertex3f( 2.0f, -1.0f, 1.0f ); // Bottom Left Of The Quad
        shapeFive.glVertex3f( 2.0f, -1.0f, -1.0f ); // Bottom Right Of The Quad
        shapeFive.glEnd(); // Done Drawing The Quad
        shapeFive.glFlush();

        //Done drawing the Quad
        shapeFive.glEnd();
        
         //Draw a third Quad
        // Move the "drawing cursor" to another position
        shapeSix.glTranslatef(3.5f, 6.0f, -6.0f);
        //Rotate the Quad
        shapeSix.glRotatef(180.0f, 2.5f, 2.0f, -6.0f);
        shapeSix.glScalef(0.8f, 0.8f, 0.8f);
        // Draw A Cube
        shapeSix.glBegin(GL.GL_QUADS);
        shapeSix.glColor3f(0.678431f,0.917647f,0.917647f); //Color Turquoise
        shapeSix.glVertex3f(1.0f, 2.0f, -1.0f); // Top Right Of The Quad (Top)
        shapeSix.glVertex3f( -1.0f, 2.0f, -1.0f); // Top Left Of The Quad (Top)
        shapeSix.glColor3f( 0.30f, 0.30f, 1.00f);//Color NeonBlue
        shapeSix.glVertex3f( -1.0f, 2.0f, 1.0f ); // Bottom Left Of The Quad (Top)
        shapeSix.glVertex3f( 1.0f, 2.0f, 1.0f ); // Bottom Right Of The Quad (Top
        
        shapeSix.glColor3f(0.678431f,0.917647f,0.917647f); //Color Turquoise
        shapeSix.glVertex3f( 1.0f, -2.0f, 1.0f ); // Top Right Of The Quad
        shapeSix.glVertex3f( -1.0f, -2.0f, 1.0f ); // Top Left Of The Quad
        shapeSix.glColor3f( 0.30f, 0.30f, 1.00f);//Color NeonBlue
        shapeSix.glVertex3f( -1.0f, -2.0f, -1.0f ); // Bottom Left Of The Quad
        shapeSix.glVertex3f( 1.0f, -2.0f, -1.0f ); // Bottom Right Of The Quad 
        
        shapeSix.glColor3f( 0.678431f,0.917647f,0.917647f); //Color Turquoise
        shapeSix.glVertex3f( 1.0f, 2.0f, 1.0f ); // Top Right Of The Quad (Front)
        shapeSix.glVertex3f( -1.0f, 2.0f, 1.0f ); // Top Left Of The Quad (Front)
        shapeSix.glColor3f(0.30f, 0.30f, 1.00f);//Color NeonBlue
        shapeSix.glVertex3f( -1.0f, -2.0f, 1.0f ); // Bottom Left Of The Quad
        shapeSix.glVertex3f( 1.0f, -2.0f, 1.0f ); // Bottom Right Of The Quad 
        
        shapeSix.glColor3f(0.30f, 0.30f, 1.00f);//Color NeonBlue
        shapeSix.glVertex3f( 1.0f, -2.0f, -1.0f ); // Bottom Left Of The Quad
        shapeSix.glVertex3f( -1.0f, -2.0f, -1.0f ); // Bottom Right Of The Quad
        shapeSix.glColor3f( 0.678431f,0.917647f,0.917647f); //Color Turquoise
        shapeSix.glVertex3f( -1.0f, 2.0f, -1.0f ); // Top Right Of The Quad (Back)
        shapeSix.glVertex3f( 1.0f, 2.0f, -1.0f ); // Top Left Of The Quad (Back)
        
        shapeSix.glColor3f( 0.678431f,0.917647f,0.917647f); //Color Turquoise
        shapeSix.glVertex3f( -1.0f, 2.0f, 1.0f ); // Top Right Of The Quad (Left)
        shapeSix.glVertex3f( -1.0f, 2.0f, -1.0f ); // Top Left Of The Quad (Left)
        shapeSix.glColor3f(0.30f, 0.30f, 1.00f);//Color NeonBlue
        shapeSix.glVertex3f( -1.0f, -2.0f, -1.0f ); // Bottom Left Of The Quad
        shapeSix.glVertex3f( -1.0f, -2.0f, 1.0f ); // Bottom Right Of The Quad 
        
        shapeSix.glColor3f( 0.678431f,0.917647f,0.917647f); //Color Turquoise
        shapeSix.glVertex3f( 1.0f, 2.0f, -1.0f ); // Top Right Of The Quad (Right)
        shapeSix.glVertex3f( 1.0f, 2.0f, 1.0f ); // Top Left Of The Quad
        shapeSix.glColor3f(0.30f, 0.30f, 1.00f);//Color NeonBlue
        shapeSix.glVertex3f( 1.0f, -2.0f, 1.0f ); // Bottom Left Of The Quad
        shapeSix.glVertex3f( 1.0f, -2.0f, -1.0f ); // Bottom Right Of The Quad
        shapeSix.glEnd(); // Done Drawing The Quad
        shapeSix.glFlush();

        //Done drawing the Quad
        shapeSix.glEnd();
        
        //Draw a Triangle Strip
        shapeSeven.glTranslatef(3.0f, 0.0f, -4.0f);
 
        shapeSeven.glBegin(GL.GL_TRIANGLE_FAN);
    
        shapeSeven.glColor3f(0.55f,0.9f, 0.9f);// Color Scarlet
        shapeSeven.glVertex3f(-1.0f, -0.5f, -1.0f);    // Point A
        shapeSeven.glColor3f(0.08f, 0.196078f, 0.6f);// Color VioletRed
        shapeSeven.glVertex3f( 1.0f, -0.5f, -1.0f);    // Point B
        shapeSeven.glColor3f( 0.309804f, 0.184314f, 0.309804f);// Color Violet
        shapeSeven.glVertex3f( 0.0f,  0.5f, -1.0f);    // Point C
        shapeSeven.glColor3f(0.35f, 0.35f, 0.67f);// Color RichBlue
        shapeSeven.glVertex3f(1.5f,  0.0f, -1.0f);     // Point D
        shapeSeven.glColor3f(0.678431f, 0.917647f, 0.917647f);// Color Turquoise
        shapeSeven.glVertex3f(2.0f, -1.5f, -1.0f);     // Point E
 
        shapeSeven.glEnd();
        shapeSeven.glFlush();
        shapeSeven.glEnd();
    }
    
    /**
     * 
     * @param drawable
     * @param modeChanged
     * @param deviceChanged 
     */
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

